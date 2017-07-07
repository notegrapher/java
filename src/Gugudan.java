import java.util.Scanner;

public class Gugudan {
//		public static int[][] multiple(int times){
//		int[][] multi = new int[times][times];
//		
//		for(int i=0; i<times; i++){
//			for(int j=0; j<times; j++){
//				multi[i][j] = (i+2) * (j+1);
//			}
//		}
//		
//		return multi;
//		}
	
	public static void print(String[] strArray){
		String timesI = strArray[0];
		String timesJ = strArray[1];
		
		for(int i=0; i < Integer.parseInt(timesI)-1; i++){
			for(int j=0; j < Integer.parseInt(timesJ); j++){
				System.out.println((i+2) + " * " + (j+1) + " = " + (i+2) * (j+1));
			}
		}
	}
}
