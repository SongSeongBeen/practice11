package ch02;

public class EqualsTest {
	public static void main(String[] args) {
		Student std1 = new Student(100, "송");
		Student std2 = new Student(100, "송");
		Student std3 = std1;
		
		
		System.out.println(std1 == std3);
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); //물리적으로 다르지만 논리적으로 같다라고 재정의함
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1)); //실제 가상 메모리값 확인
		System.out.println(System.identityHashCode(std2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//멤버 변수로 같을때 정의해주면된다.	
		Integer i = 100;                 
		System.out.println(i.hashCode());
	}
}
