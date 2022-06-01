package Aplication;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// try catch testa  se á alguma exceção no codgo 
		try {
			// atribicao  " = "
			 int valor  =  2 ; 
			 float pi = 3.14f ; 
			 String texto = "hello word "; 
			 valor = 5 ; 
			
			 
			 //Operadores aritméticos + - * / % 
			 int Multiplicar  = 2 * 2;
			 int Somar = 2 + 2; 
			 int Subtrair = 2 - 2; 
			 int Dividir = 2 / 2 ; 
			 int RestoDaDivisao = 2 % 2 ; 
			 
			 // Operadores de incremento e decremento ++ -- 
			 
			 int Incremento = 5 ; 
			 	Incremento  += Incremento++ ; 
			 int Decremento = 5 ; 
			 	Decremento -=Decremento-- ; 
			 
			 //Operadores de igualdade e Diferente 
			 	int valorA = 3 , valorB = 7 ; 
			 	
			 	if ( valorA == valorB) {
			 		System.out.println("Valores Iguais ");
			 	}else if (valorA != valorB ) {
			 		System.out.println("Valores diferentes  ");
			 	}
			 // Operadores relacionais
			 	int menor = 1;
			 	int maior = 2;

			 	if (menor > maior) {
			 	                System.out.println("maior");
			 	}

			 	if (menor >= maior) {
			 	                System.out.println("maior ou igual");
			 	}

			 	if (menor < maior) {
			 	                System.out.println("menor");
			 	}

			 	if (menor <= maior) {
			 	                System.out.println("menor ou igual");
			 	}
			 	
			 	
			// Operadores lógicos [&&] [ || ]  
			 	if ( 1 == (2 - 1 ) && 2 == (1+1) ) {
			 		//verifica se ambas condiçoes sao verdadiras 
			 		System.out.println("verdadeiro");
			 	}else {
			 		System.out.println("False");
			 	}
			 	 if (1 == (2 - 5 ) || 2 == (1+1)) {
			 		 // verifica se uma das condições são verdairas  
			 		 System.out.println("Verdadeiro");
			 	 }else {
			 		 System.out.println("False");
			 	 }
			 	
			 	
			 	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
