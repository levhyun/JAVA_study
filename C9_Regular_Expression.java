// 자바 정규식

import java.util.regex.Matcher; // 패턴 검색에 사용
import java.util.regex.Pattern; // 패턴 정의(검색에 사용됨)

public class C9_Regular_Expression {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("I", Pattern.CASE_INSENSITIVE);
        // Pattern.CASE_INSENSITIVE : 검색시 대소문자는 무시
        // Pattern.LITERAL : 패턴의 특수문자는 특별한 의미가 없으며 검색시 일반문자로 처리
        // Pattern.UNICODE_CASE : 플래그와 함께 사용하여 CASE_INSENSITIVE && 영문자 이외의 문자도 무시
        Matcher m = p.matcher("abcdefghijklmnopqrstuvwxyz");
        boolean match = m.find();
        if(match)
        {
            System.out.println("찾았다!!");
        }
        else
        {
            System.out.println("못 찾았다ㅠㅠ");
        }
    }
}
