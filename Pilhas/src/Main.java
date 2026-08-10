//public class Main {
//    // Programa principal - exemplo com 5 elementos
//    public static void main(String[] args) {
//        System.out.println("===== EXEMPLO DA PILHA =====");
//        Pilha pilha = new Pilha(5);
//
//        pilha.empilhar(10);
//        pilha.empilhar(20);
//        pilha.empilhar(30);
//        pilha.empilhar(40);
//        pilha.empilhar(50);
//
//        pilha.imprimir2();
//
//        pilha.desempilhar();
//        pilha.desempilhar();
//
//        pilha.imprimir2();
//    }
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Fila");
        FilaCircular fila = new FilaCircular(10);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        fila.imprimir();

        fila.remover();
        fila.inserir(40);
        fila.imprimir();
    }
}
