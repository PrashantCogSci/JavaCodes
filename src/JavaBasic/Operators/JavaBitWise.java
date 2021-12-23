package JavaBasic.Operators;


// Bitwise And opertor
public class JavaBitWise {
    public static void main(String[] args) {
        int a = 25;//11001
        int b = 15;//01111
                    // 01001 = 9
        System.out.println(a&b);
    }
}

//Bitwise Or Opertor

class BitwiseOr {
    public static void main(String[] args) {
        int a = 25;//11001
        int b = 15;//01111
                    //11111 = 31
        System.out.println(a|b);
    }
}