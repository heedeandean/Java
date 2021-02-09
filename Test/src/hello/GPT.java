package hello;

public class GPT {

	public static void main(String[] args) {
		GP<Powder> pp = new GP<Powder>();
		
		pp.setMaterial(new Powder());
//		Powder p = pp.getMaterial();
//		System.out.println(pp);
		pp.printing();
		
		GP<Plastic> pp2 = new GP<Plastic>();
		
		pp2.setMaterial(new Plastic());
//		Plastic p2 = pp2.getMaterial();
//		System.out.println(pp2);
		pp2.printing();
	}

}
