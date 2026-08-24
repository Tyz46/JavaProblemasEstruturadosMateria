public class Main {
    public static void main(String[] args) {
        ListaEncadeadaCircular lista = new ListaEncadeadaCircular();
// Inserindo elementos na lista
        lista.insereElemento(10);
        lista.insereElemento(20);
        lista.insereElemento(30);
        lista.removeElemento(20);
// Exibindo os elementos da lista
        lista.exibeLista(); // Deve exibir: Lista: 10 20 30
    }
}