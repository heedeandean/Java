package classtest.interfaceex3;

public interface Sort {
	public void asc(int[] arr);

	public void desc(int[] arr);

	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
}
