package Exercicio05;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private boolean flag;
	
	public Data(int dia, int mes, int ano) {
		setData(dia, mes, ano);
	}
	
	public Data() {
		this(1, 1, 1900);
	}
	
	public void setData(int dia, int mes, int ano) {
		boolean result = false;
		
		if((ano >= 1900) && (ano <= 2015)){
			if((mes >= 1) && (mes <= 12)){
				if((dia >= 1) && (dia <= 31)){
					this.ano = ano;
					this.mes = mes;
					switch(mes){
						case 1:
						case 3:
						case 5:
						case 7:
						case 8:
						case 10:
						case 12:{
							this.dia = dia;
							result = true;
							break;
						}
						case 2:{
							if(dia <= 28){
								this.dia = dia;
								result = true;
							}
							break;
						}
						case 4:
						case 6:
						case 9:
						case 11:{
							if(dia <= 30){
								this.dia = dia;
								result = true;
							}
							break;
						}
					}
				}
			}
		}
		
		if(result)
			this.flag = true;
		else
			this.flag = false;
	}
	
	public String toString() {
		if(this.flag)
			return String.format("%02d/%02d/%04d", dia, mes, ano);
		else
			return "DATA INVÁLIDA!";
	}
}
