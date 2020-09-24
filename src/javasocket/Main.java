package javasocket;
import java.io.IOException;
import java.net.*;
import java.io.*;
public class Main {
    public static void main(String [] args) throws IOException {
        GreetingServer myS=new GreetingServer();
        myS.run();

    }
}
