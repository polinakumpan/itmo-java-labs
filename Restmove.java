import ru.ifmo.se.pokemon.*;
public final class Restmove extends StatusMove {
    public Restmove() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override protected String describe() {
        return "использует Rest";
    }
    @Override protected void applySelfEffects(Pokemon p) {
        p.restore();
        Effect.sleep(p);
    }
}