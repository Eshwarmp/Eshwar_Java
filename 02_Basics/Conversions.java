// import Arrays.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Conversions {
    public static void main(String[] args) {
        String answer = "123";
        System.out.println("String to integer : " + Integer.parseInt(answer));
        System.out.println("String to float : " + Float.parseFloat(answer));
        System.out.println("String to long : " + Long.parseLong(answer));
        int num = 1;
        float decimal = 12.2f;
        System.out.println("Integer to String : " + String.valueOf(num));
        System.out.println("Integer to String : " + Integer.toString(num));
        System.out.println("Float to String : " + String.valueOf(decimal));
        System.out.println("Float to String : " + Float.toString(decimal));
        System.out.println("Integer to Character : " + (char) (num + '0'));
        
        char nums = '4';
        System.out.println("Character to Integer : " + Character.getNumericValue(nums));

        System.out.println("Converting String array into arraylist");
        String[] arr = { "Abhi", "Bhuvan" };
        ArrayList<String> array = new ArrayList<>(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(array);

        System.out.println("Converting String arraylist to array");
        ArrayList<String> list = new ArrayList<>();
        list.add("Abhi");
        list.add("Bhuvan");
        String[] lists = list.toArray(new String[0]);
        System.out.println(list);
        System.out.println(Arrays.toString(lists));
    }
}
