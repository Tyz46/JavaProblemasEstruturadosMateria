public class Contador {
    private int contagem;

    public Contador() {
        contagem = 0;
    }

    public void zerarContador() {
        contagem = 0;
    }

    public void incrementalContador() {
        contagem += 1;
    }

    public void mostrarContador() {
        System.out.println("Contagem: " + contagem);
    }
}