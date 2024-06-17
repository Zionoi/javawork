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
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;
import javax.swing.text.*;

public class ServerProgram3 {

    public static void main(String[] args) {
        int port = 9990; // 서버 포트 번호 설정

        // GUI 초기화
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("John chat"); // JFrame 생성 및 타이틀 설정
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
                frame.setPreferredSize(new Dimension(400, 300)); // 기본 프레임 크기 설정

                JLabel label = new JLabel("서버와 통신 상태", SwingConstants.LEFT); // 서버 상태를 표시할 레이블
                JTextArea inputArea = new JTextArea(3, 20); // 입력 필드를 JTextField 대신 JTextArea로 변경 줄바꿈 및 여러줄 입력을 하기 위함
                inputArea.setLineWrap(true);
                inputArea.setWrapStyleWord(true);
                JScrollPane inputScrollPane = new JScrollPane(inputArea); // JTextArea를 JScrollPane에 추가하여 스크롤 가능하게 함
                JButton button = new JButton("전송"); // 전송 버튼 생성
                JTextPane textPane = new JTextPane(); // 메시지 로그를 출력할 JTextPane
                textPane.setEditable(false); // 메시지 로그는 편집 불가
                DefaultCaret caret = (DefaultCaret) textPane.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE); // 메시지로그 자동 스크롤을 위한 설정

                // JPanel에 입력 필드와 버튼 추가
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(inputScrollPane, BorderLayout.CENTER); // JScrollPane을 패널에 추가
                panel.add(button, BorderLayout.EAST);

                // 프레임에 컴포넌트 추가
                frame.getContentPane().add(label, BorderLayout.NORTH); // 레이블을 프레임 상단에 추가
                frame.getContentPane().add(new JScrollPane(textPane), BorderLayout.CENTER); // 메시지 로그를 중앙에 추가
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
						try (ServerSocket server = new ServerSocket(port/*, 0, InetAddress.getByName("0.0.0.0")*/)) { // 모든 IP 주소에서 접근 허용
                            appendToPane(textPane, "클라이언트의 요청을 기다리고 있음... 로딩중...\n", false);
                            Socket socket = server.accept(); // 클라이언트 연결 요청 수락
                            appendToPane(textPane, socket.getInetAddress().getHostAddress() + "가 연결요청 함\n", false);

                            try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                                 PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)) { // 입력 및 출력 스트림 설정
                                
                                pw.println("환영합니다 😊😊😊😊😊😊🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔"); // 클라이언트에게 환영 메시지 전송

                                button.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        sendMessage(pw, inputArea, textPane); // 버튼 클릭 시 메시지 전송
                                    }
                                });

                                inputArea.addKeyListener(new KeyAdapter() {
                                    @Override
                                    public void keyPressed(KeyEvent e) {
                                        if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isAltDown()) {
                                            inputArea.append("\n"); // Alt + Enter 키 입력 시 줄 바꿈 추가
                                        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                            sendMessage(pw, inputArea, textPane); // Enter 키 입력 시 메시지 전송
                                            e.consume(); // Enter 키 이벤트 소비
                                        }
                                    }
                                });

                                String msg = null;
                                while ((msg = br.readLine()) != null) { // 클라이언트로부터 메시지 수신
                                    if (msg.equalsIgnoreCase("exit")) { // 'exit' 메시지 수신 시 연결 종료
                                        appendToPane(textPane, "채팅을 종료합니다\n", false);
                                        break;
                                    }

                                    appendToPane(textPane, "클라이언트: " + msg + "\n", false); // 클라이언트로부터 받은 메시지 출력
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
                        }
                    }
                }).start(); // 통신 스레드 시작
            }
        });
    }

    // 메시지 전송 메소드
    private static void sendMessage(PrintWriter pw, JTextArea inputArea, JTextPane textPane) {
        String sendMsg = inputArea.getText().trim(); // 입력 필드에서 메시지 가져오기
        if (!sendMsg.isEmpty()) {
            pw.println(sendMsg); // 클라이언트에게 메시지 전송
            appendToPane(textPane, sendMsg + "  \n", true); // 자신의 채팅창에도 메시지 추가
            inputArea.setText(""); // 메시지 전송 후 입력 필드 비움
        }
    }

    // JTextPane에 텍스트 추가 메소드
    private static void appendToPane(JTextPane tp, String msg, boolean isRight) {
        SimpleAttributeSet set = new SimpleAttributeSet();
        StyleConstants.setAlignment(set, isRight ? StyleConstants.ALIGN_RIGHT : StyleConstants.ALIGN_LEFT);
        StyleConstants.setForeground(set, isRight ? Color.BLUE : Color.BLACK);
        
        // Create a separate document for each message to ensure correct alignment
        StyledDocument doc = tp.getStyledDocument();
        int length = doc.getLength();
        try {
            doc.insertString(length, msg, set);
            doc.setParagraphAttributes(length, msg.length(), set, false);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
