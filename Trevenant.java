import ru.ifmo.se.pokemon.*;
public final class Trevenant extends Phantump {
    public Trevenant (String name, int level) {
        super (name, level);
        setType(Type.GHOST, Type.GRASS);
        setStats(85,110,76,65,82,56);
        this.addMove(new X_Scissormove());
    }
}
