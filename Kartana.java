import ru.ifmo.se.pokemon.*;
public final class Kartana extends Pokemon{
    public Kartana (String name, int level) {
        super (name, level);
        setType(Type.GRASS, Type.STEEL);
        setStats(59, 181, 131, 59, 31, 109);
        this.addMove(new AirCuttermove());
        this.addMove(new Swaggermove());
        this.addMove(new CalmMindmove());
        this.addMove(new LeafBlademove());
    }
}
