//package com.day10;
//
//public class DimentionTest2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double[][] dArr;
//		dArr = new double[3][2];
//		
//		dArr[0][0] = 10.1;
//		dArr[0][1] = 10.2;
//		dArr[1][0] = 10.3;
//		dArr[1][1] = 10.4;
//		dArr[2][0] = 10.5;
//		dArr[2][1] = 10.6;
//	
//		//1�� ����
//		for(int i=0;i<dArr.length;i++) {
//			for(int j=0;j<dArr[i].length;j++) {
//				System.out.println("dArr"+"["+i+"]"+"["+j+"]"+"="+dArr[i][j]);
//			}//���� for
//		}//�ٱ� for
//		
//		
//		//2�� ����
//		String[] season;
//		season = new String[4];
//		season[0] = "��";
//		season[1] = "����";
//		season[2] = "����";
//		season[3] = "�ܿ�";
//		
//		for(int i=0;i<season.length;i++) {
//			System.out.println("season"+"["+i+"]"+"="+ season[i]);
//		}
//		
//		for(String str : season) {
//			System.out.println("season = "+str);
//		}
//		System.out.println("\n\n=========");
//		
//		
//		//3�� ���� dArr2 = 6�� 0 1 2 3 4 5 i = 0 ; i<6
////		10.1  0.1 ����
////		10.2 
////		10.3
////		10.4
////		10.5
////		10.6
//		double[][] dArr2= new double[3][2];
//		int n = 0;		
//		for(int i=0;i<dArr2.length;i++) {
//			for(int j=0;j<dArr2[i];j++) {
//				dArr[i][j]=10+(++n/10.0);
//					}
//				System.out.println(dArr2[i]);
//			}
//		
//		
//		
//	}
//
//}
package com.day10;

public class DimentionTest2 {

   public static void main(String[] args) {
      double[][] twoArr=new double[3][2];

      int n=0;
      for (int i=0;i<twoArr.length ;i++ )   {
         for (int j=0;j<twoArr[i].length ;j++ ){
            twoArr[i][j]=10+(++n/10.0);
         }
      }//for
      
      for (int i=0;i<twoArr.length ;i++ )   {
         for (int j=0;j<twoArr[i].length ;j++ ){
            System.out.println("twoArr["+i+"]["+j+"]="+twoArr[i][j]);
         }
      }//for
            
      int row = twoArr.length;  //��
      int col = twoArr[0].length; //��
      double[] oneArr = new double[row * col];

      for (int i=0;i<row ;i++ ){
         for (int k=0;k<col ;k++ ){
            oneArr[col * i+k] = twoArr[i][k];
            //[column�� ũ��*row+column] <= [row][column]
         }
      }//for

      System.out.println();
      for (double num: oneArr){
         System.out.print(num  +"\t");
      }

   }

}