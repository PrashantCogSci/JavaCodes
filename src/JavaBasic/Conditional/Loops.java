package JavaBasic.Conditional;
//
//Loop statements
//        do while loop
//        while loop
//        for loop

public class Loops {
    public static void main(String[] args) {
        System.out.println("this is about loops in Java");

    }
}
class whileloop{
    public static void main(String[] args) {
        int a = 0;
        while (a<=10){
            System.out.println(a);
            a++;
        }
        System.out.println("out of loop");
    }

}


//do while loop

class dowhileloo{
    public static void main(String[] args) {
        int b=1;

        do {
            System.out.println(b);
            b++;
        }while (b <=20);

    }
}

//for loop


class forloop{
    public static void main(String[] args) {
     for(int c= 1; c<=12; c++){
         System.out.println(c);
     }
    }
}