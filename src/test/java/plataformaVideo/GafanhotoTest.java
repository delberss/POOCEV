package plataformaVideo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GafanhotoTest {
    @Test
    void deveRetornarMaisUmVideoAssistido(){
        Gafanhoto gafanhoto = new Gafanhoto("Delber", 22, "M","Delberss");
        Video video = new Video("POO");
        Visualizacao visualizacao = new Visualizacao(gafanhoto,video);

        visualizacao.getEspectador().viuMaisUm();
        assertEquals(2,gafanhoto.getTotalAssistido());
    }
}