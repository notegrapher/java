import java.util.Scanner;

public class gugudan {
	public static void main(String[] args){
		System.out.print("구구단 출력기, 원하는 단을 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int i, SIZE = 9;
		int multi[] = new int[SIZE];
		
		int number = scanner.nextInt();
//		System.out.println("for문을 통한 구구단 출력");
		if(number >= 2 && number < 9){
			multi = multiple(number);
		}
				
		else{
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}
		
//		for(i=0; i<multi.length; i++){
//			System.out.println(multi[i]);
//		}
		
		print(multi);
	}
	
	public static int[] multiple(int times){
		int[] multi = new int[9];
		
		for(int i=1; i<multi.length+1; i++){
			multi[i-1] = times * i;
		}
		
		return multi;
	}
	
	public static void print(int[] multi){
		for(int i=0; i<multi.length; i++)
			System.out.println(multi[i]);
	}
}
