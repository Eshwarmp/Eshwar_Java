package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of list");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
        list.set(2, 6);
        System.out.println(list.contains(6));
        list.remove(2);  
        System.out.println("Using for loop:");
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i)+" ");
        }
    }
}
