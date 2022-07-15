package ch03;

public class StringbiulderTest {
	public static void main(String[] args) {
		
		//StringBuilder 단일쓰레드 프로그에 사용권장
		String java = new String("java");
		String android = new String("android");
		//StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)을 보장
		StringBuffer sb = new StringBuffer(android);
		sb.append(android);
		System.out.println(sb);
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		String test = buffer.toString();
		System.out.println(test);
	}
}
