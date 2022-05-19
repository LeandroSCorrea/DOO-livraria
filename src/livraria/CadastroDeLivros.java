package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789.10";

		Livro livro = new Livro();
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";

		livro.autor = autor;

		livro.mostrarDetalhes();
		/*
		 * Autor outroAutor = new Autor(); outroAutor.nome = "Paulo Silveira";
		 * outroAutor.email = "paulo.silveira@caulum.com.br"; outroAutor.cpf =
		 * "123.456.789.10";
		 */
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de Programação";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";

		// outroLivro.autor = outroAutor;

		outroLivro.mostrarDetalhes();

		Livro livro1 = new Livro();
		livro1.valor = 59.90;

		System.out.println("valor Atual: " + livro1.valor);
		livro1.aplicaDescontoDe(0.1);
		System.out.println("valor com desconto: " + livro1.valor);

		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
	}
}
