// 내부클래스

class OuterClass {
    int x = 1;

    class InnerClass {
        // 외부 객체가 내부 클래스에 액세스하는 것을 원하지 않으면 클래스를 private 또는 protected 으로 선언
        // ex) private class InnerClass
        int y = 2;
    }

    static class InnerClass2 { // static 로 선언하면 외부에서 바로 액세스이 가능
        int z = 9;
        public int InnerMethod() {
            return 10;
        }
    }
}

public class C2_C_InternalClass {
    public static void main(String[] args) {
            OuterClass myOuter = new OuterClass(); // 외부클래스 액세스
            OuterClass.InnerClass myInner = myOuter.new InnerClass(); // 내부클래스 액세스

            int result = myInner.y * myOuter.x;
            System.out.println(result*result);

            OuterClass.InnerClass2 myInner2 = new OuterClass.InnerClass2();
            // InnerClass 가 static 으로 선언 되어 바로 액세스
            System.out.println(myInner2.z);
            System.out.println(myInner2.InnerMethod()); // 또한 메서드에도 액세스 가능
    }
}
