package td;

public class TestCompteur {

	public static void main(String[] args) {
		CompteurOrd c1=new CompteurOrd();
		CompteurCycl c2=new CompteurCycl();
		c1.raz();
		c2.raz();
		for (int i=0;i<51;i++) {
			System.out.println(c1.getCourant()+"          "+c2.getCourant());
			c1.incrementer();
			c2.incrementer();
		}
	}

}
