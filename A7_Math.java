// 수학

public class A7_Math {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10)); // 10
        // 높은 값 출력
        System.out.println(Math.min(5, 10)); // 5
        // 낮은 값 출력
        System.out.println(Math.sqrt(64)); // 8.0
        // 제곱근 출력
        System.out.println(Math.abs(-4.7)); // 4.7
        // 절댓값 출력

        System.out.println(Math.random());
        // 난수(랜덤수) 출력

        int random_num = (int)(Math.random()*101);
        // 0 ~ 100 중의 랜덤으로 수 저장
        System.out.println(random_num);
    }
}
