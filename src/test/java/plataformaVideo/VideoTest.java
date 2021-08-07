package plataformaVideo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {
    @Test
    void deveSemReproducao(){
        Video video = new Video("POO");

        assertFalse(video.isReproduzindo());
    }

    @Test
    void deveSemVisualizacao(){
        Video video = new Video("POO");

        assertEquals(0,video.getVisualizacoes());
    }

    @Test
    void deveEmReproducao(){
        Video video = new Video("POO");
        video.play();

        assertTrue(video.isReproduzindo());
    }

    @Test
    void deveComVisualizacao(){
        Video video = new Video("POO");
        video.play();

        assertEquals(1,video.getVisualizacoes());
    }

    @Test
    void devePausarReproducao(){
        Video video = new Video("POO");
        video.play();
        video.pause();

        assertFalse(video.isReproduzindo());
    }

    @Test
    void deveReproduzirPosPausa(){
        Video video = new Video("POO");
        video.play();
        video.pause();
        video.play();

        assertTrue(video.isReproduzindo());
    }

    @Test
    void deveRetornarVideoSemCurtida(){
        Video video = new Video("POO");

        assertEquals(0, video.getCurtidas());
    }

    @Test
    void deveRetornarVideoComCurtida(){
        Video video = new Video("POO");
        video.like();

        assertEquals(1, video.getCurtidas());
    }

}