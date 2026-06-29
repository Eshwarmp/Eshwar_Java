package Strings;

public class StringBuild {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);// here every time Series points to new object leads previous one as garbage
        //which leads to wastage of memory, with time complexity of O(N^2) which is worst. 
        // Hence the solution for this, new class is StringBuilder which is mutable and modifies the existing one 
        // instead of creating new one in every iteration like String.

        StringBuilder alphabet = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            alphabet.append(ch); // Unlike Strings it modifies the existing alphabet instead of creating new object 
            // everytime.
        }
        System.out.println(alphabet);
    }
}
