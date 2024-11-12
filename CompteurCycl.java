package td;

public class CompteurCycl extends Compteur{
	public static final int MAX=4;
	public CompteurCycl() {
		super();
	}
	public void incrementer() {
		if (this.courant==MAX)
			this.courant=MIN;
		else this.courant++;
	}
}
