package JavaBasic.Operators;

public class Shiftop {
    public static void main(String[] args) {
        System.out.println("This is the shift oper");
    }
}

//    Java Left Shift Operator
//    The Java left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.


class leftshift{
    public static void main(String[] args) {
        int a = 12;
        System.out.println(a<<2);//10*2^2= 48
        System.out.println(a<<3);//10*2^2^2= 96

    }
}



//    Java Right Shift Operator
//    The Java right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.


class rightshift{
    public static void main(String[] args) {
        int a =12;
        System.out.println(a>>2); //12/2^2;
    }

}



//    Java Shift Operator Example: >> vs >>>


class diisshifty{
    public static void main(String args[]){
        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);
    }
}

