import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args){
		System.out.print("원하는 단 출력기, 원하는 단을 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int i, SIZE = 9;
		
		int number = scanner.nextInt();
//		System.out.println("for문을 통한 구구단 출력");
		int multi[][] = new int[number][number];
		
		if(number >= 2 && number < 10){
//			multi = Gugudan.multiple(number);
		}
				
		else{
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}
		
//		for(i=0; i<multi.length; i++){
//			System.out.println(multi[i]);
//		}
		
		Gugudan.print(multi, number);
	}
}
