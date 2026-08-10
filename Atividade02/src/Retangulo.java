//public class Retangulo extends Forma {
//    public Retangulo(int altura, int largura) {
//        super(altura, largura);
//    }
//
//    @Override
//    public int CalcularArea() {
//        return altura * largura;
//    }
//}

public class Retangulo implements Forma {

    protected int altura;
    protected int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public int CalcularArea() {
        return altura * largura;
    }
}