import java.util.Scanner;

public class gugudan {
	public static void main(String[] args){
		System.out.print("구구단 출력기, 원하는 단을 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int i;
		int number = scanner.nextInt();
//		System.out.println("for문을 통한 구구단 출력");
		if(number >= 2 && number < 9){
			for(i=1; i<10; i++){
				int result = number * i;
				System.out.println(result);	
			}
		}
		
		else{
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}
//		i = 1;
//		System.out.println("while문을 통한 구구단 출력");
//		while(i < 10){
//			int result = number * i;
//			System.out.println(result);
//			i++; 
//			// i = i + 1;
//		}
		
//		반복되는 logic에는 반복문!
//		result = number * 2;
//		System.out.println(result);
//		result = number * 3;
//		System.out.println(result);
//		result = number * 4;
//		System.out.println(result);
//		result = number * 5;
//		System.out.println(result);
//		result = number * 6;
//		System.out.println(result);
//		result = number * 7;
//		System.out.println(result);
//		result = number * 8;
//		System.out.println(result);
//		result = number * 9;
//		System.out.println(result);
		
	}
}
