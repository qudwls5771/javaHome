import java.net.ServerSocket;

import java.io.IOException;
import java.net.ServerSocket;;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            int socket = 1234;
            ServerSocket severSocket = new ServerSocket();
            System.out.println("Socket : " + socket + "으로 서버가 열렸습다.");

        } catch (Exception e) {

        }

    }

}
