public class Dog extends Animal{
    Dog (String n, int a) {
        super(n,a);
    }
    @Override public String makeSound() {
        return "гав";
    }
}
