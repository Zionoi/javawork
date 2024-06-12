package 끝말잇기;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerProgram2 {

    public static void main(String[] args) {
        int port = 9990;

        // GUI 초기화
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("끝말잇기 서버");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 300));

                JLabel label = new JLabel("서버와 통신 상태", SwingConstants.LEFT);
                JTextField textField = new JTextField(20);
                JButton button = new JButton("Submit");
                JTextArea textArea = new JTextArea();
                textArea.setEditable(false);

                // JPanel to hold the text field and button
                JPanel panel = new JPanel();
                panel.add(textField);
                panel.add(button);

                // Add components to the frame
                frame.getContentPane().add(label, BorderLayout.NORTH);
                frame.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
                frame.getContentPane().add(panel, BorderLayout.SOUTH);

                // Center the frame on the screen
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width / 2 - 400 / 2, dim.height / 2 - 300 / 2);

                frame.pack();
                frame.setVisible(true);

                // 서버와의 통신을 별도의 스레드에서 처리
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try (ServerSocket server = new ServerSocket(port)) {
                            textArea.append("클라이언트의 요청을 기다리고 있음... 로딩중...\n");
                            Socket socket = server.accept(); // 수락시 accept(); 메소드 사용
                            textArea.append(socket.getInetAddress().getHostAddress() + "가 연결요청 함\n");

                            try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                                 PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
                                
                                pw.println("환영합니다 😊😊😊😊😊😊🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔");
                                pw.flush(); // 버퍼에 쌓아두지않고 바로 보냄

                                button.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String sendMsg = textField.getText();
                                        pw.println(sendMsg);
                                        pw.flush();
                                        textField.setText("");
                                    }
                                });

                                String msg = null;
                                while ((msg = br.readLine()) != null) {
                                    if (msg.equals("exit")) {
                                        textArea.append("채팅을 종료합니다\n");
                                        break;
                                    }

                                    textArea.append("클라이언트: " + msg + "\n"); // 클라이언트로부터 받은 메시지 출력
//                                    char lastChar = msg.charAt(msg.length() - 1); // 마지막 문자 추출
//                                    textArea.append(lastChar + " 으로 시작하는 단어는?\n");
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }
}
