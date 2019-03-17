public class RunnableMain {

    {
    	DiceRoller roller = new DiceRoller();
        roller.rollDices(new FourSidedDice(), 2, 3);
        roller.rollDices(new SixSidedDice(), 1, -1);
        roller.rollDices(new TenSidedDice(), 1, 0);
        roller.rollDices(new EightSidedDice(), 3, 0);
        roller.rollDices(new TwelveSidedDice(), 1, 5);
        roller.rollDices(new TwentySidedDice(), 1, 0);
    }

    public static void main(String[] args) {
        new RunnableMain();
    }


}
