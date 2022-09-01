// 반복문

public class A9_Repetition {
    public static void main(String[] args) {
        // while
        /*
            구조

            while (condition) {

            }
        */
        int i = 0;
        while (i < 3) { // i < 5 조건이 참이 될때 까지 반복
            System.out.println(i);
            i++; // 증감
        }

        // do/while
        // 조건이 참인지 확인하기 전에 코드 블록을 한 번 실행한 다음 조건이 참이 될때 까지 반복
        /*
            구조

            do {

            }
            while (condition);
        */
        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        }
        while (i2 < 3);

        // for
        /*
            구조

            for (statement 1; statement 2; statement 3) {

            }
        */
        for (int i3 = 0; i3 < 3; i3++) {
            System.out.println(i3);
        }

        // for-each
        /*
            구조

            for (type variableName : arrayName) {

            }
        */
        String[] cars = {"AUDI", "BENTLEY", "BENZ", "BMW"};
        for (String i4 : cars) {
            System.out.println(i4);
        }

        // break; 루프 break 밖으로 점프하는 데에도 사용
        // continue; 지정된 조건이 발생하면 루프에서 한 번의 반복을 중단하고 루프에서 다음 반복을 계속
        for (int i4 = 0; i4 < 10; i4++) {
            if (i4 % 2 == 0) {
                continue;
            }
            System.out.println(i4);
        }
    }
}
