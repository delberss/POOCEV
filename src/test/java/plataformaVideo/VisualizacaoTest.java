package plataformaVideo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisualizacaoTest {
    @Test
    void deveAlterarAvaliacaoSemParametro(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar();
        assertEquals(6, video1.getAvaliacao());
    }

    @Test
    void deveAlterarAvaliacaoComParametroNota(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(8);
        assertEquals(9, video1.getAvaliacao());
    }

    @Test
    void deveAlterarAvaliacaoComParametroPorcentagemMinima(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(20.0f);
        assertEquals(4, video1.getAvaliacao());
    }
    @Test
    void deveAlterarAvaliacaoMenosDe20Porcento(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(19.1f);
        assertEquals(4, video1.getAvaliacao());
    }

    @Test
    void deveAlterarAvaliacao20Porcento(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(20.0f);
        assertEquals(4, video1.getAvaliacao());
    }

    @Test
    void deveAlterarAvaliacaoMaisDe20Porcento(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(20.1f);
        assertEquals(5, video1.getAvaliacao());
    }

    @Test
    void deveAlterarAvaliacaoDe50Porcento(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(50f);
        assertEquals(5, video1.getAvaliacao());
    }

    @Test
    void deveAlterarAvaliacaoDeMaisDe50Porcento(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(50.1f);
        assertEquals(9, video1.getAvaliacao());
    }

    @Test
    void deveAlterarAvaliacaoDe90Porcento(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(90.0f);
        assertEquals(9, video1.getAvaliacao());
    }

    @Test
    void deveAlterarAvaliacaoDeMaisDe90Porcento(){
        Gafanhoto gafanhoto1 = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video1 = new Video("POO");

        Visualizacao visualizacao1 = new Visualizacao(gafanhoto1, video1);

        visualizacao1.avaliar(90.1f);
        assertEquals(11, video1.getAvaliacao());
    }


}