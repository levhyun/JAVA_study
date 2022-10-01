// 람다

import java.util.ArrayList;
import java.util.function.Consumer;

public class D1_Lambda_Expressions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
        arr.forEach((n) -> {
            System.out.println(n);
        });

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        arr.forEach(method);
    }
}