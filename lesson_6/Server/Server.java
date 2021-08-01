package com.company.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private Socket client;

    public Server() {
        init();
        communicate();
        System.out.println("Closing the connection...");
        System.out.println("Shutting down...");
        System.out.println("STATUS OK.");
    }

    private void init() {
        try {
            ServerSocket socket = new ServerSocket(9005);
            System.out.println("Socket created...");
            System.out.println("Waiting for a connection...");
            client = socket.accept();
            System.out.println("Client connected...");
            System.out.println(client);
            System.out.println("STATUS OK.");
        } catch (IOException e) {
            System.out.println("STATUS NOK.");
            e.printStackTrace();
        }
    }

    private void communicate() {
            try {
                DataInputStream in = new DataInputStream(client.getInputStream());
                DataOutputStream out = new DataOutputStream(client.getOutputStream());
                Scanner scannerServer = new Scanner(System.in);


                while (true) {
//                    String outServerMessage = scannerServer.nextLine();
//                    out.writeUTF("Server :" + outServerMessage);
                    String inboundMessage = in.readUTF();

                    if (inboundMessage.equals("-exit")) {
                        out.writeUTF("ECHO: Good bye!");
                        out.writeUTF("-end");
                        break;
                    }

                    out.writeUTF("ECHO: " + inboundMessage);
                    String outServerMessage = scannerServer.nextLine();
                    out.writeUTF("Server :" + outServerMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();

        }
    }
}