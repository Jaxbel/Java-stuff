package com.alura.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_de_stock", "root", "password");
            System.out.println("Connection is successful !!!!!");
        } catch(Exception e) {
            e.printStackTrace();
        }
        con.close();
        System.out.println("cerrando conexionama");

    }
}
