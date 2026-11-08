import ru.ifmo.se.pokemon.*;
public final class Growthmove extends StatusMove {
    public Growthmove() {
        super(Type.NORMAL, 0, 0);
    }
    @Override protected String describe() {
        return "использует Growth";
    }
    @Override protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}