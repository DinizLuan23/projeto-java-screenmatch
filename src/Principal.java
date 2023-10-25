import diniz.luan.screenmatch.modelos.Filme;
import diniz.luan.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Avatar 2");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(210);

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
        lost.exibeFichaTecnica();
    }
}