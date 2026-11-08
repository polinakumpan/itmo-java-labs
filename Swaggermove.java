import ru.ifmo.se.pokemon.*;
public final class Swaggermove extends StatusMove {
    public Swaggermove () {
        super(Type.NORMAL, 0, 85);
    }
    @Override protected String describe() {
        return "Использует Swagger";
    }
    @Override protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}
