// 예외

public class C8_Exceptions {
    static void error(int num) {
        if (num < 5) {
            throw new ArithmeticException("num<5");
            /*
                Exception in thread "main" java.lang.ArithmeticException: num<5
	                at C8_Exceptions.error(C8_Exceptions.java:6)
	                at C8_Exceptions.main(C8_Exceptions.java:22)
            */
        }
        else {
            System.out.println("num>5");
        }
    }
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3,4};
            System.out.println(arr[10]);
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Finally_Out");
            error(4);
        }
    }
}
