
public class StringCal3 {
	static int add(String text){
		if (text.isEmpty()){
			return 0;
		}
		
		String[] values = split(text);
		int[] numbers = toInt(values);
		return sum(numbers);
	}
	
	static int sum(int[] numbers){
		int sum = 0;
		for (int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		return sum;
	}
	
	static int[] toInt(String[] values){
		int[] numbers = new int[values.length];
		for (int i = 0; i < values.length; i++){
			numbers[i] = Integer.parseInt(values[i]);
		}
		return numbers;
	}
	
	static String[] split(String text){
		return text.split(",");
	}
	
	public static void main(String[] args){			//	스플리트 하는 매서
		String[] values = split("1,2");
		for(int i=0; i< values.length; i++){
			System.out.println("values: " + values[i]);
		}
		values = split("3\n4,5");
		for(int i = 0; i<values.length; i++){
			System.out.println("values: " + values[i]);
		}
		int[] numbers = toInt(values);
		for (int i = 0; i < numbers.length; i++){
			System.out.println("numbers: " + numbers[i]);
		}
		int total = sum(numbers);
		System.out.println("total :" + total);
	}
}
