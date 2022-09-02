// 함수

public class B1_Method {
    static String char_output(String put, String put2){ // 문자열타입 char_output 함수 선언
        System.out.println(put+" "+put2); // 매개변수로 받은 값 출력
        return "c"; // 호출된 자리에 "c"값 반환
    }
    static void method() { // 타입이 없는(void) method(함수명)함수 선언
        System.out.println("method");
    }
    public static void main(String[] args) { // 메인 함수는 무조건 제일 먼저 실행한다.
        for (int i = 0; i <= 1; i++) {
            method(); // method 함수 호춯
        }
        String c = "a";
        String d = "b";
        System.out.println(char_output(c,d)); // 변수 c, b 값 전달 & char_output 함수 호출
    }
}
