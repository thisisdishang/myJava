/* Create a class named Whistle. Add the variable private String sound to the class. After that, create the constructor public
 Whistle(String whistleSound), which is used to create a new whistle that's given a sound. Then create the method public void sound()
 that prints the whistle's sound. */

class Whistle {
	private String sound;

	public Whistle(String whistleSound) {
		this.sound = whistleSound;
	}

	public void sound() {
		System.out.println("Sound is : " + sound);
	}
}

class Q2 {
	public static void main(String args[]) {
		Whistle duckWhistle = new Whistle("Kvaak");
		Whistle roosterWhistle = new Whistle("Peef");
		duckWhistle.sound();
		roosterWhistle.sound();
		duckWhistle.sound();
	}
}
