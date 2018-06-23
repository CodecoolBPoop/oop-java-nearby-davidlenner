import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class NearByElement {
  private int[][] multi = new int[][]{
	{ 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
	{ 1, 3, 5, 7 },
	{ 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
  };
  public int[] nearby(int row, int column, int range){
	
		int elements = 0;
		int fromindex = Math.max(0,column-range);
		int toindex = Math.min(column+range,multi[row].length-1);
		int[] returnArray = new int[toindex-fromindex];
	
		for(int index=fromindex;index<=toindex;index++){
			if (multi[row][index] != multi[row][column]){
				returnArray[elements] = multi[row][index];
				elements++;
			}
		}

	
		return returnArray;
	
  }
	
  public static void main(String[] args) {
	NearByElement element = new NearByElement();
	Scanner num1 = new Scanner(System.in);
	System.out.println("first coordinate:");
	int row = num1.nextInt();
	Scanner num2 = new Scanner(System.in);
	System.out.println("second coordinate:");
	int column = num2.nextInt();
	Scanner num3 = new Scanner(System.in);
	System.out.println("range:");
	int range = num3.nextInt();
	int[] returnd = element.nearby(row,column,range);
	System.out.println(Arrays.toString(returnd));
	

  }
}
