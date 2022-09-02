// 재귀

public class B2_Recursive {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
            // sum 함수안에서 sum 함수를 호출 후 리턴하면서 연산 후 코드 종료
        }
        else {
            return 0;
        }
    }
}
