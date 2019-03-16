import java.util.Arrays;
import java.util.Random;

public class TwentySidedDice extends GenericDice {

    public TwentySidedDice() {
        super(Arrays.asList(
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"
        ));
    }

    @Override
    public String roll() {
        return (String) super.randomSide();
    }

    @Override
    public String getType() {
        return "d20";
    }

}
