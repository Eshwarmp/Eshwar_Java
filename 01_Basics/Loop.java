public class Loop {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("While Loop: ");
        // Use while loop when you don't know, how many times you are gonna iterate
        while (num < 6) {
            System.out.print( num + " ");
            num++;
        }
        System.out.println();
        // Use for loop when you know how many times you are gonna iterate
        System.out.println("For Loop :");
        for (int a = 1; a < 6; a++) {
            System.out.print( a + " ");
        }
    }
}
