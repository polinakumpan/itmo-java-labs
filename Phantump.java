import ru.ifmo.se.pokemon.*;
public class Phantump extends Pokemon {
    public Phantump (String name, int level) {
        super (name,level);
        setType(Type.GHOST, Type.GRASS);
        setStats(43,70,48,50,60,38);
        this.addMove(new Restmove());
        this.addMove(new Growthmove());
        this.addMove(new ShadowBallmove());
    }
}

