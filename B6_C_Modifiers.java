// 수정자

public class B6_C_Modifiers {
    final int a = 1; // 기존 속성 값을 재정의하는 기능을 원하지 않으면 속성을 final 과 같이 선언합니다.

    public static void main(String[] args) {
        B6_C_Modifiers object = new B6_C_Modifiers();
//      object.a = 50; <-- ERROR : a 속성은 final 로 선언되어 재정의 기능이 불가하다
        System.out.println(object.a);

        main2();
    }

    // static 메서드와 public 메서드의 차이점
    static void StaticMethod() {
        System.out.println("Static Method");
    }

    public void PublicMethod() {
        System.out.println("Public Method");
    }

    public static void main2() {
        StaticMethod(); // static 메서드는 객체의 생성 없이 호출이 가능
        // 클래스 안에 실제로 존재하면 객체에는 존재하지 않는다

        B6_C_Modifiers object = new B6_C_Modifiers();
        object.PublicMethod(); // 클래스 위부에서 접근 가능
        /*
            public 선언자는 static과는 달리 객체에서만 접근할 수 있는 함수에 붙입니다.
            즉, public 이 붙은 함수를 사용하기 위해서는 객체를 생성하고 객체명을 통해서만 호출이 가능해 집니다.
        */
    }
}
