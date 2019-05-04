package classtest.interfaceex3;

public class QuickSort implements Sort {

	@Override
	public void asc(int[] arr) {
		System.out.println("QuickSort 오름차순");
	}

	@Override
	public void desc(int[] arr) {
		System.out.println("QuickSort 내림차순");		
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}
}

