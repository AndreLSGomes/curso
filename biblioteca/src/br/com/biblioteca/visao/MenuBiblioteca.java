package br.com.biblioteca.visao;

import br.com.biblioteca.servico.BibliotecaService;
import br.com.biblioteca.util.BibliotecaUtil;

public class MenuBiblioteca {
	
	private BibliotecaService service;
	
	public MenuBiblioteca() {
		this.service = new BibliotecaService();
	}
	
	public void iniciarAtendimento() {
		int opcao = 0;
		do {
			imprimirMenu();
			opcao = BibliotecaUtil.leitor.nextInt();
			switch (opcao) {
			case 1:
				service.cadastrarAluno();
				break;
			case 2:
				service.cadastrarLivro();
				break;
			case 3:
				service.exibirAcervo();
				break;
			case 4:
				service.exibirAlunos();
				break;
			case 5:
				service.emprestar();
				break;
			case 6:
				service.devolver();
				break;
			case 7:
				service.cobrarMulta();
				break;
			case 0:
				System.out.println("\n\t###### Saiu do sistema! ######");
				break;
			default:
				System.out.println("\n\t###### Opção Inválida ######\n");
				break;
			}

		} while (opcao != 0);
	}

	private void imprimirMenu() {
		System.out.print("Informe:\n\t"
				+ "1 - Cadastrar aluno\n\t"
				+ "2 - Cadastrar novo título\n\t"
				+ "3 - Exibir acervo\n\t"
				+ "4 - Exibir alunos\n\t"
				+ "5 - Emprestar\n\t"
				+ "6 - Devolver\n\t"
				+ "7 - Cobrar multa\n\t"
				+ "0 - Sair\n=> ");
	}
}