import java.util.Arrays;
import java.util.Random;

public class SixSidedDice extends GenericDice {

    public SixSidedDice() {
        super(Arrays.asList(
            "1", "2", "3", "4", "5", "6"
        ));
    }

    @Override
    public String roll() {
        return (String) super.randomSide();
    }

    @Override
    public String getType() {
        return "d6";
    }

}
