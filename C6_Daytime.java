// 날짜 및 시간

import java.time.LocalDate; // 날짜
import java.time.LocalTime; // 시간

import java.time.LocalDateTime; //  날짜 및 시간
import java.time.format.DateTimeFormatter; // 형식 지정

public class C6_Daytime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date); // 현재날짜
        LocalTime time = LocalTime.now();
        System.out.println(time); // 현재시간

        //  현재 날짜 및 시간
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("\n현재 시간 및 날짜 : "+datetime);

        DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd일 MM월 yyyy년 HH시 mm분 ss초");
        String format_date = datetime.format(Format);
        System.out.println("형식 지정후 : "+format_date);
    }
}
