abstract public class Animal {
    String name;
    int age;
    static int count =0;
    abstract String makeSound();
    public void hello() {
        System.out.println("Привет, меня зовут " + name + ", мне " + age + ", " + makeSound());
    }
    Animal (String n, int a) {
        name = n;
        age = a;
        count+=1;
    }
}



