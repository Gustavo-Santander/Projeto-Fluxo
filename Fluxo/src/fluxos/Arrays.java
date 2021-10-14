package fluxos;

public class Arrays {

	public static void main(String[] args) {

		int[] notas;
		int notas2[] = new int[100];

		int valores[] = { 1, 2, 3, 4, 5, 6 };
		
		int numeros[][] = {{1,2,3,4},{5,6,7,8}};
		int numeros2[][] = new int[2][4];
		
		for (int i = 0; i < notas2.length; i++) {
			 
			notas2[i] = 1;
			
		}
		for (int i = 0; i < notas2.length; i++) {
			 
			System.out.println(notas2[i]);
			
		}
		/*Popular linha e coluna
		 * 
		 */
		for(int linha = 0; linha < numeros2.length; linha++) {
		
			for(int col = 0; col < numeros2.length; col++) {
				
				numeros2[linha][col] = col +1;
				
			}
		}
			/*
			 *Imprimir linha e coluna  
			 */
			for(int linha = 0; linha < numeros2.length; linha++) {
				
				for(int col = 0; col < numeros2.length; col++) {
					
					System.out.println(numeros2[linha][col] = col +1);
					
				}		
			
		}
		
		
		
	}

}
