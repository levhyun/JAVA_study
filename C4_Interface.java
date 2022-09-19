// 인터페이스

interface meet { // 인터페이스 메소드는 관련 메서드를 그룹화하는 데 사용되는 추상클래스
    public void hello();
    public void bye();
}

class a implements meet {
    /*
        인터페이스 메소드에 액세스하려면 인터페이스가 implements 키워드를 사용하여
        다른 클래스에 의해 "구현"되어야 합니다(상속된 것과 유사 extends).
        인터페이스 메서드의 본문은 "구현" 클래스에 의해 제공됩니다.
    */
    public void hello() { // 구현 클래스
        System.out.println("hello");
    }
    public void bye() { // 구현 클래스
        System.out.println("bye");
    }
}

public class C4_Interface {
    public static void main(String[] args) {
        a talk = new a();
        talk.hello();
        talk.bye();
    }
}
