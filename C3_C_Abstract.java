// 추상화

abstract class A{ // 추상 클래스는 상속되어 강제로 사용되어야 한다
    // 클래스 안에 하나라도 추상메소드가 있다면 그 클래스 또한 추상 클래스이여야만 한다
    public abstract void b();
    // 추상 메소드는 본체가없으며 상속한 부모클래스에서 대신 본체를 만들수있다
    public void d(){
        System.out.println("일반 메소드");
    }
    // 추상 클래스는 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다
}

class B extends A{
    public void b(){
        System.out.println("추상클래스 A 내에 추상메소드 b 의 본체");
    }
}

public class C3_C_Abstract {
    public static void main(String[] args) {
        A obj = new B();
        obj.b(); // 추상 메소드
        obj.d(); // 일반 메소드
    }
}
