package server;

import GUI.EnviarArchivos;
import java.net.*;
import java.io.*;
import java.util.*;

public class Server {

    public static void main(String[] args) throws IOException {
        EnviarArchivos ea = new EnviarArchivos();
        ea.setVisible(true);
        ServerThread hilo = new ServerThread(4400);
        int id = 0;
        while (true) {
            try {
                hilo.iniciarServidor(id);
                Thread.sleep(2000);
                id++;

            } catch (Exception e) {

            }
        }
    }

}
