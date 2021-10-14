package fluxos;

public class FluxoBreak {

	public static void main(String[] args) {
		String nome[] = { "Bianca", "Nico", "Maria", "Jose" };

		String nomeProcurado = "Bianca";

		boolean localizado = false;

		buscarNomes:for (int i = 0; i < nome.length; i++) {

			if (nome[i].equals(nomeProcurado)) {
				localizado = true;
				break buscarNomes;
			}
		}
		if (localizado)
			System.out.println("Nome localizado:");
		else
			System.out.println("Nome nao Localizado");

	}

}
