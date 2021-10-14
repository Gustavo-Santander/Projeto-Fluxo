package fluxos;

public class Strings {
	public static void main(String[] args) {

		/*
		 * Characters true ou false
		 */
		System.out.println(Character.isDigit('f'));
		System.out.println(Character.isDigit('7'));
		System.out.println("========================");

		/*
		 * Verifica se o valor e uma letra
		 */
		System.out.println(Character.isLetter('f'));
		System.out.println(Character.isLetter('7'));
		System.out.println("========================");
		/*
		 * Verifica se o valor e uma letra ou um numero
		 */
		System.out.println(Character.isLetterOrDigit('7'));
		System.out.println(Character.isLetterOrDigit('8'));
		System.out.println(Character.isLetterOrDigit('@'));
		System.out.println("========================");
		/*
		 * Verifica letra minuscula ou maiuscula
		 */
		System.out.println(Character.isUpperCase('r'));
		System.out.println(Character.isUpperCase('C'));
		System.out.println("========================");
		System.out.println(Character.isLowerCase('r'));
		System.out.println(Character.isLowerCase('C'));

		/*
		 * verifica se o valor e um espaço em branco
		 */
		System.out.println(Character.isWhitespace(' '));
		System.out.println("========================");

		/*
		 * Strings
		 */
		String arquivo = "index.html";
		arquivo = arquivo.replaceAll("html", "jsp");
		System.out.println(arquivo);

		System.out.println("========================");
		String palavra1 = "Teste";
		String palavra2 = "teste";

		System.out.println(palavra1.equals(palavra2));
		System.out.println("========================");
		System.out.println(palavra1.equalsIgnoreCase(palavra2));
		System.out.println("========================");
		System.out.println(palavra1.startsWith("Tes"));
		System.out.println("========================");
		System.out.println(palavra1.endsWith("ste"));
		System.out.println("========================");
		System.out.println(palavra1.compareTo(palavra2));
		System.out.println("========================");

		int tamanho = palavra1.length();
		System.out.println(tamanho);
		System.out.println("========================");

		char posicao = palavra1.charAt(2);
		System.out.println(posicao);
		System.out.println("========================");
		System.out.println(palavra1.substring(0, 3));
		
		System.out.println(palavra1.indexOf("e"));
		System.out.println(palavra1.lastIndexOf("e"));

	}

}
