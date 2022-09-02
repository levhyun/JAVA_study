// 배열

public class A10_Array {
    public static void main(String[] args) {
        System.out.println("for으로 배열 data 출력");
        String[] arr = {"a", "b", "c", "d", "e"}; // 배열 선언
        // *배열변수명.length => 배열 data 수
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\nfor-each으로 배열 data 출력");
        for (String i2 : arr) {
            System.out.println(i2);
        }

        // 2차원 배열
        int[][] two_arr = {{1,2,3,4},{5,6,7,8}};
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                System.out.println(two_arr[i3][i4]);
            }
        }
    }
}
