/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.Practica_Test.DataBase;

/**
 *
 * @author Oscar
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;
    
    public Conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techshop?usetimezone=true&serverTimezone=UTC","usuario_prueba","Usuar1o_Clave.");            
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public Connection getConnection()
    {
        return con;        
    }
}
