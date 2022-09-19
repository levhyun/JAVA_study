// 열거형
// 상수그룹(변수와 같이 변경할 수 없는 변수)를 나타내는 특수클래스

public class C5_Enumeration {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
//        Level myLevel = Level.MEDIUM;
//        System.out.println(myLevel); // out : MEDIUM

        for (Level myLevel : Level.values()) {
            System.out.println(myLevel);
        }
    }
}
