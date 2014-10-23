
public class cal3 {
	int num;
	
	cal3(int b){		//클래스명과 다를시 매소드를 미싱했다고 뜸 
		this.num = b;
	}
	int add(int a){
		return num + a;
	}
	int sub(int a){
		return num - a;
	}
	int mul(int a){
		return num * a;
	}
	int div(int a){
		return num / a;
	}
	int na(int a){
		return num % a;
	}
	
	public static void main(String[] args){
		cal3 number = new cal3(3);
		System.out.println("덧셈결과 : " + number.add(4));
		System.out.println("뺄셈결과 : " + number.sub(4));
		System.out.println("곱셈결과 : " + number.mul(4));
		System.out.println("나눗셈결과 : " + number.div(4) +" (몫)");
		System.out.println("나눗셈결과 : " + number.na(4) +" (나머지)");
	}	
}
