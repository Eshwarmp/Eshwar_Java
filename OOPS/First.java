package OOPS;



public class First {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Default Values : ");
        System.out.println(student1.rollNo); //  this gives 0
        System.out.println(student1.name); // this gives null
        System.out.println(student1.marks); // this gives 0.0 as we didn't yet initialize the values
        student1.rollNo = 1;
        student1.name = "Abhi";
        student1.marks = 94.3f;
        System.out.println("After initializing the values : ");
        System.out.println(student1.rollNo); 
        System.out.println(student1.name); 
        System.out.println(student1.marks); 
        // Instead of manually assigning values for each and every attribute we can do something like
        // named constructor which initializes the values.
        Student student2 = new Student(2, "Bhuvan", 87.3f);
        // student2 = student1; // you can do this because it is not final
        System.out.println(student2.rollNo);
        System.out.println(student2.name);
        System.out.println(student2.marks);
        System.out.println(student2.section);
        final Student student3 = new Student(3, "Chandan", 86.4f);
        student3.name = "Chandan R"; // you can modify the value but not the reference
        // student3 = student1; you can't do this because of the final keyword
        System.out.println(student3.rollNo);
        System.out.println(student3.name);
        System.out.println(student3.marks);
        System.out.println(student3.section);
    }
    
    static class Student {
        int rollNo; // these are the instance variables which object will have
        String name;
        float marks;
        final char section = 'B'; // section is always B for the students of this class Student
        // you can't modify the value.

        public Student() {
        }

        
        public Student(int rollNo, String name, float marks) { // this is the parameterized constructor
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
            // here this keyword is used for mentioning the current object which we are referring to,
            // example : student1.rollNo = 23, which will be passed as arguments
        }

        
    }

    
}
