import java.util.ArrayList;

public class Continente {

    private String nome;
    private ArrayList<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public double dimensaoTotal() {
        double total = 0;

        for (Pais pais : paises) {
            total += pais.getDimensao();
        }

        return total;
    }

    public long populacaoTotal() {
        long total = 0;

        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }

        return total;
    }

    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    public Pais paisMaiorPopulacao() {
        Pais maior = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getPopulacao() > maior.getPopulacao()) {
                maior = pais;
            }
        }

        return maior;
    }

    public Pais paisMenorPopulacao() {
        Pais menor = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getPopulacao() < menor.getPopulacao()) {
                menor = pais;
            }
        }

        return menor;
    }

    public Pais paisMaiorDimensao() {
        Pais maior = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getDimensao() > maior.getDimensao()) {
                maior = pais;
            }
        }

        return maior;
    }

    public Pais paisMenorDimensao() {
        Pais menor = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getDimensao() < menor.getDimensao()) {
                menor = pais;
            }
        }

        return menor;
    }

    public double razaoTerritorial() {
        return paisMaiorDimensao().getDimensao()
                / paisMenorDimensao().getDimensao();
    }
}