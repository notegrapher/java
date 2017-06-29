import java.util.Scanner;

public class gugudan {
	public static void main(String[] args){
		System.out.print("구구단 출려기, 원하는 단을 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int result = number * 1;
		System.out.println(result);
		
	}
}
