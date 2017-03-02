package InterfaceTes;

public class FirstClass implements B {
	@Override
	public void testB1(String v) {
		// TODO Auto-generated method stub
		System.out.println("fdfdfdfdfdfdfdfdfdfdfd");
	}
	
	public static void main(String[] args) {
		B c = new FirstClass();
		System.out.println(FirstClass.class);
	}
}
