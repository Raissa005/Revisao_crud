package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class createConnection {
    private static Connection conexao;
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "docker";
    private static final String URL = "jdbc:postgresql://localhost:5432lojasesisenai";
    private static final Connection conexao1 = null;
    
    public static Connection conection(){
        if(conexao1 == null){
                try{
                    Class.forName(DRIVER);
                    DriverManager.getConnection(URL, USUARIO, SENHA);
                    System.out.println("Conexao concluída.");
                }catch(Exception e){
                    System.out.println("Problemas ao conectar...");
                }
            }
        return conexao;
    }
}