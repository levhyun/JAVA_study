// 생성자

public class B5_C_Generators {
    int a = 1;

    public B5_C_Generators() { // 생성자
        a = 2; // 객체의 값을 관리 할수 있다.
    }

    public B5_C_Generators(int b) { // 매개변수를 받을 수 있으며 원하는 만큼 여러 매개 변수를 가질수 있다
        a = b;
    }

    public static void main(String[] args) {
        B5_C_Generators object = new B5_C_Generators();
        System.out.println(object.a);

        B5_C_Generators object2 = new B5_C_Generators(4); // 매개변수 자리에 값 전달
        System.out.println(object2.a);
    }
}
