// 배열 목록

import java.util.ArrayList; // 배열 라이브러리
import java.util.Collections; // 정렬 라이브러리
import java.util.LinkedList; // Linkedlist (=Arraylist)
import java.util.HashMap; // HashMap 라이브러리
import java.util.HashSet; // HashSet 라이브러리
import java.util.Iterator; // 배열 반복자 라이브러리


public class C7_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(); // 벼열 선언
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

        ArrayList<String> test = new ArrayList<>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        System.out.println(test.size()); // 배열 값 갯수 출력


        // 정수 배열
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(2);
        num.add(4);
        for (int i : num) {
            System.out.println(i);
        }

        Collections.sort(num); // sort 정렬
        System.out.println(num);


        LinkedList<String> arr2 = new LinkedList<>(); // 링크드리스트 선언
        arr2.add("1");
        arr2.add("2");
        arr2.add("3");
        arr2.add("4");
        System.out.println(arr2);

        // HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        hm.put("D", 4);
        for (String i : hm.keySet()) {
            System.out.println("name : "+ i +"\n(" + i + ")number : " + hm.get(i));
        }

        // HashSet
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(16);
        for (int i = 1; i <= 20; i++) {
            if (numbers.contains(i)) { // 배열변수.contains(값1) <= 배열에서 값1이 있는지 확인
                System.out.println(i);
            }
            else {
                System.out.println("ERROR");
            }
        }

        // iterator
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Iterator<String> it = cars.iterator();
        System.out.printf("\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("["+it.next()+"]");
        }
    }
}
