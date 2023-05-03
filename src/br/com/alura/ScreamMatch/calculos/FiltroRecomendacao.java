package br.com.alura.ScreamMatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Deveria ser mais assistido");
        } else {
            System.out.println("Coloque na lista e classifique.");
        }
    }
}
