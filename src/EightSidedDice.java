import java.util.Arrays;
import java.util.Random;

public class EightSidedDice extends GenericDice {

    public EightSidedDice() {
        super(Arrays.asList(
            "1", "2", "3", "4", "5", "6", "7", "8"
        ));
    }

    @Override
    public String roll() {
        return (String) super.randomSide();
    }

    @Override
    public String getType() {
        return "d8";
    }

}
