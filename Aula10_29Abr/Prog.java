
public class Prog {

    public static void main(String[] args) {
        int[] numbers = {8,3,5,1,4,9};

        xxx(numbers);

        System.out.print("[");
        for(int i=0; i<numbers.length;i++) {
            System.out.print(numbers[i]);
            if(i<numbers.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }    

    public static void xxx(int[] vetor) {
        
    }
}