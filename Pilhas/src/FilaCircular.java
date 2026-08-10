public class FilaCircular {
    int capacidade;
    int tamanho;
    int primeiro; // representa índice do primeiro elemento
    int ultimo; // representa índice do último elemento
    int[] dados;

    public FilaCircular(int tamanho) {
        this.capacidade = 0;
        this.tamanho = tamanho;
        this.primeiro = 0;
        this.ultimo = -1;
        this.dados = new int[tamanho];
    }
    boolean estaCheia() {
        if (capacidade == tamanho) {
            return true;
        } else {
            return false;
        }
    }

    boolean estaVazia(){
        if (capacidade == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir(int elemento) {
        if (estaCheia() == true) {
            System.out.println("Fila está cheia, " + capacidade);
        } else {
            ultimo += 1;
            if (ultimo == tamanho) {
                ultimo = 0;
            }
            dados[ultimo] = elemento;
            capacidade += 1;
            System.out.println("Inserido Elemento: " + elemento);
        }
    }

    public void remover() {
        if (estaVazia() == true) {
            System.out.println("Fila está vazia, " + capacidade);
        } else {
            int valorRemovido = dados[primeiro];
            primeiro += 1;
            if (primeiro == tamanho) {
                primeiro = 0;
            }
            capacidade -= 1;
            System.out.println("Elemento removido: " + valorRemovido);
        }
    }

    public void imprimir() {
        if (estaVazia() == true) {
            System.out.println("Está vazia.");
        } else {
            int indice = primeiro;
            int contador = 0;
            while (contador < capacidade) {
                System.out.println(dados[indice] + " ");
                indice += 1;
                if (indice == tamanho) {
                    indice = 0;
                }
                contador += 1;
            }
            System.out.println();
        }
    }
}
