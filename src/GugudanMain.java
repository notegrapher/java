import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args){
		System.out.print("원하는 단 출력기, 원하는 단을 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int i, SIZE = 9;
		
//		int number = scanner.nextInt();
		String str = scanner.nextLine();
		String[] strArray = str.split(" ");
		Gugudan.print(strArray);
	}
}
