package Atividade01;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        Validacao.validarTexto(nome, "Nome");
        Validacao.validarEmail(email);
        this.nome = nome;
        this.email = email;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { 
        Validacao.validarTexto(nome, "Nome");
        this.nome = nome; 
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { 
        Validacao.validarEmail(email);
        this.email = email; 
    }

    public void visualizar() {
        System.out.println("Usuário: " + this.nome + " | Email: " + this.email);
    }
}


