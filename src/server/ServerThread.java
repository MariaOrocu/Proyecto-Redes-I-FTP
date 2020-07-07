/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ServerThread implements Runnable {

    private ServerSocket server = null;

    public ServerThread(int puerto) throws IOException {

        server = new ServerSocket(puerto);

        System.out.println("Esperando recepcion de archivos...");
    }

    public void iniciarServidor() {
        while (true) {

            try {
                // Creamos el socket que atendera el servidor
                Socket cliente = server.accept();
                String ruta = "c:\\redes\\";
                // Creamos flujo de entrada para leer los datos que envia el cliente
                DataInputStream dis = new DataInputStream(cliente.getInputStream());

                // Obtenemos el nombre del archivo
                String nombreArchivo = dis.readUTF();
                System.out.println("ver " + nombreArchivo.toString());
                int tam = dis.readInt();
                String nombreUsuario = dis.readUTF();
                ruta += nombreUsuario + "\\";
                File directorio = new File(ruta);
                directorio.mkdir();
                FileOutputStream fos = new FileOutputStream(ruta + nombreArchivo);
                BufferedOutputStream out = new BufferedOutputStream(fos);
                BufferedInputStream in = new BufferedInputStream(cliente.getInputStream());

                byte[] buff = new byte[tam];

                // Obtenemos el archivo mediante la lectura de bytes enviados
                for (int i = 0; i < buff.length; i++) {
                    buff[i] = (byte) in.read();
                }
                out.write(buff);

                // Cerramos flujos
                out.flush();
                in.close();
                out.close();
                cliente.close();

                System.out.println("Archivo guardado"
                        + " " + nombreArchivo);

            } catch (Exception e) {
                System.out.println("Recibir: " + e.toString());
            }
        }
    }

    @Override
    public void run() {
        //
    }
}
