package classtest.interfaceex3;

public class HeapSort implements Sort {

	@Override
	public void asc(int[] arr) {
		System.out.println("HeapSort 오름차순");
	}

	@Override
	public void desc(int[] arr) {
		System.out.println("HeapSort 내림차순");		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}
}

