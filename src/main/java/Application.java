import entities.Movie;
import java.util.Scanner;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("=== MENU ===\n" +
                    "1 - CADASTRAR FILME\n" +
                    "2 - LISTAR FILMES\n" +
                    "3 - PROCURAR FILME POR TÍTULO\n" +
                    "4 - ATUALIZAR CADASTRO DO FILME\n" +
                    "5 - REMOVER FILME\n" +
                    "6 - SAIR\n");

            System.out.print("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine(); // consome ENTER

            switch (option) {

                // 1) CADASTRAR FILME
                case 1:
                    System.out.println("\n=== CADASTRAR FILME ===");
                    System.out.print("Cadastre o id do filme: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Cadastre o título do filme: ");
                    String titulo = sc.nextLine();

                    System.out.print("Cadastre o gênero do filme: ");
                    String genero = sc.nextLine();

                    System.out.print("Cadastre o ano deste filme: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    Movie m = new Movie(id, titulo, genero, ano);
                    movies.add(m);

                    System.out.println("Filme cadastrado com sucesso!\n");
                    break;

                // 2) LISTAR FILMES
                case 2:
                    System.out.println("\n=== LISTA DE FILMES CADASTRADOS ===");

                    if (movies.isEmpty()) {
                        System.out.println("Não existe filme cadastrado ainda. Use a opção 1 para cadastrar.\n");
                    } else {
                        for (int i = 0; i < movies.size(); i++) {
                            Movie item = movies.get(i);
                            System.out.println(
                                    "Posição " + (i + 1) +
                                            " | ID: " + item.getId() +
                                            " | TÍTULO: " + item.getTitulo() +
                                            " | GÊNERO: " + item.getGenero() +
                                            " | ANO: " + item.getAno()
                            );
                        }
                        System.out.println();
                    }
                    break;

                // 3) PROCURAR FILME POR TÍTULO
                case 3:
                    System.out.println("\n=== PROCURAR FILME ===");
                    System.out.print("Digite parte do título do filme: ");
                    String termo = sc.nextLine().toLowerCase();

                    boolean encontrado = false;

                    for (Movie item : movies) {
                        if (item.getTitulo().toLowerCase().contains(termo)) {
                            System.out.println(
                                    "ID: " + item.getId() +
                                            " | TÍTULO: " + item.getTitulo() +
                                            " | GÊNERO: " + item.getGenero() +
                                            " | ANO: " + item.getAno()
                            );
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nenhum filme encontrado com esse título.\n");
                    } else {
                        System.out.println();
                    }
                    break;

                // 4) ATUALIZAR CADASTRO DO FILME
                case 4:
                    System.out.println("\n=== ATUALIZAR CADASTRO DE FILME ===");
                    System.out.print("Digite o ID do filme que você quer alterar: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();

                    Movie filmeUpdate = null;
                    for (Movie item : movies) {
                        if (item.getId() == idUpdate) {
                            filmeUpdate = item;
                            break;
                        }
                    }

                    if (filmeUpdate == null) {
                        System.out.println("Filme não encontrado.\n");
                    } else {
                        System.out.print("Novo título (deixe em branco para manter): ");
                        String novoTitulo = sc.nextLine();
                        if (!novoTitulo.isBlank()) {
                            filmeUpdate.setTitulo(novoTitulo);
                        }

                        System.out.print("Novo gênero (deixe em branco para manter): ");
                        String novoGenero = sc.nextLine();
                        if (!novoGenero.isBlank()) {
                            filmeUpdate.setGenero(novoGenero);
                        }

                        System.out.print("Novo ano (0 para manter): ");
                        int novoAno = sc.nextInt();
                        sc.nextLine();
                        if (novoAno != 0) {
                            filmeUpdate.setAno(novoAno);
                        }

                        System.out.println("Cadastro atualizado com sucesso!\n");
                    }
                    break;

                // 5) REMOVER FILME
                case 5:
                    System.out.println("\n=== REMOVER FILME ===");
                    System.out.print("Informe o ID do filme que deseja remover: ");
                    int idRemove = sc.nextInt();
                    sc.nextLine();

                    Movie filmeRemove = null;

                    for (Movie item : movies) {
                        if (item.getId() == idRemove) {
                            filmeRemove = item;
                            break;
                        }
                    }

                    if (filmeRemove == null) {
                        System.out.println("Filme não encontrado.\n");
                    } else {
                        movies.remove(filmeRemove);
                        System.out.println("Filme removido com sucesso!\n");
                    }
                    break;

                // 6) SAIR
                case 6:
                    running = false;
                    System.out.println("Saindo do sistema... Até mais!\n");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.\n");
                    break;
            }
        }

        sc.close();
    }
}
