package BitManipulation;

public class FourOperation {
    public static void main(String[] args) {
        int n = 15;
        int i = 3;
        int find = find(n, i);
        System.out.println(find);
        int set = set(n, i);
        System.out.println(set);
        int clear = clear(n, i);
        System.out.println(clear);
        int toggle = toggle(n, i);
        System.out.println(toggle);
    }

    public static int find(int n, int i) {
        int ans = n & (1 << (i - 1));
        if (ans == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public static int set(int n, int i) {
        return n | (1 << (i - 1));
    }

    public static int clear(int n, int i) {
        return n & ~(1 << (i - 1));
    }

    public static int toggle(int n, int i) {
        return n ^ (1 << (i - 1));
    }
}
