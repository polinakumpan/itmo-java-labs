public class Mainpr {
    public static void mainpr (String[] args){
        Animal[] animals= {
            new Cat ("Armik", 14),
            new Dog ("Barbos", 6),
            new Cat ("Belka", 14),
        };
        for (Animal a : animals) {
            a.hello();
        }
        System.out.println("Всего животных "+ Animal.count);
    }
}
