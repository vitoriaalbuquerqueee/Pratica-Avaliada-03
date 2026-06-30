package Atividade01;

public class Validacao {
    public static void validarTexto(String texto, String campo) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("O campo " + campo + " não pode ser vazio!");
        }
    }

    public static void validarEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("O e-mail digitado é inválido!");
        }
    }
}
