
public class Stack {
    private int info[];
    private int pos;

    public Stack(int lenght) {
        this.info = new int[lenght];
        this.pos = 0;
    }

    public boolean isFull() {
        return pos == info.length; 
    }

    public boolean isEmpty() {
        return pos == 0; 
    }

    public void push(int elem) {
        if(!isFull()) {
            info[pos] = elem;
            pos++;
            return;    
        } 
        System.out.println("Stack overflow!!!!");
    }

    public int pop() {
        if(!isEmpty()) {
            pos--;
            return info[pos];    
        }
        System.out.println("Stack empty!!!!");
        return 0;
    }

    public void show() {
        System.out.print("[");
        for(int i=0; i<pos; i++) {
            System.out.print(info[i]);
            if(i<pos-1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}