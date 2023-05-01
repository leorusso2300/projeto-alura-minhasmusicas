package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {

    private String host;
    private String descricao;

    public void getHost() {
        System.out.println("Host: " + host);
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void getDescricao() {
        System.out.println("Descrição: " + descricao);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        int nota = 101;
        if (this.getTotalCurtidas() <= 10) {
            nota = 0;
        } else if (this.getTotalCurtidas() > 10 && this.getTotalCurtidas() <= 20) {
            nota = 1;
        } else if (this.getTotalCurtidas() > 20 && this.getTotalCurtidas() <= 30) {
            nota = 2;
        } else if (this.getTotalCurtidas() > 30 && this.getTotalCurtidas() <= 40) {
            nota = 3;
        } else if (this.getTotalCurtidas() > 40 && this.getTotalCurtidas() <= 50) {
            nota = 4;
        } else if (this.getTotalCurtidas() > 50 && this.getTotalCurtidas() <= 60) {
            nota = 5;
        } else if (this.getTotalCurtidas() > 60 && this.getTotalCurtidas() <= 70) {
            nota = 6;
        } else if (this.getTotalCurtidas() > 70 && this.getTotalCurtidas() <= 80) {
            nota = 7;
        } else if (this.getTotalCurtidas() > 80 && this.getTotalCurtidas() <= 90) {
            nota = 8;
        } else if (this.getTotalCurtidas() > 90 && this.getTotalCurtidas() <= 99) {
            nota = 9;
        } else if (this.getTotalCurtidas() == 100) {
            nota = 10;
        }
        return nota;
    }
}
