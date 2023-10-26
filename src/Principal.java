import diniz.luan.screenmatch.calculos.CalculadoraDeTempo;
import diniz.luan.screenmatch.calculos.FiltroRecomendacao;
import diniz.luan.screenmatch.modelos.Episodio;
import diniz.luan.screenmatch.modelos.Filme;
import diniz.luan.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Avatar 2");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(210);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(10);
        lost.exibeFichaTecnica();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar 2");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(outroFilme);

        System.out.println("Duração do filme: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(outroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}