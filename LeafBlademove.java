import ru.ifmo.se.pokemon.*;
public final class LeafBlademove extends PhysicalMove{
    public LeafBlademove() {
        super(Type.GRASS, 90, 100);
    }
    @Override protected String describe() {
        return "использует Leaf Blade";
    }
    @Override protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < 0.125)
            return 1.5;
        else
            return 1.0;
    }
}
