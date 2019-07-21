package test;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("이게 보이면 리소스가 close() 되는거임");
	}

}
