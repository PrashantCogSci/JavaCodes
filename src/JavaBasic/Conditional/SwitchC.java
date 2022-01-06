package JavaBasic.Conditional;
import java.util.Scanner;

public class SwitchC {
    public static void main(String[] args) {
        System.out.println("thsi code is about switch and Case");
//        it is very usefull for pre fix set fo condion.
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the star");
        int star= obj.nextInt();

        switch (star){
            case 1:
                System.out.println("this is one");
                break;

            case 2 :
                System.out.println("thsi is 2");
                break;
            default:
                System.out.println("thsi is more the onew and two");


        }
    }
}


