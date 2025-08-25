package act;

public class Warrior extends GameCharacter {
	public Warrior(String name) {
		super(name, 120, 15);
		
	}

	@Override
	public int attack() {
		System.out.println(name + " swings his swords!");
		return attack();
		
	}
	

	@Override
	public int specialMove() {
		System.out.println(name + " uses Shield Bash!");
		return attack() + 20;
		
		
	}

}
