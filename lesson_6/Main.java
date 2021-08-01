package com.company;

import com.company.Client.Client;
import com.company.Server.Server;

public class Main {
    public static void main(String[] args) {
        /** Lambda Method Reference */
        new Thread(Server::new).start();
        /** Basic lambda */
        new Thread(() -> new Client()).start();
    }

}
