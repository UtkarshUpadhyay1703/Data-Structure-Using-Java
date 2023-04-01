package infixToPrifix;

public class Test {

	public static void main(String[] args) {
		try {
			InfixToPrifix itp = new InfixToPrifix();
			itp.infixToPrifix("(A*B)+(C*D)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
