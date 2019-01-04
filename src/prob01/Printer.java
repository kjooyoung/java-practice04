package prob01;

public class Printer {
	
//	public void println(int i) {
//		System.out.println(i);
//	}
//	
//	public void println(String s) {
//		System.out.println(s);
//	}
//	
//	public void println(boolean b) {
//		System.out.println(b);
//	}
//	
//	public void println(double d) {
//		System.out.println(d);
//	}
	
	public <T> void println(T t) {
		System.out.println(t);
	}
	
	//가변 변수 (파라미터 값의 개수를 정하지 않고 다 받을 때)
	public int sum(Integer... nums) {
		Integer sum = 0;
		for(Integer i : nums) {
			sum += i;
		}
		return sum;
	}
	
	//제네릭을 사용한 가변 변수
	public <T> void println(T...ts) {
		for(T t : ts) {
			System.out.println(t);
		}
	}
}
