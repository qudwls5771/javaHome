import java.net.ServerSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args){
        try {
<<<<<<< Updated upstream
            int socket = 1234;
            ServerSocket severSocket = new ServerSocket(socket);
            System.out.println("Socket : " + socket + "으로 서버가 열렸습다.");
=======
            int socketPort = 1234;
            ServerSocket severSocket = new ServerSocket("1");
            System.out.println("Socket : " + socketPort  + "으로 서버가 열렸습다.");
>>>>>>> Stashed changes


            //소켓이 서버가 종료 될때까지 반복
            while(true){
                // 소켓 서버로 접속시 socketUser에 접속자 정보 할당
                Socket socketUser = severSocket.accept(); 
                //접속자 getLocalAddress를 가져온다.
                System.out.println("Client가 접속함 : " + socketUser.getLocalAddress());


            }
        } catch (IOException e) {
            System.out.println(e + "접속장애");
            e.printStackTrace();
        }

    }

}
