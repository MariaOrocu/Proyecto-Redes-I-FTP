package main;

import GUI.Login;
import data.UsuarioData;
import java.io.*;
import java.net.*;
import server.ejemploVarios;

public class FTPServer {

    public static void main(String[] args) throws Exception {
        Login login = new Login();
        login.setVisible(true);

        //FileInputStream fis = new FileInputStream();
        //UsuarioData data = new UsuarioData();
        //data.copiarAchivos("Antonio", "", "");
        ejemploVarios varios = new ejemploVarios();
        //String guarda = varios.cifrar("Key", "1234");
        //System.out.println("encriptado texto:" + varios.cifrar("Key", "1234") + ",fin");
        //System.out.println("desencriptado texto: " + varios.descifrar("Key", guarda));
        //varios.enviarEjemplos("Antonio");
        //varios.recibirAhi();
    }

}
