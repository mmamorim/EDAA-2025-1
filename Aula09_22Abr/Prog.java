
public class Prog {

    public static void main(String[] args) {
        int[] numbers = {8,3,5,1,4,9};

        bolha(numbers);

        System.out.print("[");
        for(int i=0; i<numbers.length;i++) {
            System.out.print(numbers[i]);
            if(i<numbers.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }    

    public static void bolha(int[] vetor) {
        int aux;
        for(int i=0; i< vetor.length; i++) {
            boolean trocou = false;
            for(int k=0; k < vetor.length-i-1; k++) {
                if(vetor[k] > vetor[k+1]) {
                    aux = vetor[k];
                    vetor[k] = vetor[k+1];
                    vetor[k+1] = aux;
                    trocou = true;
                }
            }
            if(!trocou) {
                break;
            }
        }
    }
}