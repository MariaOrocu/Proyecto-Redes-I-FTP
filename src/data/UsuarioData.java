/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static data.ConexionMysql.getConnection;
import domain.Usuario;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class UsuarioData extends ConexionMysql {

    public boolean registra(Usuario usr) {

        PreparedStatement ps = null;
        Connection cn = getConnection();

        String query = "insert ignore into usuario_ftp (nombre_usuario, contrasenna, carpeta) values (?,?,?)";
        try {
            ps = cn.prepareStatement(query);
            ps.setString(1, usr.getNombreUsuario());
            ps.setString(2, usr.getContrasenna());
            ps.setString(3, usr.getCarpeta());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean login(Usuario usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT nombre_usuario, contrasenna FROM usuario_ftp WHERE nombre_usuario = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, usr.getNombreUsuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (usr.getContrasenna().equals(rs.getString(2))) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<String> llenarUsuarios() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        ArrayList<String> datos = new ArrayList<String>();
        String query = "select * from usuario_ftp";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }

    public static DefaultListModel llenarArchivos(String nombre) {
        DefaultListModel modelo = new DefaultListModel();
        File folder = new File("c:\\redes\\" + nombre + "\\");
        File[] listaFolder = folder.listFiles();
        if (listaFolder != null) {
            for (int i = 0; i < listaFolder.length; i++) {
                modelo.addElement(listaFolder[i].getName());
            }
        } else {
            modelo.addElement("El Usuario " + nombre + " no tiene archivos");
        }
        return modelo;
    }
}
