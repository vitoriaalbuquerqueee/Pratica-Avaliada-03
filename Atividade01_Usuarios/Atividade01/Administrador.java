package Atividade01;

public class Administrador extends Usuario {
    private String departamento;

    public Administrador(String nome, String email, String departamento) {
        super(nome, email);
        Validacao.validarTexto(departamento, "Departamento");
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { 
        Validacao.validarTexto(departamento, "Departamento");
        this.departamento = departamento; 
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Departamento: " + this.departamento);
    }

}
