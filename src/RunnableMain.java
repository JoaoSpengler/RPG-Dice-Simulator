public class RunnableMain {

    {
        FourSidedDice dice = new FourSidedDice();
        System.out.println("Rolando um D4:");
        System.out.println(dice.roll());
        
        SixSidedDice d6 = new SixSidedDice();
        System.out.println("Rolando um D6:");
        System.out.println(d6.roll());
        
        TenSidedDice d10 = new TenSidedDice();
        System.out.println("Rolando um d10");
        System.out.println(d10.roll());
        
        EightSidedDice d8 = new EightSidedDice();
        System.out.println("Rolando um d8:");
        System.out.println(d8.roll());
        
        TwelveSidedDice d12 = new TwelveSidedDice();
        System.out.println("Rolando um d12:");
        System.out.println(d12.roll());
        
        TwentySidedDice d20 = new TwentySidedDice();
        System.out.println("Rolando um D20!");
        System.out.println(d20.roll());
        
       
    }

    public static void main(String[] args) {
        new RunnableMain();
    }


}
