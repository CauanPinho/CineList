import entities.Movie;
import java.util.Scanner;
import java.util.ArrayList;
public class Application{
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        ArrayList<Movie> movies=new ArrayList<>();
        boolean running=true;

        while(running){
            System.out.println("===MENU===\n" +
                    "1 - CADASTRAR FILME\n" +
                    "2 - LISTAR FILMES\n " +
                    "3 - PROCURAR FILME\n" +
                    "4 - ATUALIZAR CADASTRO DO FILME\n" +
                    "5- REMOVER FILME\n" +
                    "6 - SAIR\n");
            int option;
            option=sc.nextInt();
            sc.nextLine();


            switch(option){
                case 1:
                    System.out.println("Cadastre o id do filme\n");
                    int id=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Cadastre o titulo do filme\n");
                    String titulo=sc.nextLine();

                    System.out.println("Cadastre o genero do filme\n ");
                    String genero=sc.nextLine();

                    System.out.println("Cadatre o ano deste filme \n");
                    int ano=sc.nextInt();
                    sc.nextLine();

                    Movie m = new Movie(id,titulo,genero,ano);
                    movies.add(m);

                    System.out.println("Item cadastrado com sucesso...\n");
                    break;

                case 2:
                    System.out.println("===LISTA DE FILMES CADASTRADOS\n");

                    if(movies.isEmpty()){
                        System.out.println("N existe filme cadastrado ainda, clique na opção 1 e cadastre-os\n");
                    }else{
                        for (int i =0;i<movies.size();i++){
                            Movie item= movies.get(i);
                            System.out.println("Posição" + (i+1) +
                                    "| ID:\n " + item.getId() +
                                    "| TITULO: \n" + item.getTitulo() +
                                    "| GENERO:\n " + item.getGenero() +
                                    "| ANO: \n" + item.getAno());
                        }
                    }
                    break;
                case 3:
                    System.out.println("===PROCURAR LIVRO===\n");
                    System.out.println("Digite a nome do livro");

                    String termo=sc.nextLine().tolowerCase();

                    boolean encontrado = false;

                    for(Movie item : movies){
                        if(item.getTitulo.toLowerCase().contains(termo)){
                            System.out.println("| ID " + item.get(i));
                        }
                    }


            }
        }

    }
}