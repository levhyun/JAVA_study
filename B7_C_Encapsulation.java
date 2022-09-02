// 캡슐화

public class B7_C_Encapsulation {
    private String name; // private : 속성 선언

    // Getter
    public String getName() { // get 메서드는 값을 반환
        return name;
    }

    // Setter
    public void setName(String newName) { // set 메서드는 값을 설정
        this.name = newName;
    }

    public static void main(String[] args) {
        B7_C_Encapsulation object = new B7_C_Encapsulation();
        object.setName("junbum"); // set 메서드에 "junbum"값을 설정
        System.out.println(object.getName()); // get 메서드가 "junbum"을 반환해주어 출력
    }
}
