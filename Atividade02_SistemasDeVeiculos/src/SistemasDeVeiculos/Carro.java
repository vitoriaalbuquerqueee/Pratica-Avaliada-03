package SistemasDeVeiculos;

public class Carro {

	
	
	protected String modelo;
	 protected float velocidade;
	 
	 public Carro(String modelo, float velocidade) {
		    Validacao.validarTexto(modelo); 
		    Validacao.validarValorPositivo(velocidade); 
		    this.modelo = modelo;
		    this.velocidade = velocidade;
		}

				

				public String getModelo ( ){
					return modelo;
				}
				
				public void setModelo( String modelo){
					 Validacao.validarTexto(modelo); this.modelo = modelo;
				}
				public float getVelocidade ( ){
					return velocidade;
				}
				
				public void setVelocidade( float velocidade){
					 Validacao.validarValorPositivo(velocidade); this.velocidade = velocidade;
				}

		 
			public void visualizar() {

				String tipo = "";
				
			
				
				System.out.println("\n\n***********************************************************");
				System.out.println("Modelo do carro: " + this.modelo);
				System.out.println("***********************************************************");
				System.out.println("Velocidade media do Automovel: " + this.velocidade);
				

			}
	 
	 
	 
	 
	 
}
