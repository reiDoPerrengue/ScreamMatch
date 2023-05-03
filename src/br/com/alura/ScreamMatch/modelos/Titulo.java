package br.com.alura.ScreamMatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDasAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public int getTotalDasAvaliacoes() {
        return totalDasAvaliacoes;
    }

    public void setTotalDasAvaliacoes(int totalDasAvaliacoes) {
        this.totalDasAvaliacoes = totalDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamento: "+ anoLancamento);
        System.out.println("Avaliações: "+ somaAvaliacao);
        System.out.println("Total de avaliações: "+ totalDasAvaliacoes);
        System.out.println("Duração em minutos: "+ duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaAvaliacao += nota;
        totalDasAvaliacoes++;
    }

    public double mediaAvaliacoes(){
        return somaAvaliacao / totalDasAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
