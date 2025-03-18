
public class Queue {
    private int[] info;
    private int ini;
    private int fim;

    public Queue(int length) {
        this.info = new int[length];
        ini = 0;
        fim = 0;
    }

    public boolean isEmpty() {
        return ini == fim;
    }

    public boolean isFull() {
        return ini == 0 && fim == info.length;
    }

    public void moveAlltoBegin() {
        for (int i = ini; i < fim; i++) {
            info[i - ini] = info[i];
        }
        fim = fim - ini;
        ini = 0;
        System.out.println("moveAlltoBegin done!");
    }

    public void add(int value) {
        if (!isFull()) {
            if (fim == info.length) {
                moveAlltoBegin();
            }
            info[fim] = value;
            fim++;
        } else {
            System.out.println("Queue overflow");
        }
    }

    public int remove() {
        if (!isEmpty()) {
            int elem = info[ini];
            ini++;
            return elem;
        }
        System.out.println("Queue empty!");
        return 0;
    }

    public void show() {
        System.out.print("[");
        for(int i=0; i<info.length; i++) {
            if(i<ini) {
                System.out.print("-");
            } else {
                if(i>=fim) {
                    System.out.print("-");
                } else {
                    System.out.print(info[i]);
                }
            }
            if(i<info.length-1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
