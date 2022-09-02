public class B4_Class {
    int x = 2;
    int y = 4;

    public static void main(String[] args) {
        B4_Class object = new B4_Class(); // class(B4_Class)에 object 변수 선언 후 클래스로 지정
        B4_Class object2 = new B4_Class();
        System.out.println(object.x);
        System.out.println(object.y);
        System.out.println(object.x * object2.y);
    }
}
