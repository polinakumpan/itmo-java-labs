import ru.ifmo.se.pokemon.*;
public final class X_Scissormove extends PhysicalMove {
    public X_Scissormove() {
        super(Type.BUG, 80, 100);
    }
    @Override protected String describe() {
        return "использует X-Scissor";
    }
}