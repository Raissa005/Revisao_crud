package DAO;

import connection.gerente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.UUID;
import javax.swing.JOptionPane;

public class gerenteDAO {
    
    public gerente buscarGerenteporEmail(String email){
        String sql = "SELCT * FROM gerente WHERE email = ?";
        try (PreparedStatement stmt = connection.createConnection.conection().prepareStatement(sql)){
          stmt.setString(1, email);
          ResultSet result = stmt.executeQuery();
          
          if(result.next()){
              UUID id = result.getObject("id", UUID.class);
              String nome = result.getString("nome");
              String emailRetorno = result.getString("email");
              String senha = result.getString("senha");
              gerente gerente = new gerente(id, nome, email, senha);
              return gerente;
          }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao buscar");
        }
        return null;
    }
}
