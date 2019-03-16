import java.util.List;
import java.util.Random;

public abstract class GenericDice {

    private List<String> sides;
    private Random random;

    public GenericDice(List<String> list) {
        this.sides = list;
        this.random = new Random();
    }

    public List<String> getSides() {
        return sides;
    }

    public Object randomSide() {
        return sides.get(random.nextInt(sides.size()));
    }

    public abstract String getType();
    public abstract String roll();

}
