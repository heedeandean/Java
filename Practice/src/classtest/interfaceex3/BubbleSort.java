package classtest.interfaceex3;

public class BubbleSort implements Sort {

	@Override
	public void asc(int[] arr) {
		System.out.println("BubbleSort 오름차순");
	}

	@Override
	public void desc(int[] arr) {
		System.out.println("BubbleSort 내림차순");		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}
}
