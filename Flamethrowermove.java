import ru.ifmo.se.pokemon.*;
public final class Flamethrowermove extends SpecialMove {
    public Flamethrowermove() {
        super (Type.FIRE, 90, 100);
    }
    @Override protected String describe() {
        return "использует Flamethrower";
    }
    @Override protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1)
            Effect.burn(p);
    }
}
