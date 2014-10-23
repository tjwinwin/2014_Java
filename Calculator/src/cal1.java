
public class cal1 {
	static int add(int a, int b){
		return a + b;
	}
	static int sub(int a, int b){
		return a - b;
	}
	static int mul(int a, int b){
		return a * b;
	}
	static int div(int a, int b){
		return a / b;
	}
	
	public static void main(String[] args){
		System.out.println("덧셈결과: " + cal1.add(1,2));
		System.out.println(cal1.sub(1,2) + "뺄셈결과 : ");
		System.out.println(cal1.mul(1,2) + " 곱셈결과 :");
		System.out.println("나눗셈결과 : " + cal1.div(1,2));
	}
}

