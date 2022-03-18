package dioVariables;

public class Main {

	public static void main(String[] args) {
		
		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 10;
		int s2 = 22222222;
		
		//float f1 = 4.5;
		
		double d1 = 4.5;
		
		
		char c1 = 'w';
		//char c2 = 'zz';
		
		String st1 = "Sergio";
		
		boolean b = false;
		
		int k = 5;
		int i = ++k;
		
		//System.out.println (i);
		System.out.println ("Aritmetico");
		//aritmetico();
		numeroValido(1);
		//numeroValido(0);
			
	}
	
	private static void numeroValido(int numero) {
		if (numero > 0) {
			System.out.println ("numero:" + numero + " Numero válido");
			aritmetico(numero);
		} 
		
		else {
			System.out.println ("numero:" + numero + " Numero inválido");
		}
	}
		

	private static void aritmetico(int i) {
		
		System.out.println ("i:" + i);
		//int i = 2;
		int k = ++i;
		int j = k + 1;
						
		System.out.println ("k:" + k);
		System.out.println ("j:" + j);
			
	}

}
