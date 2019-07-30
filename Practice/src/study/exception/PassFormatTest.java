package study.exception;

public class PassFormatTest {
	private String userPass;

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) throws PasswordException {
		if (userPass == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if (userPass.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상으로 쓰세요.");
		} else if (userPass.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호가 문자로만 이루어져있습니다.");
		}
		this.userPass = userPass;
	}

	public static void main(String[] args) {
		PassFormatTest pass = new PassFormatTest();

		String userPass = "1234";
		try {
			pass.setUserPass(userPass);
			System.out.println("이상 없을 시 출력됨");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
