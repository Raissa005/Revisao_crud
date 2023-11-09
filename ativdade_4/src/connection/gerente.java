package connection;

import java.util.UUID;

public class gerente {
    private UUID id;
    private String nome;
    private String email;
    private String senha;

    public gerente(String nome, String email, String senha) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }// para criar o gerente

    public gerente(UUID id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }// para conectar ao banco de dados

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
}
