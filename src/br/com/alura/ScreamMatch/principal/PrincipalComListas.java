package br.com.alura.ScreamMatch.principal;

import br.com.alura.ScreamMatch.modelos.Movie;
import br.com.alura.ScreamMatch.modelos.Serie;
import br.com.alura.ScreamMatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The good Father", 1972);
        movie1.avalia(10);
        Movie movie2 = new Movie("Dogville", 2003);
        movie2.avalia(9);
        Movie movie3 = new Movie("Lord of Rings", 1999);
        movie3.avalia(9.5);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(movie1);
        lista.add(movie2);
        lista.add(movie3);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Movie movie && movie.getClassificacao() > 2) {
                System.out.println("Classificação: "+ movie.getClassificacao());

            }
        }
        ArrayList <String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Pedro");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano:");
        System.out.println(lista);
    }
    //compras online
    //aplicação para compras com cartao
    //menu para lançamento
    //exibição lista de compras realizadas ordenadas por valor

}
