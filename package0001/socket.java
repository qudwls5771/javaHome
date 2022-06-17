import java.io.IOException;
import java.net.Socket;

public class socket {

    public static void main(String[] args){
        try {
			Socket socket = new Socket("121.999.999.99", 1234); // 소켓 서버에 접속 
			System.out.println("socket 서버에 접속 성공!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
