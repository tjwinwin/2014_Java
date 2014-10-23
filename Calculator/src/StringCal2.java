
public class StringCal2 {
	int add(String text){
		if (text.isEmpty()){										
			return 0;
		}
		
		String[] numbers = text.split(",|\n");			// 구분의 문자가 없을 경우 (0개, 1개) 그냥 그 자체를 문자열 배열로 담는다						
		int[] values = toInt(numbers);
		return sum(values);
	}
	
	int[] toInt(String[] numbers){						// toInt매서드는 문자열의 배열을 반환받
		int[] values = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++){
			values[i] = Integer.parseInt(numbers[i]);
		}
		return values;
	}
	
	int sum(int[] numbers){
		int sum = 0;
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		return sum;
	}
	
	public static void main(String[] args){
		StringCal2 cal = new StringCal2();
		System.out.println("1. 빈문자출력: " + cal.add(""));			
		System.out.println("2.  1개출력:  " + cal.add("1"));
		System.out.println("3.  2개출력:  " + cal.add("1,2"));
		System.out.println("4.  3개출력:  " + cal.add("1,2,3"));
		System.out.println("5.  4개출력:  " + cal.add("1,2,3,4"));
		System.out.println("6. 개행출력1:  " + cal.add("1,2\n3"));
		System.out.println("7. 개행출력2:  " + cal.add("1\n2\n3"));
	}
}
