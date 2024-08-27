/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tesconnecttcpip;

/**
 *
 * @author Michelle Angelina
 */

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TesConnectTcpip {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 1001;

        try (Socket socket = new Socket(serverAddress, port);
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {

            // Jika koneksi berhasil, print output "Berhasil terkoneksi" pada Java
            System.out.println("Berhasil terkoneksi");

            // Tes koneksi ke Hercules
            String message = "Tes, Netbeans to Hercules";
            out.println(message);
            System.out.println("Message sent to server: " + message);

        } catch (IOException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}

