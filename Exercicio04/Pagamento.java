package Exercicio04;

public abstract class Pagamento {
	
	private static boolean isDigit (char caracter) {
		if((caracter >= '0') && (caracter <= '9'))
			return true;
		else
			return false;
	}
	
	public static int decifrar (String entrada) {
		int result = 0, aux = 0;
		
		if(entrada.length() > 0){
			for (int i = 0; i < entrada.length(); i++) {
				if(isDigit(entrada.charAt(i))){
					aux += ((int) entrada.charAt(i)) - 48; //48 é o código do 0 "zero" na tabela ASCII
					//System.out.println("isDigit if(1): " + entrada.charAt(i));
					if(((i + 1) < entrada.length()) && isDigit(entrada.charAt(i+1))){
						//System.out.println("isDigit if(2): " + entrada.charAt(i+1));
						aux *= 10;
					}
					else{
						//System.out.println("AUX: " + aux);
						result += aux;
						aux = 0;
					}
				}
			}
		}
		
		return result;
	}
	
}
