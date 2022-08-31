// 데이터 유형

public class A3_DataType {
    public static void main(String[] args){
        /*
            기본 데이터 유형
            - byte, short, int, long, float, double, boolean, char
        */

        byte byte_num = 100;
        System.out.println(byte_num);
        // byte(1byte) : -128 ~ 127 사이의 정수를 저장합니다.

        short short_num = 5000;
        System.out.println(short_num);
        // short(2bytes) : -32,768 ~ 32,767 사이의 정수를 저장합니다.

        int int_num = 100000;
        System.out.println(int_num);
        // int (4bytes) : -2,147,483,648 ~ 2,147,483,647 사이의 정수를 저장합니다.

        long long_num = 15000000000L;
        System.out.println(long_num);
        //long(8bytes) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807까지의 정수를 저장합니다.

        /*
            float 또는 double?

            부동 소수점 값의 정밀도는 소수점 이하 값이 가질수 있는 자릿수를 나타냅니다.
            float 변수의 정밀도는 6 또는 7자리에 불과하지만
            double 변수의 정밀도는 약 15자리입니다.
            double 따라서 대부분의 계산에 사용하는 것이 더 안전합니다.
        */
        float float_num = 5.75f;
        System.out.println(float_num);
        //float(4bytes) : 분수 숫자를 저장합니다. 소수점 6~7자리 저장에 충분

        double double_num = 19.99d;
        System.out.println(double_num);
        // double(8bytes) : 분수 숫자를 저장합니다. 소수점 이하 15자리 저장에 충분

        boolean a = true;
        boolean b = false;
        System.out.println(a);     // true
        System.out.println(b);   // false
        // boolean(1비트) : 참 또는 거짓 값을 저장합니다.

        char c = 'C';
        System.out.println(c);
        // char(2bytes) : 단일 문자/문자 또는 ASCII 값을 저장합니다.

        String Text = "Hello"; // 문자열
        System.out.println(Text); // Hello
    }
}
