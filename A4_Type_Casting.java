// 타입 캐스팅

public class A4_Type_Casting {
    public static void main(String[] args) {
        /*
            유형 캐스팅은 한 기본 데이터 유형의 값을 다른 유형에 할당하는 경우입니다.

            확대 캐스팅 (자동) - 더 작은 유형을 더 큰 유형 크기로 변환
            byte -> short -> char -> int -> long -> float -> double

            내로우 캐스팅 (수동) - 큰 유형을 작은 크기 유형으로 변환
            double -> float -> long -> int -> char -> short -> byte
        */

        int Int = 1;
        double Double = Int;
        System.out.println(Int); // 1
        System.out.println(Double); // 1.0
        // 확대 캐스팅은 더 작은 크기 유형을 더 큰 크기 유형으로 전달할 때 자동으로 수행됩니다.

        double Double2 = 1.0d;
        int Int2 = (int)Double2;
        System.out.println(Double); // 1.0
        System.out.println(Int); // 1
    }
}
