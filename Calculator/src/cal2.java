
public class cal2 {
	int add(int a, int b){
		return a + b;
	}
	int sub(int a, int b){
		return a - b;
	}
	int mul(int a, int b){
		return a * b;
	}
	int div(int a, int b){
		return a / b;
	}
	
	public static void main(String[] args){
		cal2 cal = new cal2();
		System.out.println("덧셈결과: " + cal.add(1,2));
		System.out.println(cal.sub(1,2) + "뺄셈결과 : ");
		System.out.println(cal.mul(1,2) + " 곱셈결과 :");
		System.out.println("나눗셈결과 : " + cal.div(1,2));
	}
}
