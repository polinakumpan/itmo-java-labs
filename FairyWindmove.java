import ru.ifmo.se.pokemon.*;
public final class FairyWindmove extends SpecialMove{
    public FairyWindmove() {
        super(Type.FAIRY, 40, 100);
    }
    @Override protected String describe() {
        return "использует Fairy Wind";
    }
}
