// Class ( 객체 , 속성, 메소드 )

public class B4_Class {
    // 다를 파일에서의 클래스도 불러오기 가능
    int x = 2;
    int y = 4;

    public static void main(String[] args) {
        B4_Class object = new B4_Class(); // class(B4_Class)에 object 변수 선언 후 클래스로 지정 / 여러 개 선언 가능 변수명은 중복 불가능
        System.out.println(object.x); // object 가 B4_Class 로 지정되어 있으니 B4_Class 에 x 변수의 값을 불러와 출력 *TIP : c언어 포인터 개념을 이해하면 쉬움
        System.out.println(object.y); // object2 가 B4_Class 로 지정되어 있으니 B4_Class 에 y 변수의 값을 불러와 출력
        System.out.println(object.x * object.y); // x값 y값 불러와 연산 후 결과값 출력
    }
}
