
public class Prog {
    public static void main(String[] args) {
        long soma = 0;
        long N = 100000;

        for(int i=0; i< N; i++) {
            for(int k=0; k< N; k++) {
                soma = soma + i;
            }
        }
        System.out.println("N: "+N);
        System.out.println("Soma: "+soma);
    }
}