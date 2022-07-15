package ch03;

public class StringTest {
	public static void main(String[] args) {
		//메모리가 계속 생성되는 예
		String java = new String("java"); //final로 선언
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));
	}
}
