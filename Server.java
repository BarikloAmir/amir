package SingleThreadServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (ServerSocket welcomingSocket = new ServerSocket(7657)) {
            System.out.print("Server started.\nWaiting for a client ... ");
            try (Socket connectionSocket = welcomingSocket.accept()) {
                System.out.println("client accepted!");
                OutputStream out = connectionSocket.getOutputStream();
                InputStream in = connectionSocket.getInputStream();
                byte[] buffer = new byte[2048];
                String messages = new String();
                while (true) {

                    int read = in.read(buffer);
                    System.out.println("RECV: " + new String(buffer, 0, read));
                    String newMessage = new String(buffer,0,read);
                    if(newMessage.equals("over"))
                        break;
                    else
                        messages += newMessage;
                    out.write(messages.getBytes());
                    System.out.println("SENT: " + messages);
                }
                System.out.print("All messages saved and sent.\nClosing client ... ");
            } catch (IOException ex) {
                System.err.println(ex);
            }
            System.out.print("done.\nClosing server ... ");
        } catch (IOException ex) {
            System.err.println(ex);
        }
        System.out.println("done.");
    }
}