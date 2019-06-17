class Die {
	public int faceValue;

	public int getFaceValue() {
		return faceValue;
	}

	public void roll() {
		faceValue = (int)(Math.random() * 6) + 1;
	}
}
