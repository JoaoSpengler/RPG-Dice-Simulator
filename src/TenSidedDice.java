import java.util.Arrays;
import java.util.Random;

public class TenSidedDice extends GenericDice {

    public TenSidedDice() {
        super(Arrays.asList(
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
        ));
    }

    @Override
    public String roll() {
        return (String) super.randomSide();
    }

    @Override
    public String getType() {
        return "d10";
    }

}
