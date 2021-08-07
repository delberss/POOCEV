package plataformaVideo;

public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private int visualizacoes;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.visualizacoes = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao;
        novaAvaliacao = (int) (this.avaliacao + avaliacao) / this.visualizacoes;

        this.avaliacao = novaAvaliacao;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }
    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (!this.reproduzindo)
            this.reproduzindo = true;
            this.visualizacoes += 1;
    }

    @Override
    public void pause() {
        if (this.reproduzindo)
            this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas += 1;
    }
}
