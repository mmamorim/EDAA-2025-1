import java.io.File;
import java.util.Scanner;

public class TesteDicio {
    static int qtde = 0;

    public static void main(String args[]) {
        String[] vetor = lerPalavras();
        System.out.println("Qtde palavras =>" + qtde);
        //int pos = buscaSeq(vetor, "abacateses");
        int pos = buscaBin(vetor, 0, qtde, "samambaia");
        System.out.println(pos);

        String lista[] = lerFrase();
        for(int i=0; i<lista.length;i++) {
            if(buscaSeq(vetor, lista[i]) == -1) {
                System.out.println("palavra escrita errada: "+lista[i]);
            } else {
                System.out.println("Palavra: ["+lista[i]+"] ok!");
            }
        }
    }

    public static String[] lerFrase() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = leitor.nextLine();
        System.out.println("frase: "+frase);
        String vetor[] = frase.split(" ");
        return vetor;
    }

    public static String[] lerPalavras() {
        String vetor[] = new String[262000];
        int pos = 0;
        File file = new File("dicios_br.txt");
        try {
            Scanner leitor = new Scanner(file, "UTF-8");
            while (leitor.hasNext()) {
                String texto = leitor.next();
                // System.out.println(texto);
                vetor[pos] = texto;
                pos++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        qtde = pos;
        return vetor;
    }

    public static int buscaSeq(String vetor[], String texto) {
        int pos;
        for (pos = 0; pos < qtde; pos++) {
            if (vetor[pos].equals(texto)) {
                return pos;
            }
        }
        return -1;
    }

    public static int buscaBin(String vetor[], int ini, int fim, String texto) {
        if (ini > fim) {
            return -1;
        }
        int meio = (ini + fim) / 2;
        if (vetor[meio].equals(texto)) {
            return meio;
        } else {
            if (vetor[meio].compareTo(texto) > 0) {
                return buscaBin(vetor, ini, meio - 1, texto);
            } else {
                return buscaBin(vetor, meio+1, fim, texto);
            }
        }
    }
}