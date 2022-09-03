// 상속

/*
    Java 에서는 한 클래스에서 다른 클래스로 속성과 메서드를 상속할 수 있다

    - 하위 클래스 (자식) - 다른 클래스에서 상속하는 클래스
    - 상위 클래스 (부모) - 상속되는 클래스
*/

class Brand {
    String brand = "Bentley";
    public void out() {
        System.out.println("내 차는");
    }
}

class Car extends Brand { // 상위 클래스 ( 키워드 : extends )
    /*
        구조 : class 상위클래스명 extends 하위클래스명
    */
    String model = "Continental GT Speed";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.out();
        System.out.println(myCar.brand + " " + myCar.model);
    }
}

