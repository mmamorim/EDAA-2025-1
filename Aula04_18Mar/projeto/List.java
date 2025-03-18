
public class List {
    private int[] info;
    private int last;

    public List(int length) {
        this.info = new int[length];
        last = 0;
    }

    public boolean isFull() {
        return last == info.length;
    }

    public boolean isEmpty() {
        return last == 0;
    }

    public void add(int value, int pos) {
        if (!isFull()) {
            if (pos <= last) {
                for (int i = last; i > pos; i--) {
                    info[last] = info[last - 1];
                }
                info[pos] = value;
                last++;
            } else {
                System.out.println("Invalid position!");
            }
        } else {
            System.out.println("List overflow!");
        }
    }

    public int remove(int pos) {
        if (!isEmpty()) {
            if (pos < last) {
                int elem = info[pos];
                for (int i = pos; i < last; i++) {
                    info[i] = info[i + 1];
                }
                last--;
                return elem;
            } else {
                System.out.println("Invalid position!");
            }
        } else {
            System.out.println("List empty!");
        }
        return 0;
    }

    public void show() {
        System.out.print("[");
        for (int i = 0; i < info.length; i++) {
            if (i >= last) {
                System.out.print("-");
            } else {
                System.out.print(info[i]);
            }
            if (i < info.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
