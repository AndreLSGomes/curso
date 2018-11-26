package br.com.biblioteca.servico;

import br.com.biblioteca.modelo.Aluno;
import br.com.biblioteca.modelo.Livro;
import br.com.biblioteca.util.BibliotecaUtil;

public class BibliotecaService {

	private Aluno alunoGenerico;
	private Livro livroGenerico;
	
	public void cadastrarAluno() {
		alunoGenerico = new Aluno();
		
		//Cadastrando código aluno
		System.out.print("Informe o código do aluno: ");
		alunoGenerico.setCodAluno(BibliotecaUtil.leitor.nextInt());
		//remover quebra de linha
		BibliotecaUtil.leitor.nextLine();
		
		//Cadastrando nome do aluno
		System.out.print("Informe o nome do aluno: ");
		alunoGenerico.setNomeAluno(BibliotecaUtil.leitor.nextLine());
		
		//Imprime tela de sucesso no cadastro
		System.out.println("\n\t#######Aluno '" + alunoGenerico.getNomeAluno() + "' cadastro com sucesso!#######\n");
	}
	
	public void cadastrarLivro() {
		livroGenerico = new Livro();
		
		//Cadastrando código do livro
		System.out.print("Informe o código do livro: ");
		livroGenerico.setCodLivro(BibliotecaUtil.leitor.nextInt());
		// remover quebra de linha
		BibliotecaUtil.leitor.nextLine();
		
		//Cadastrando título do livro
		System.out.print("Informe o título do livro: ");
		livroGenerico.setTituloLivro(BibliotecaUtil.leitor.nextLine());
		
		livroGenerico.setQuantidadeEstoque(1);
		
		//Imprime tela de sucesso no cadastro
		System.out.println("\n\t#######Título '" + livroGenerico.getTituloLivro() + "' cadastrado com sucesso!#######\n");
	}

	public void exibirAcervo() {
		System.out.println("\n\tCódigo do livro: " + livroGenerico.getCodLivro());
		System.out.println("\tAcervo: " + livroGenerico.getTituloLivro());
		System.out.println("\tQuantidade em estoque do livro " + livroGenerico.getTituloLivro() + ": " + livroGenerico.getQuantidadeEstoque() +"\n");
	}
	
	public void exibirAlunos() {
		System.out.println("\n\tCódigo do aluno: " + alunoGenerico.getCodAluno());
		System.out.println("\tNome do aluno: " + alunoGenerico.getNomeAluno() + "\n");
	}

	public void emprestar() {
		int auxiliar = 0;
		int opcao    = 0;
		int codigo   = 0;
		
		System.out.print("\tDigite o código do livro: ");
		auxiliar = BibliotecaUtil.leitor.nextInt();
		// remover quebra de linha
		BibliotecaUtil.leitor.nextLine();

		System.out.print("\tDigite o código do aluno: ");
		codigo = BibliotecaUtil.leitor.nextInt();
		// remover quebra de linha
		BibliotecaUtil.leitor.nextLine();
		
		System.out.print("\tConfirma a locação do livro " + livroGenerico.getTituloLivro() + "? Digite '1' para SIM e '2' para NÃO:");
		opcao = BibliotecaUtil.leitor.nextInt();
		// remover quebra de linha
		BibliotecaUtil.leitor.nextLine();
		
		if ( opcao == 1 ) {
			System.out.println("\n\tLivro emprestado para o aluno '" + alunoGenerico.getNomeAluno() + "'");
			livroGenerico.setQuantidadeEstoque(livroGenerico.getQuantidadeEstoque() - 1);
		}
		else {
			System.out.println("\n\t#######Operação encerrada!#######\n");
		}
		
		System.out.println("\tA quantidade em estoque do Título '" + livroGenerico.getTituloLivro() + "' é: " + livroGenerico.getQuantidadeEstoque() + "\n");

	}
	
	public void devolver() {
		int codigo   = 0;
		int auxiliar = 0;
		
		System.out.print("\n\tDigite o código do livro: ");
		codigo = BibliotecaUtil.leitor.nextInt();
		// remover quebra de linha
		BibliotecaUtil.leitor.nextLine();
		
		System.out.print("\tConfirma a devolução do livro " + livroGenerico.getTituloLivro() + "? Digite '1' para SIM e '2' para NÃO:");
		auxiliar = BibliotecaUtil.leitor.nextInt();
		// remover quebra de linha
		BibliotecaUtil.leitor.nextLine();
		
		if (auxiliar == 1) {
			System.out.println("\n\t#######Operação realizada com sucesso! Livro delvolvido.#######\n");
			livroGenerico.setQuantidadeEstoque(livroGenerico.getQuantidadeEstoque() + 1);
			System.out.println("\tA quantidade em estoque do Título " + livroGenerico.getTituloLivro() + " é: " + livroGenerico.getQuantidadeEstoque() + "\n");
		}else {
			System.out.println("\n\t#######Operação encerrada!#######\n");
		}

	}
	
	public void cobrarMulta() {
		System.out.println("Método ainda não implementado!\n");
	}
	
}
