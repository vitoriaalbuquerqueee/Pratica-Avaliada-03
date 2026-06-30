package SistemasDeVeiculos;

public class CarroEletrico extends Carro {


	public static final int CONSUMO_POR_ACELERACAO  = 2;
			
	protected float nivelBateria;
	
	public CarroEletrico(String modelo, float velocidade, float nivelBateria) {
		 super(modelo, velocidade);
		 
	
			this.nivelBateria =nivelBateria;
			
			}
			public float getnivelBateria ( ){
				return nivelBateria;
				}
				
			public void setnivelBateria( float nivelBateria){
				this.nivelBateria = nivelBateria;
				}
				

			public void visualizar() {
				super.visualizar();
				System.out.println("Nível da bateria: " + this.nivelBateria + "%");
		
				}
				
			public void acelerar(float valor) {
			
			    Validacao.validarValorPositivo(valor);

			 
			    float consumo = valor * CONSUMO_POR_ACELERACAO;

			
			    if (this.nivelBateria < consumo) {
			        throw new IllegalArgumentException("Bateria insuficiente para acelerar!");
			    }

			
			    this.nivelBateria -= consumo;
			    this.velocidade += valor;
			}
}
