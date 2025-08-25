public class Main {

	public static void main(String[] args) {
		String winner = "Player One";
		String mageName = JOptionPane.showInputDialog("Enter the Mage's name:");
		String warriorName = JOptionPane.showInputDialog("Enter the Warrior's name:");
		JOptionPane.showMessageDialog(null, winner + " wins the battle!");
	
		//characters
		GameCharacter mage = new Mage(mageName);
		GameCharacter warrior = new Warrior(warriorName);
		
		
		//battle loop
		while (mage.isAlive() && warrior.isAlive()) {
			String mageChoice = JOptionPane.showInputDialog(mage.name + " 's Turn!/Choose an action:/n1. Attack\n2. Special Move");
			int mageDamage = 0;
			if (mageChoice.equals("1")) {
				mageDamage = mage.attack();	
			} else if (mageChoice.equals("2")) {
				mageDamage = mage.specialMove();
			} else {
				JOptionPane.showMessageDialog(null, "Invalid choice. Skipping turn.");
				
			}
			warrior.takeDamage(mageDamage);
			
			if (!warrior.isAlive()) break;
			
			//warriors turn
			String warriorChoice = JOptionPane.showInputDialog(warrior.name + " 's Turn!/nChoose an action:/n1. Attack/n2. Special Move");
			int warriorDamage = 0;
			if (warriorChoice.equals("1")) {
				warriorDamage = warrior.attack();
			} else if (warriorChoice.equals("2")) {
				warriorDamage = warrior.specialMove();
			} else {
				JOptionPane.showMessageDialog(null, "Invalid choice. Skipping Turn.");
								
			}
			mage.takeDamage(warriorDamage);
			
			JOptionPane.showMessageDialog(null, mage.getStatus() + "/n" + warrior.getStatus());
			
		}
		
		String winner2 =  mage.isAlive() ? mage.name : (String) warriorName;
		JOptionPane.showMessageDialog(null, winner + " wins the battle!");


 }

	}
