// 조건문

public class A8_Condition {
    public static void main(String[] args) {
        // if ~ else if ~ else
        /*
            구조
            if (condition1) {

            } else if (condition2) {

            } else {

            }
        */
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Good evening.

        // 삼항 연산 조건문
        // 구조 : variable = (condition) ? expressionTrue :  expressionFalse;

        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        // Good evening.

        // Switch
        /*  구조
            switch(expression) {
              case x:

                break;
              case y:

                break;
              default:

            }
        */
        int a = 2;
        switch (a) {
            case 1:
                System.out.println(a);
            case 2:
                System.out.println(a);
            default:
                System.out.println(a);
        }
    }
}
