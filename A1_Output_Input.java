import java.util.Scanner;
// java.util 패키지에 Scanner 를 사용하기 위해서는 import 를 통해 호출

// 출력 + 입력

public class A1_Output_Input {
    public static void main(String[] args) {
        System.out.println("HELLO JAVA WORLD!");
        // System.out.println(); 출력.
        System.out.println(1+2);
        // 숫자 출력할 떄는 ""를 사용하지 않는다.

        // 이외의 출력 방법
        System.out.print("다른방법의 출력문입니다.\n");
        // System.out.print(); 출력.
        System.out.print((1+2)*2);
        // 이 방법도 위와 같이 숫자를 출력할 때는 ""를 사용하지 않는다.

        /*
            또한 이방법의 출력은 자동 줄내림("\n")이 안되어 출력문 두개를 적어도
            줄내림("\n")을 하지않으면 같은줄에 순서대로 출력된다.
        */

        // 주석( // = 한줄주석, /**/ = 여러줄 주석 )

        System.out.printf("\n");
        Scanner b = new Scanner(System.in); // 입력
        int out = b.nextInt(); // 정수형 out변수에 scanner로 입력받은 값은 정수형으로 지정 선언
        System.out.println(out); // 출력
    }
}
