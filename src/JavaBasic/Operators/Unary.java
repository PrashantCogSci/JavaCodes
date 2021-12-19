package JavaBasic.Operators;

//Unary

//        postfix	expr++ expr--
//        prefix	++expr --expr +expr -expr ~ !

//The Java unary operators require only one operand. Unary operators are used to perform various operations

//        incrementing/decrementing a value by one
//        negating an expression
//        inverting the value of a boolean


//1st Java Unary Operator Example: ++ and --

public class Unary {
    public static void main(String[] args) {
        int x= 20;
        System.out.println(x++);//20 will print
//                now x value will be 21
        System.out.println(++x); //22will print
//        now x value will be 22 due to previous;
        System.out.println(x--); //22 will print
//        now value will be 21
        System.out.println(--x);// 20 will be value
//        now value will be 20
    }

}


//2ava Unary Operator Example 2: ++ and --

class unary2{
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        System.out.println(a++ + ++a);//20+22
        System.out.println(b++ + b++);//20 + 21
    }
}


//Java Unary Operator Example: ~ and !

class OperatorExa{
    public static void main(String args[]){
        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }}

