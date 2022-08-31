// 변수

public class A2_Variable {
    public static void main(String[] args) {
        // 변수 선언 구조 => type variableName = value;

        String name = "jahyun";
        // 문자열(String)타입의 name라는 변수명을 선언후 "jahyun"으로 초기화.
        System.out.println(name); // name 변수 값 출력.

        int num; // 정수(int)타입의 num라는 변수명을 선언.
        num = 17; // num 변수에 17 값 저장.
        System.out.println(num);

        int number = 246;
        number = 2466; // num2 변수의 값을 2466으로 변경.
        System.out.println(number);

        final int no_change_number = 17;
        System.out.println(no_change_number);
        /*
            final 키워드를 입력후 타입명을 적어 변수를 선언하고 값을 저장하면
            값을 변경할 수 없다.
        */

        String name2 = "junbum";
        System.out.println("Hello "+ name2); // Hello junbum

        String firstName = "Goo ";
        String lastName = "jahyun";
        String fullName = firstName + lastName;
        System.out.println(fullName); // Goo jahyun

        int x = 2;
        int y = 4;
        int z = 6;
        System.out.println(x + y + z); // 12
    }
}
