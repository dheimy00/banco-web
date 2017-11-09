package br.com.banco.fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class FabricaConexao {
 
    private static String url = "jdbc:postgresql://localhost:5432/Supera";
    private static String usuario = "postgres";
    private static String senha = "lond8541";
 
    public static Connection getConexao() {
 
        try {
            Class.forName("org.postgresql.Driver");
             
            return DriverManager.getConnection(url, usuario, senha);
             
        } catch (Exception e) {
             
            System.out.println("--------Erro ao conectar-------------");
             
            return null;
             
        } 
 
    }
     
    public static void main(String[] args) {
         
        getConexao();
         
    }
 
}