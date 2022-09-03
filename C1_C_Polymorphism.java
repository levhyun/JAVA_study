// 다중 상속 / 다형성
class Animal {
    public void animal() {
        System.out.println("The animal");
    }
}

class Cat extends Animal {
    public void animal() {
        System.out.println("Cat");
    }
}

class Dog extends Animal {
    public void animal() {
        System.out.println("Dog");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myCat = new Cat();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object

        myAnimal.animal();
        myCat.animal();
        myDog.animal();
    }
}