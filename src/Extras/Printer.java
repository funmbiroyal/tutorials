package Extras;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Printer {
    public static void main(String[] args) {
        try
        {
            Socket socket=new Socket("localhost",8000);
            DataOutputStream data=new DataOutputStream(socket.getOutputStream());
            data.writeBytes("hello server");
            socket.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

