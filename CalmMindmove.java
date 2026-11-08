import ru.ifmo.se.pokemon.*;
public final class CalmMindmove extends StatusMove{
    public CalmMindmove() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override protected String describe() {
        return "Использовал Calm Mind";
    }

    @Override protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
}
