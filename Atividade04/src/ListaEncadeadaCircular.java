public class ListaEncadeadaCircular {
    // Classe interna para representar um nó da lista
    class No {
        int dado;
        No proximo;

        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
        }
    }

    No inicio = null;

    // Metodo para inserir um elemento no final da lista
    public void insereElemento(int elemento) {
        No novoNo = new No(elemento);

        if (inicio == null) {
            inicio = novoNo;
            novoNo.proximo = inicio; // O único nó aponta para ele mesmo
        } else {
            No atual = inicio;

            while (atual.proximo != inicio) {
                atual = atual.proximo;
            }

            atual.proximo = novoNo;
            novoNo.proximo = inicio; // Último aponta para o primeiro
        }
    }

    // Metodo para remover um elemento da lista
    public void removeElemento(int elemento) {
        if (inicio == null) {
            return;
        }

        // Caso seja o único elemento
        if (inicio.dado == elemento && inicio.proximo == inicio) {
            inicio = null;
            return;
        }

        // Caso o primeiro elemento seja removido
        if (inicio.dado == elemento) {
            No atual = inicio;

            while (atual.proximo != inicio) {
                atual = atual.proximo;
            }

            inicio = inicio.proximo;
            atual.proximo = inicio;
            return;
        }

        No atual = inicio;

        while (atual.proximo != inicio && atual.proximo.dado != elemento) {
            atual = atual.proximo;
        }

        if (atual.proximo != inicio) {
            atual.proximo = atual.proximo.proximo;
        }
    }

    // Metodo para exibir os elementos da lista
    public void exibeLista() {
        if (inicio == null) {
            System.out.println("Lista: vazia");
            return;
        }

        No atual = inicio;
        System.out.print("Lista: ");

        do {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        } while (atual != inicio);

        System.out.println();
    }
}