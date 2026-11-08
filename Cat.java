public class Cat extends Animal {
    Cat (String n, int a) {
        super(n,a);
    }
    @Override public String makeSound() {
        return "мяу";
    }
}
