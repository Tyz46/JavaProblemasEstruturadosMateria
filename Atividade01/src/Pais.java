import java.util.ArrayList;

public class Pais {

    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private ArrayList<Pais> paisesVizinhos;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.paisesVizinhos = new ArrayList<>();
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public ArrayList<Pais> getPaisesVizinhos() {
        return paisesVizinhos;
    }

    public void setPaisesVizinhos(ArrayList<Pais> paisesVizinhos) {
        this.paisesVizinhos = paisesVizinhos;
    }

    public boolean equals(Pais outroPais) {
        return this.codigoISO.equals(outroPais.getCodigoISO());
    }

    public boolean ehVizinho(Pais outroPais) {
        for (Pais pais : paisesVizinhos) {
            if (pais.equals(outroPais)) {
                return true;
            }
        }
        return false;
    }

    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    public ArrayList<Pais> vizinhosComuns(Pais outroPais) {
        ArrayList<Pais> comuns = new ArrayList<>();
        for (Pais pais : paisesVizinhos) {
            if (outroPais.ehVizinho(pais)) {
                comuns.add(pais);
            }
        }
        return comuns;
    }
}