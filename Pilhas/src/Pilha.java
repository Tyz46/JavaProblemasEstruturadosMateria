public class Pilha {

    int capacidade;   // guarda o tamanho do vetor (usado no lugar de dados.length)
    int[] dados;      // vetor que armazena os elementos
    int topo;         // indice do elemento do topo (-1 significa pilha vazia)

    // Construtor: recebe o tamanho maximo e prepara a pilha
    Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    // Verifica se a pilha esta cheia
    boolean estaCheia() {
        if (topo == capacidade - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Verifica se a pilha esta vazia
    boolean estaVazia() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Insere um elemento no topo da pilha
    void empilhar(int valor) {
        if (estaCheia() == true) {
            System.out.println("Pilha cheia. Nao foi possivel empilhar o valor: " + valor);
        } else {
            topo = topo + 1;
            dados[topo] = valor;
            System.out.println("Empilhado: " + valor);
        }
    }

    // Remove o elemento do topo da pilha
    void desempilhar() {
        if (estaVazia() == true) {
            System.out.println("Pilha vazia. Nao ha elemento para desempilhar.");
        } else {
            int valorRemovido = dados[topo];
            topo = topo - 1;
            System.out.println("Desempilhado: " + valorRemovido);
        }
    }

    // Mostra os elementos do topo ate a base
    void imprimir() {
        if (estaVazia() == true) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("Pilha (do topo para a base): ");
            int indice = topo;
            while (indice >= 0) {
                System.out.print(dados[indice] + " ");
                indice = indice - 1;
            }
            System.out.println();
        }
    }

    void imprimir2() {
        if (estaVazia() == true) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("Pilha (do topo para a base): ");
            int indice = topo;
            while (indice >= 0) {
                System.out.println(dados[indice] + " ");
                indice = indice - 1;
            }
            System.out.println();
        }
    }
}