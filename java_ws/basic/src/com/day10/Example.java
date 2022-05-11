//package com.day10;
//
//public class Example {
//	public static void main(String[] args) {
//		
//		int[][] arr = {{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30},{45,45,45,45,45}};
//		int sum = 0;
//		double avg = 0.0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");	
//				sum+=arr[i][j];
//			}
//			float avg = (float)sum/(arr.length*arr[0].length)
//		}
//	}
//}
package com.day10;

public class Example {

   public static void main(String[] args) {
      int[][] arr = {         
            {10,10,10,10,10},
            {20,20,20,20,20},
            {30,30,30,30,30},
            {45, 45,45, 45,45}
      };

      int total = 0;
      for(int i=0; i < arr.length;i++) {
         for(int j=0; j < arr[i].length;j++) {
            total += arr[i][j];
         }
      }

      float average = (float)total /(arr.length * arr[0].length);

      for(int i=0; i < arr.length;i++) {
         for(int j=0; j < arr[i].length;j++) {
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
      }
      
      System.out.println("\nÃÑÇÕ : "+total);
      System.out.println("Æò±Õ : "+average);
   }

}