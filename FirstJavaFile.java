public class FirstJavaFile {

    public static void main(String[] args) {
        int age = 8;
        //create object of a class
        Student ahmedData = new Student();
        Teacher teacherData = new Teacher();

        {
            // can print only within bracket
            String name = "Aryan";
            System.out.println(age);
            System.out.println(name);
            //array is immutable
            char[] nameButCharacter = {'A', 'r', 'y', 'a', 'n'};


        }

        // call loopExamples to run loop code
        loopExamples();
    }

    public static void loopExamples() {
        String[] names = {"Aryan", "Mohammed", "Said", "Sara"};

        // Corrected loop
        for(int a = 0; a < names.length; ++a) {
            System.out.println("hello " + names[a]);
        }

        // Equivalent while loop
        int a = 0;
        while(a < names.length) {
            System.out.println("hello " + names[a]);
            ++a;
        }
    }
}



