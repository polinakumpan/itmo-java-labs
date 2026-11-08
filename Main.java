import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Kartana kartana = new Kartana("Картана", 1);
        Phantump phantump = new Phantump("Фантом", 1);
        Trevenant trevenant = new Trevenant("Дерево", 1);
        Togepi togepi = new Togepi("Тогепи", 1);
        Togetic togetic = new Togetic("Тогетик", 1);
        Togekiss togekiss = new Togekiss("Тогекис", 1);
        b.addAlly(kartana);
        b.addAlly(phantump);
        b.addAlly(trevenant);
        b.addFoe(togepi);
        b.addFoe(togetic);
        b.addFoe(togekiss);
        b.go();
    }
}