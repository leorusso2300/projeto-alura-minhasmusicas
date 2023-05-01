package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() <= 4) {
            System.out.println("Nota: " + audio.getClassificacao() + ", Classificação ruim!!");
        } else if (audio.getClassificacao() >= 5 && audio.getClassificacao() <= 6) {
            System.out.println("Nota: " + audio.getClassificacao() + ", Classificação média!!");
        } else {
            System.out.println("Nota: " + audio.getClassificacao() + ", Classificação interessante!!");
        }
    }
}
