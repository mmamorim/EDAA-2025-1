
public class Prog {
    public static void main(String[] args) {

        int vetor[] = { 23, 34, 45, 56, 67, 88, 92, 97 };

        //int pos = Sequencial(vetor, 56);
        int pos = Binaria(vetor, 93);
        System.out.println("Encontrei posição: " + pos);
    }

    public static int Sequencial(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int Binaria(int[] vetor, int valor) {
        int ini = 0, fim = vetor.length;
        int meio = (ini + fim) / 2;

        while(ini <= fim) {
            if (vetor[meio] == valor) {
                return meio;
            } else {
                if(valor > vetor[meio]) {
                    ini = meio + 1;
                } else {
                    fim = meio - 1;
                }
                meio = (ini + fim) / 2;
            }    
        }
        return -1;
    }

}
