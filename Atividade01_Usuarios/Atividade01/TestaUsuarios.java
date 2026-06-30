package Atividade01;

public class TestaUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        System.out.println("--- TESTE 1: DADOS VÁLIDOS ---");
		        try {
		            Usuario u1 = new Usuario("Vitória", "vitoria@email.com");
		            Administrador adm = new Administrador("Instrutor Gen", "gen@generation.com", "Tecnologia");
		            u1.visualizar();
		            adm.visualizar();
		        } catch (IllegalArgumentException e) {
		            System.out.println("Erro inesperado: " + e.getMessage());
		        }

		        System.out.println("\n--- TESTE 2: DADOS INVÁLIDOS (E-MAIL SEM @) ---");
		        try {
		            Usuario u2 = new Usuario("Lucas", "lucasemail.com");
		        } catch (IllegalArgumentException e) {
		            System.out.println("Sucesso no teste de erro! Capturado: " + e.getMessage());
		        }
		    }
		}

	}

}
