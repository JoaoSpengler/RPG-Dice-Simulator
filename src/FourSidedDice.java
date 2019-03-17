import java.util.Arrays;

public class FourSidedDice extends GenericDice {

    public FourSidedDice() {
        super(Arrays.asList(
            "1", "2", "3", "4"
        ));
    }

    @Override
    public String roll() {
        return (String) super.randomSide();
    }

    @Override
    public String getType() {
        return "d4";
    }

}
