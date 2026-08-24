public class ListaDuplamenteEncadeada {
    // Classe interna para representar um nó da lista
    class No {
        int dado; // Valor armazenado no nó
        No proximo; // Referência para o próximo nó
        No anterior; // Referência para o nó anterior

        // Construtor do nó
        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
            this.anterior = null;
        }
    }

    No inicio = null; // Referência para o primeiro nó da lista

    // Metodo para inserir um elemento no final da lista
    public void insereElemento(int elemento) {
        No novoNo = new No(elemento);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;

            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = novoNo;
            novoNo.anterior = atual;
        }
    }

    // Metodo para remover um elemento da lista
    public void removeElemento(int elemento) {
        if (inicio == null) {
            return;
        } else if (inicio.dado == elemento) {
            inicio = inicio.proximo;

            if (inicio != null) {
                inicio.anterior = null;
            }

            return;
        } else {
            No atual = inicio;

            while (atual.proximo != null && atual.proximo.dado != elemento) {
                atual = atual.proximo;
            }

            if (atual.proximo != null) {
                atual.proximo = atual.proximo.proximo;

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual;
                }
            }
        }
    }

    // Metodo para exibir os elementos da lista
    public void exibeLista() {
        No atual = inicio;

        System.out.print("Lista: ");

        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }
}