//What is the output of the following Java code?

public class Test01 {

    int x = 10; // if make static int x=0 then it will not give any error
    public static void main(String args[]) {
        System.out.print(x); //Test01.java:7: error: non-static variable x cannot be referenced from a static context System.out.print(x);
    }

    static {
        System.out.println(x + 10);//Test01.java:11: error: non-static variable x cannot be referenced from a static context
                                     //System.out.println(x + 10);
    }

}
