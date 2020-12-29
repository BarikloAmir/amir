package MultiThreadServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket client = new Socket("127.0.0.1", 7660)) {
            System.out.println("Connected to server.");
            OutputStream out = client.getOutputStream();
            InputStream in = client.getInputStream();
            byte[] buffer = new byte[2048];

            while (true){
                String messages = scanner.nextLine();

                out.write(messages.getBytes());
                System.out.println("SENT: " + messages);
                if(messages.equals("over"))
                    break;
                int read = in.read(buffer);
                System.out.println("RECV: " + new String(buffer, 0, read));
            }
            System.out.print("All messages sent.\nClosing ... ");
        } catch (IOException ex) {
            System.err.println(ex);
        }
        System.out.println("done.");
    }
}
