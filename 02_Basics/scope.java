public class scope {
    public static void main(String[] args) {

        // Rule : Anything which is defined outside the box cannot be re-initialized again inside 
        // the box, but can be modified and also, anything defined inside the box cannot be used
        // outside box, but can be re-initialized.

        int a = 5;
        int b = 3;
        //System.out.println(n); // A variable can be used only in method where it is defined

        // block scope
        {
            //int a = 4; // this will results in error, we cannot reinitialize the things which is 
            // already initialized in the main function. but we can modify
            a = 4; // we can modify the value
            int c = 2; // only valid in this block, can't be able to use in other methods, even 
            // on the same method outside the block
            System.out.println(a);
        }
        //System.out.println(c); // results in error, bcz it is defined inside the block
        System.out.println(a); // results = 4, bcz we modified the variable inside the block

        for (int i = 0; i < 10; i++) {
            int n = 3;
            a = 232; // can be modified
        }
        int n = 3; // can be re-initialized again 
        // System.out.println(n); // can't be used outside the loop
        // System.out.println(i); // can't be accessed outside the loop - loop scope

    }

    static void change() {
        //System.out.println(a); // this defines the method scope, a variable can be used only in
        // the method where it is defined.
        int n = 3;
    }


}
