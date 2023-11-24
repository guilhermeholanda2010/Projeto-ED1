package filmes;
import java.util.*;

public class aplicacao {
  public static void main(String[] args) {

public class aplicacao {
    public static void main(String[] args){
        ListaFilmes listaFilmes = new ListaFilmes();
        Filme filme = new Filme();
        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite 1 para inserir um filme:");
            System.out.println("Digite 2 para remover um filme:");
            System.out.println("Digite 3 para buscar um filme:");
            System.out.println("Digite 4 para exibir a lista de filmes:");
            System.out.println("Digite 0 para sair:");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do filme:");
                    String nomeFilme = in.nextLine();
                    System.out.println("Digite o gênero do filme:");
                    filme.setGenero(in.next());
                    System.out.println("Digite a classificação do filme:");
                    filme.setClassificacao(in.next());
                    System.out.println("Digite o ano do filme:");
                    filme.setAno(in.nextInt());

                    listaFilmes.inserir(filme);
                    break;

                case 2:
                    System.out.println("Digite o título do filme a ser removido:");
                    nomeFilme = in.nextLine();
                    listaFilmes.remover(nomeFilme);
                    break;

                case 3:
                    System.out.println("Digite o título do filme a ser buscado:");
                    nomeFilme = in.nextLine();
                    listaFilmes.buscar(filme);
                    break;

                case 4:
                    listaFilmes.exibir();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}
  }
}
