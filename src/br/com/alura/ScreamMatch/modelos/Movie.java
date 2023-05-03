package br.com.alura.ScreamMatch.modelos;

import br.com.alura.ScreamMatch.calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {
 private String diretor;

 public  Movie(String nome, int anoLancamento){
     super(nome, anoLancamento);
 }
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes() /2;
    }

    @Override
    public String toString() {
        return "Filme: "+ this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
