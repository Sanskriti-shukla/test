package Enum_Java;

//enum is a special class, that represent a group of constants. constants should be in uppercase latter.
//for creating enum we use enum keyword instead of class and interface. all constants are separated by comma.
// can access enum by using dot syntax.
//1st way...
public class Enum {
    public static void main(String[] args) {
        A a = A.LOW;
        System.out.println(a);
    }

    enum A {
        LOW,
        MEDIUM,
        HIGH
    }
}

// 2nd way...
//enum A{
//    LOW,
//    MEDIUM,
//    HIGH
//}
//public class Enum {
//    public static void main(String[] args) {
//        Enum.A a= Enum.A.LOW;
//        System.out.println(a);
//    }
//}


