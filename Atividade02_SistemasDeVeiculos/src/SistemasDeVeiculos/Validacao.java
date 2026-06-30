package SistemasDeVeiculos;

public class Validacao {


	  
	 public static void validarValorPositivo(float valor) {
	    if (valor <= 0) {
	      throw new IllegalArgumentException("O valor deve ser maior que zero!");
	        }
	    }

	    
	 public static void validarTexto(String texto) {
	    if (texto == null || texto.trim().isEmpty()) {
	       throw new IllegalArgumentException("O modelo não pode ser vazio ou nulo!");
	        }
	    }
	}

