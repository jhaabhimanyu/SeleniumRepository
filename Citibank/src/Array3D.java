
public class Array3D {

	public static void main(String[] args) {
		System.out.println("Printing 3d array");
		
		int[][][] array = new int [2][3][4];
		
		System.out.println(array.length);
		
		
		  for(int i=0;i<array.length;i++) {
			  for(int j=0;j<array[i].length;j++) {
				  for(int k=0;k<array[i][j].length;k++) {
					  array[i][j][k] = (int) (Math.random()*1000);
					  System.out.print(array[i][j][k]+ " ");
				  }
				  System.out.println();
			  }
			  System.out.println();
			  
		  }
		 

	}

}
