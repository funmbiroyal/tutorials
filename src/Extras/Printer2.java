package Extras;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Printer2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(20);
            System.out.println("server is started......");
            Socket s = ss.accept();  //establishing connection  and waits for the client.
            System.out.println(s);
            //DataInputStream class is to create an input stream to receive a response from the client.
            DataInputStream ds = new DataInputStream(s.getInputStream());
            String msg = (String) ds.readUTF();
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}