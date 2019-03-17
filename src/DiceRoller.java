
public class DiceRoller {

	public void rollDices(GenericDice dice, Integer number, Integer modifier) {
		String rolls[] = new String[number];
		
		for (int i = 0; i < number; i++) {
			rolls[i] = dice.roll();
		}
		
		System.out.println("Rolando %s:".replace("%s", dice.getType()));
		System.out.println(number + " " + dice.getType() + " + (" + modifier + ")");
		System.out.println("Resultado: ");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < number; i++) {
			System.out.println("-Dado " + (i+1) + ": " + rolls[i]);
			sb.append(rolls[i]);
			sb.append(" + ");
		}
		sb.append("(" + modifier + ")");
		System.out.println("-Total: " + sb.toString() + "\n");
	}
	
	
	
}
