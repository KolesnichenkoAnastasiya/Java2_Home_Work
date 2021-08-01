package com.company.Client;

import com.company.Server.Server;
public class Main {
    public static void main(String[] args) {
               /** Basic lambda */
        new Thread(() -> new Client()).start();
    }

}