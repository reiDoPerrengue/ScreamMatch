package br.com.alura.ScreamMatch.principal;

import br.com.alura.ScreamMatch.calculos.CalculadoraDeTempo;
import br.com.alura.ScreamMatch.calculos.FiltroRecomendacao;
import br.com.alura.ScreamMatch.modelos.Episodio;
import br.com.alura.ScreamMatch.modelos.Movie;
import br.com.alura.ScreamMatch.modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //movie 1
        Movie movie1 = new Movie("The good Father", 1972);
        movie1.setSomaAvaliacao(9.2);
        movie1.setDuracaoEmMinutos(175);
        movie1.setIncluidoNoPlano(true);
        movie1.setTotalDasAvaliacoes(3);
        movie1.setDiretor("Allan Turing");

        movie1.avalia(8);
        movie1.avalia(10);
        movie1.avalia(10);


        //movie 2
        Movie movie2 = new Movie("Dogville", 2003);
        movie2.setSomaAvaliacao(8.7);
        movie2.setDuracaoEmMinutos(200);
        movie2.setIncluidoNoPlano(false);
        movie2.setTotalDasAvaliacoes(5);
        movie2.setDiretor("Paulo Siqueira");

        //movie3
        Movie movie3 = new Movie("Lord of Rings", 1999);
        movie3.setSomaAvaliacao(9);
        movie3.setDuracaoEmMinutos(230);
        movie3.setIncluidoNoPlano(false);
        movie3.setTotalDasAvaliacoes(10);
        movie3.setDiretor("J.R. Tolkien");


        //serie1
        Serie lost = new Serie("Lost", 2000);
        lost.setSomaAvaliacao(5.2);
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutoPorEpisodio(50);
        lost.setAtiva(false);
        lost.setIncluidoNoPlano(false);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(movie1);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        FiltroRecomendacao filtro = new FiltroRecomendacao();


        Episodio episodio = new Episodio();
        episodio.setNome("1");
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);


        ArrayList<Movie> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(movie1);
        listaDeFilme.add(movie2);
        listaDeFilme.add(movie3);
        System.out.println("Tamanho da lista: "+ listaDeFilme.size());
        System.out.println("Primeiro filme: "+ listaDeFilme.get(0).getNome());
        System.out.println("Segundo filme: "+ listaDeFilme.get(1).getNome());
        System.out.println("Terceiro filme: "+ listaDeFilme.get(2).getNome());
        System.out.println("toString do filme: " + listaDeFilme.get(0).toString());
    }

}
