package hello;

public class Plastic extends Material {
	public void doPrinting() {
		System.out.println("Plastic 재료 출력");
	}

	@Override
	public String toString() {
		return "재료는 Plastic";
	}
	
}
