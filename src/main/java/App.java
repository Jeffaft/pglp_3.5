
public enum App {
	ENVIRONNEMENT;
	public void run(String[]args) {
		UneClasseMetier m = new UneClasseMetier();
		m.uneMethodeMetier();
	}
	public static void main(String[]args) {
	ENVIRONNEMENT.run(args);
	}
}