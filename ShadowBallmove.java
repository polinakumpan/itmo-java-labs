import ru.ifmo.se.pokemon.*;
public final class ShadowBallmove extends SpecialMove {
    public ShadowBallmove() {
        super(Type.GHOST, 80, 100);
    }
    @Override protected String describe() {
        return "использует Shadow Ball";
    }
    @Override protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}