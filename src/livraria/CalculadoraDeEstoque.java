package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		double livroJaava8;
		double livroTDD;
		/*
		livroJaava8 = 59.90;
		livroTDD = 59.90;
		
		double soma = livroJaava8 + livroTDD;
		*/
		/*
		double soma= 0;
		int contador = 0;
		
		while(contador < 35) {
			double valorDolivro = 59.90;
			soma += valorDolivro;
			contador++;
		}
		*/
		
		double soma = 0, valorDolivro = 59.90;
		for (int cont=0; cont < 30; cont++) {
			soma += valorDolivro;
		}
		
		System.out.println("O total e estoque é " + soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque está muito alto!");
		}else {
			System.out.println("Seu estoque está bom");
		}
	}
}
