class DiceGame {
	private Die die1;
	private Die die2;

	public void play() {
		die1 = new Die();
		die1.roll();
		int faceValue1 = die1.getFaceValue();
		
		die2 = new Die();
		die2.roll();
		int faceValue2 = die2.getFaceValue();

		if (faceValue1 + faceValue2 == 7) {
			System.out.println("Winnner");
		}
		else {
			System.out.println("Try again");
		}
	}

	public static void main(String[] args) {
		DiceGame dieGame = new DiceGame();
		dieGame.play();
	}
}
