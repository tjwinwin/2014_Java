package birthday;

import java.util.Scanner;

public class BirthDay {

	public static void main(String[] args) {
		System.out.println("날짜를 입력하면 유효성을 판별합니다. \n년도-월-일 순으로 입력하세요. \nInput:");
		Scanner date = new Scanner(System.in).useDelimiter("-");
		
		int yy = date.nextInt();	// year
		int mm = date.nextInt();	// month
		int dd = date.nextInt();	// day
		
		checkInputtedDate(yy, mm, dd);

	}
	
	public static void printRightDate(){
		System.out.println("입력하신 날짜는 유효한 날짜입니다. \n");
	}
	
	public static void printWrongDate(){
		System.out.println("입력하신 날짜가 유효하지 않습니다. \n");
	}	
	
	public static void checkInputtedDate(int yy, int dd, int mm){
		if(yy < 1){
			System.out.println("서기를 입력하세요. \n");
		}
		if(mm <= 0 || mm >=13){				// 1년은 12달 
			printWrongDate();   
		}
		if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){ 
			checkDayTwentieth(dd);			// 31일이 있는 달
		}
		if(mm == 4 || mm == 6 || mm == 9 || mm == 11){	
			checkDayThirtyFirst(dd);		// 31일이 없는 달 
		}
		if(mm == 2){
			if(1 <= dd || dd >= 28){
				printWrongDate();
			}
			if(dd == 29){					// 윤년 판별 (2/29가 가능한 경우) 
				checkLeapYear(yy);
			}
		}
	}
	
	public static void checkDayTwentieth(int dd){
		if(1 <= dd || dd <= 30){
			printRightDate();
		}
		printWrongDate();		
	}
	
	public static void checkDayThirtyFirst(int dd){
		if(1 <= dd || dd<= 31){
			printRightDate();
		}
		printWrongDate();
	}
	
	public static void checkLeapYear(int yy){ // 2월 29일의 경우 윤년인지 확인 
		if(yy % 4 == 0){			// 년도가 4의 배수: 윤년 
			if(yy % 100 == 0){		// 년도가 4의 배수 && 100의 배수: 윤년이 아님 
				if(yy % 400 == 0){	// 년도가 4의 배수 && 100의 배수 && 400의 배수: 윤년 
					printRightDate();
				}
				printWrongDate();
			}
			printRightDate();
		}
		printWrongDate();
	}
}
