package 끝말잇기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class ClientProgram3 {

    public static void main(String[] args) {
        // 서버의 도메인 이름 또는 IP 주소 설정
        String serverIp = "192.168.50.10"; // 수동으로 IP 주소 설정
        int port = 9990; // ServerProgram에서 지정한 포트번호 그대로 가져옴

        // GUI 초기화
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("John Chat"); // JFrame 생성 및 타이틀 설정
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
                frame.setPreferredSize(new Dimension(400, 300)); // 기본 프레임 크기 설정

                JLabel label = new JLabel("서버와 통신 상태", SwingConstants.LEFT); // 서버 상태를 표시할 레이블 생성
                JTextArea inputArea = new JTextArea(3, 20); // 입력을 위한 JTextArea 생성
                inputArea.setLineWrap(true); // 텍스트가 자동으로 줄 바꿈되도록 설정
                inputArea.setWrapStyleWord(true); // 단어 단위로 줄 바꿈되도록 설정
                JButton button = new JButton("전송"); // 전송 버튼 생성
                JTextPane textPane = new JTextPane(); // 채팅 로그를 출력할 JTextPane 생성
                textPane.setEditable(false); // 채팅 로그는 편집 불가로 설정

                // 입력 필드와 버튼을 담을 JPanel 생성
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(new JScrollPane(inputArea), BorderLayout.CENTER); // 입력 필드를 스크롤 가능한 형태로 패널에 추가
                panel.add(button, BorderLayout.EAST); // 버튼을 패널의 오른쪽에 추가

                // 컴포넌트를 프레임에 추가
                frame.getContentPane().add(label, BorderLayout.NORTH); // 레이블을 프레임 상단에 추가
                frame.getContentPane().add(new JScrollPane(textPane), BorderLayout.CENTER); // 채팅 로그를 중앙에 추가
                frame.getContentPane().add(panel, BorderLayout.SOUTH); // 입력 패널을 하단에 추가

                // 프레임을 화면 중앙에 위치시키기
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width / 2 - 400 / 2, dim.height / 2 - 300 / 2);

                frame.pack(); // 프레임 크기를 컴포넌트에 맞게 조정
                frame.setVisible(true); // 프레임을 화면에 표시

                // 서버와의 통신을 별도의 스레드에서 처리
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            try (Socket socket = new Socket(serverIp, port); // 서버에 연결 요청
                                 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 입력 스트림 생성
                                 PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)) { // 출력 스트림 생성 및 자동 플러시 설정

                                appendToPane(textPane, "서버: " + br.readLine() + "\n", false); // 서버의 초기 메시지 수신 및 출력

                                // 버튼 클릭 이벤트 리스너 추가
                                button.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        sendMessage(pw, inputArea, textPane); // 버튼 클릭 시 메시지 전송
                                    }
                                });

                                // 입력 필드의 키 이벤트 처리
                                inputArea.addKeyListener(new KeyAdapter() {
                                    @Override
                                    public void keyPressed(KeyEvent e) {
                                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                            if (e.isAltDown()) {
                                                inputArea.append("\n"); // Alt + Enter 키 입력 시 줄 바꿈 추가
                                            } else {
                                                sendMessage(pw, inputArea, textPane); // Enter 키 입력 시 메시지 전송
                                                e.consume(); // 엔터키 이벤트 소비하여 새 줄 생성 방지
                                            }
                                        }
                                    }
                                });

                                // 서버로부터의 메시지 수신 및 처리
                                while (true) {
                                    String serverMsg = br.readLine(); // 서버로부터 메시지 수신
                                    if (serverMsg != null) {
                                        appendToPane(textPane, "서버: " + serverMsg + "\n", false); // 서버 메시지를 왼쪽에 출력
                                        if (serverMsg.equalsIgnoreCase("exit")) { // 'exit' 메시지 수신 시 연결 종료
                                            break;
                                        }
                                    } else {
                                        break; // 서버로부터 null 메시지를 받으면 연결 종료
                                    }
                                }
                                appendToPane(textPane, "서버와 연결 해제됨\n", false); // 연결 종료 메시지 출력
                            }
                        } catch (UnknownHostException e) {
                            appendToPane(textPane, "알 수 없는 호스트: " + e.getMessage() + "\n", false); // 오류 메시지 출력
                        } catch (IOException e) {
                            appendToPane(textPane, "I/O 오류: " + e.getMessage() + "\n", false); // 오류 메시지 출력
                        }
                    }
                }).start();
            }
        });
    }

    // 메시지 전송 메소드
    private static void sendMessage(PrintWriter pw, JTextArea inputArea, JTextPane textPane) {
        String sendMsg = inputArea.getText().trim(); // 입력 필드에서 메시지 가져오기
        if (!sendMsg.isEmpty()) {
            pw.println(sendMsg); // 클라이언트에게 메시지 전송
            appendToPane(textPane, sendMsg + "  \n", true); // 본인 메시지를 오른쪽에 정렬
            inputArea.setText(""); // 메시지 전송 후 입력 필드 비움
        }
    }

    // JTextPane에 텍스트 추가 메소드
    private static void appendToPane(JTextPane tp, String msg, boolean isRight) {
        SimpleAttributeSet set = new SimpleAttributeSet();
        StyleConstants.setAlignment(set, isRight ? StyleConstants.ALIGN_RIGHT : StyleConstants.ALIGN_LEFT); // 텍스트 정렬 설정
        StyleConstants.setForeground(set, isRight ? Color.BLUE : Color.BLACK); // 텍스트 색상 설정

        StyledDocument doc = tp.getStyledDocument();
        try {
            int length = doc.getLength(); // 현재 문서의 길이 가져오기
            doc.insertString(length, msg, set); // 문서의 끝에 메시지 추가
            doc.setParagraphAttributes(length, msg.length(), set, false); // 문단 속성 설정
        } catch (BadLocationException e) {
            e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
        }
    }
}
