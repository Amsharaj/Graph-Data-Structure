package FFA;

public class FloodFillAlgorithm {

	public static void main(String[] args) {
		int[][]image= {{1,1,1,2,2},{1,1,1,2,2},{1,1,2,2,2},{3,3,3,3,3},{3,3,3,3,3}};
		
		System.out.println("Original Image: ");
		printImage(image);
		int startRow=2,StartCol=2;
		int oldColor=image[startRow][StartCol];
		int newColor=4;
		
		floodFill(image,startRow,StartCol,oldColor,newColor);
		
		System.out.println("\nImage after Flood Fill: ");
		printImage(image);
				
		

	}

	private static void floodFill(int[][] image, int row, int col, int oldColor, int newColor) {
		int rows=image.length;
		int cols=image[0].length;
		
		if(row<0||row>=rows||col<0||col>=cols||image[row][col]!=oldColor) {
			return;
		}
		
		//Change the color in current pixel
		image[row][col]=newColor;
		
		floodFill(image,row+1,col,oldColor,newColor);  //Down
		floodFill(image,row-1,col,oldColor,newColor);  //Up
		floodFill(image,row,col+1,oldColor,newColor);   //Right
		floodFill(image,row,col-1,oldColor,newColor);   //Left
		
	}

	private static void printImage(int[][] image) {
		for(int[] row:image) {
			for(int pixel:row) {
				System.out.print(pixel+" ");
			}
			System.out.println();
		}
		
	}

}
