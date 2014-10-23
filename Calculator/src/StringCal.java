
public class StringCal {
	int add(String text){
		if (text.isEmpty()){										// isEmpty메서드는 비었는지 여부를 판단
			return 0;
		}
		
		if (text.contains(",") || text.contains("\n")){				// contains메서드는 포함되었는지 판단
			String[] numbers = text.split(",|\n");					// split메서드는 이하 괄호 내용의 기준으로 분리
			int sum = 0;
			for(int i = 0; i < numbers.length; i++){				// 
				sum += Integer.parseInt(numbers[i]);
			}
			return sum;
		}
		return Integer.parseInt(text);								// parseInt메서드는 문자를 인트형으로 변환함
	}
	
	public static void main(String[] args){
		StringCal cal = new StringCal();
		System.out.println("1. 빈문자출력: " + cal.add(""));			//	문자열과 add 메서드 리턴값의 합을 출력
		System.out.println("2.  1개출력:  " + cal.add("1"));
		System.out.println("3.  2개출력:  " + cal.add("1,2"));
		System.out.println("4.  3개출력:  " + cal.add("1,2,3"));
		System.out.println("5.  4개출력:  " + cal.add("1,2,3,4"));
		System.out.println("6. 개행출력1:  " + cal.add("1,2\n3"));
		System.out.println("7. 개행출력2:  " + cal.add("1\n2\n3"));
	}
}
