// 배열 목록

import java.util.ArrayList; // 배열 라이브러리
import java.util.Collections; // 정렬 라이브러리
import java.util.LinkedList; // Linkedlist (=Arraylist)


public class C7_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(); // 벼열 선언
        arr.add("1"); // 배열에 값 추가
        arr.add("2");
        arr.add("3");
        arr.add("4");
        System.out.println(arr); // 배열 출력
        System.out.println(arr.get(1)); // 배열에서 index번호의 값 출력
        arr.set(1, "9"); // 배열에서 index번호의 값 변경
        System.out.println(arr.get(1));
        arr.remove(3); // 배열에서 index번호의 값 삭제
        arr.clear(); // 배열 초기화

        ArrayList<String> test = new ArrayList<String>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        System.out.println(test.size()); // 배열 값 갯수 출력


        // 정수 배열
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(3);
        num.add(2);
        num.add(4);
        for (int i : num) {
            System.out.println(i);
        }

        Collections.sort(num); // sort 정렬
        System.out.println(num);


        LinkedList<String> arr2 = new LinkedList<String>(); // 링크드리스트 선언
        arr2.add("1");
        arr2.add("2");
        arr2.add("3");
        arr2.add("4");
        System.out.println(arr2);
    }
}
