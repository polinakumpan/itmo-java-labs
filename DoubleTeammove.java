import ru.ifmo.se.pokemon.*;
public final class DoubleTeammove extends StatusMove{
    public DoubleTeammove() {
        super(Type.NORMAL, 0, 0);
    }
    @Override protected String describe() {
        return "использует Double Team";
    }
    @Override protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION,1);
    }
}
