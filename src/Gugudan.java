import java.util.Scanner;

public class Gugudan {
		public static int[][] multiple(int times){
		int[][] multi = new int[times][times];
		
		for(int i=0; i<times; i++){
			for(int j=0; j<times; j++){
				multi[i][j] = (i+2) * (j+1);
			}
		}
		
		return multi;
	}
	
	public static void print(int[][] multi){
		for(int i=0; i<multi[i].length; i++){
			for(int j=0; j<multi[i].length; j++){
				System.out.println(multi[i][j]);
			}
		}
	}
}
