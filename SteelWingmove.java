import ru.ifmo.se.pokemon.*;
public final class SteelWingmove extends PhysicalMove {
    public SteelWingmove() {
        super (Type.STEEL, 70, 90);
    }
    @Override protected String describe(){
        return "использует Steel Wing";
    }

    @Override protected void applySelfEffects(Pokemon p) {
        if (Math.random() < 0.1)
            p.setMod(Stat.DEFENSE,1);
    }
}
