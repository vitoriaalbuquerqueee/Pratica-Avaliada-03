package SistemasDeVeiculos;

public class TestaVeiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("--- TESTE 1: CENÁRIO VÁLIDO ---");
        try {
          
            CarroEletrico meuCarro = new CarroEletrico("BYD", 1, 100);
            meuCarro.visualizar();
            
            System.out.println("\n> Acelerando 20km/h...");
            meuCarro.acelerar(20); 
            meuCarro.visualizar();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro inesperado no teste valido: " + e.getMessage());
        }

        System.out.println("\n--- TESTE 2: CENÁRIO INVALIDO (BATERIA INSUFICIENTE) ---");
        try {
            CarroEletrico carroSemBateria = new CarroEletrico("GWM Ora 03", 0, 10);
            carroSemBateria.visualizar();
            
            System.out.println("\n> Tentando acelerar 30km/h (Precisa de 60% de bateria, mas so tem 10%)...");
            carroSemBateria.acelerar(30); 
            
        } catch (IllegalArgumentException e) {

            System.out.println("Sucesso em teste de erro! Capturado: " + e.getMessage());
        }
    }

		
		
	}


