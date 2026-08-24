public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
// Inserindo elementos na lista
        lista.insereElemento(10);
        lista.insereElemento(20);
        lista.insereElemento(30);
        lista.removeElemento(20);
// Exibindo os elementos da lista
        lista.exibeLista(); // Deve exibir: Lista: 10 20 30
    }
}