package Exercicio03;

public class FabricaDeCarro {

	private String nomeFabrica;
	
	private FabricaDeCarro instance;
	
	private FabricaDeCarro() {
		this.nomeFabrica = "FERRARI"; 
	}
	
	private void initInstance() {
		if(this.instance == null){
			this.instance = new FabricaDeCarro();
		}
	}
	
	public FabricaDeCarro getInstance() {
		if(this.instance == null){
			initInstance();
		}
		return this.instance;
	}

	public String getNomeFabrica() {
		return this.nomeFabrica;
	}

}
