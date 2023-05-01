package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String genero;

    public void getAlbum() {
        System.out.println("Album: " + album);
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void getArtista() {
        System.out.println("Artista: " + artista);
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void getGenero() {
        System.out.println("Gênero: " + genero);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        int nota = 101;
        if (super.getTotalReproducoes() <= 10) {
            nota = 0;
        } else if (super.getTotalReproducoes() > 10 && super.getTotalReproducoes() <= 20) {
            nota = 1;
        } else if (super.getTotalReproducoes() > 20 && super.getTotalReproducoes() <= 30) {
            nota = 2;
        } else if (super.getTotalReproducoes() > 30 && super.getTotalReproducoes() <= 40) {
            nota = 3;
        } else if (super.getTotalReproducoes() > 40 && super.getTotalReproducoes() <= 50) {
            nota = 4;
        } else if (super.getTotalReproducoes() > 50 && super.getTotalReproducoes() <= 60) {
            nota = 5;
        } else if (super.getTotalReproducoes() > 60 && super.getTotalReproducoes() <= 70) {
            nota = 6;
        } else if (super.getTotalReproducoes() > 70 && super.getTotalReproducoes() <= 80) {
            nota = 7;
        } else if (super.getTotalReproducoes() > 80 && super.getTotalReproducoes() <= 90) {
            nota = 8;
        } else if (super.getTotalReproducoes() > 90 && super.getTotalReproducoes() <= 99) {
            nota = 9;
        } else if (super.getTotalReproducoes() == 100) {
            nota = 10;
        }
        return nota;
    }
}
