package com.company.Server;

import com.company.Client.Client;
public class Main {
    public static void main(String[] args) {
        /** Lambda Method Reference */
        new Thread(Server::new).start();

    }

}