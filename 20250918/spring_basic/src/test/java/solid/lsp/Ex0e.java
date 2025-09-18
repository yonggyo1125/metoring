package solid.lsp;

public class Ex0e {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Animal, Dog
        Cat cat = new Cat(); // Animal. Cat
        process(dog);// 하위 클래스 자료형 -> 상위 클래스 자료형
        process(cat); // 하위 클래스 자료형 -> 상위클래스 자료형
    }

    private static void process(Animal animal) { // Dog, Cat
        animal.move();

    }
}
