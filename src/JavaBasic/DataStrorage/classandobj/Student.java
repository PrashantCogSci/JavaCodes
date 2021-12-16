package JavaBasic.DataStrorage.classandobj;

public class Student {

        int age;
        String name;
        String  city;
        String address;

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.age = 23;
        S1.name = "ramu";
        S1.city="pune";
        S1.address="waked";

        Student  S2= new Student();
        S2.age = 23;
        S2.name = "ramuji";
        S2.city="pune";
        S2.address="wak2";

        Student S3 =new Student();

        S3.age = 29;
        S3.name = "rkkamu";
        S3.city="mumbai";
        S3.address="mum1";

        System.out.println("name of S1 is"+S1.name);
        System.out.println("age of S2 is"+S2.age);
        System.out.println("City of S3 is"+S3.city);
    }
}
