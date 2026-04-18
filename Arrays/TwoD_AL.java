package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoD_AL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();// Single Dimension Array
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>(2); // this line creates []
        
        // Here even though we mentioned the initial capacity as 2, when the first value is entered,
        // The arraylist copies the values of the list, and deletes that old array and create the 
        // new one with double the size of the previous one and paste the values over there. 

        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>()); // after three iterations -> [[], [], []]
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(in.nextInt()); // Here we are gonna add values 
            }
        }
        System.out.println(list1);
    }
}
