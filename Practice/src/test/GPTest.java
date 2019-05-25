package test;

public class GPTest {

	public static void main(String[] args) {
		
		var pP = new GP<Powder>();
		pP.setMaterial(new Powder());
		Powder p = pP.getMaterial();
		System.out.println(pP);
		pP.printing();
		
		System.out.println();
		
		GP<Plastic> plaP = new GP<Plastic>();
		plaP.setMaterial(new Plastic());
		Plastic pla = plaP.getMaterial();
		System.out.println(plaP);
		plaP.printing();
	}

}
