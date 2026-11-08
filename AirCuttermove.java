import ru.ifmo.se.pokemon.*;
public final class AirCuttermove extends SpecialMove {
    public AirCuttermove() {
        super(Type.FLYING, 60, 95);
    }
    @Override protected String describe() {
        return "использует Air Cutter";
    }
    @Override protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < 0.125)
            return 1.5;
        else
            return 1.0;
    }
}
