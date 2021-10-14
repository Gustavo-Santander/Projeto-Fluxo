package fluxos;

public class FluxoContinue {
	public static void main(String[] args) {

		String nome[] = { "Bianca", "Jose", "Maria", "Jose" };
		String nomeProcurado = "Jose";
		int cont = 0;

		buscarNomes: for (int i = 0; i < nome.length; i++) {
			if (nome[i].equals(nomeProcurado))
				continue buscarNomes;

			cont++;
		}
		System.out.println("O nome apareceu:" + cont + "vezes");

	}

}
