public class TypeCasting {
    public static void main(String[] args) {
        int num = (int) 32.2f; // explicit typecasting
        System.out.println(num);
        float number = 23;
        System.out.println(number); // implicit typecasting
        // here float has more value than the int, that's why it can automatically typecast 
        // int into float, vice versa is not possible
        byte a = 127;
        byte b = 2;
        int d = a * b; // here while multiplying the two byte values which leads to the bigger value
        // will automatically fall in the int category.
        System.out.println(d);
        int c = 257;
        System.out.println((byte) c);
        // byte can store only the values till 256, here we are converting the 257 which is greater
        // than the capacity of byte, so the mod calculation will takes place the result will 
        // given number % 256. here 257 % 256 which is 1.

        int letter = 'a';
        System.out.println(letter); // It prints the ascii value of the respective alphabet.

        
    }
}
