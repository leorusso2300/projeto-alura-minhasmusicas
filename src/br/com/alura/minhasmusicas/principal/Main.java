package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Audio;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Musica musica = new Musica();
        musica.setAlbum("Viva la Vida or Death and All His Friends");
        musica.setArtista("Coldplay");
        musica.setGenero("Rock alternativo");
        musica.setTitulo("Viva la vida");

        Podcast podcast = new Podcast();
        podcast.setDescricao("Podcast focado em assuntos relacionados a ciência.");
        podcast.setHost("Ciência Sem Fim");
        podcast.setTitulo("LITO SOUSA [AVIÕES E MÚSICAS]");

        Random randomMusica = new Random();
        int sorteioMusica = randomMusica.nextInt(100);

        for (int i = 0; i <= sorteioMusica; i++) {
            musica.curte();
            musica.reproduz();
        }

        Random randomPodcast = new Random();
        int sorteioPodcast = randomPodcast.nextInt(100);

        for (int i = 0; i <= sorteioPodcast; i++) {
            podcast.reproduz();
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        System.out.println("------------------------------------------------");
        musica.getAlbum();
        musica.getArtista();
        musica.getGenero();
        musica.getTitulo();
        System.out.println("Total de curtidas: " + musica.getTotalCurtidas());
        System.out.println("Total de reproduções: " + musica.getTotalReproducoes());
        musica.getClassificacao();
        preferidas.inclui(musica);
        System.out.println("------------------------------------------------");

        podcast.getHost();
        podcast.getDescricao();
        podcast.getTitulo();
        System.out.println("Total de curtidas: " + podcast.getTotalCurtidas());
        System.out.println("Total de reproduções: " + podcast.getTotalReproducoes());
        podcast.getClassificacao();
        preferidas.inclui(podcast);
        System.out.println("------------------------------------------------");

    }
}