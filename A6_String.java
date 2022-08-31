// 문자열

public class A6_String {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length()); // txt 변수의 문자열 길이 출력.

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // HELLO WORLD
        // toUpperCase()는 모두 대문자로 출력.
        System.out.println(txt2.toLowerCase());   // hello world
        // toLowerCase()는 모두 소문자 출력.

        String txt3 = "Hello World";
        System.out.println(txt3.indexOf("World")); // 6

        String firstName = "jun";
        String lastName = "bum";
        System.out.println(firstName + lastName); // junbum
        System.out.println(firstName.concat(lastName)); // junbum

        // 특수문자 출력 ( \' => ' ), ( \" => " ), ( \\ => \ )
        /*
            기본 특수 명령어
            \n : 줄내림
            \t : 탭
            \b : Backspace
        */

    }
}
