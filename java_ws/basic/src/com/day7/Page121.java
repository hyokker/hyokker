package com.day7;
public class Page121 {

	public static void main(String[] args) {
//		//Loop continue 이용하여 반복문 탈출 후 다음 반복문 시작
//		Loop1:for(int i=2; i<=9; i++) {
//				for(int j=1; j<=9; j++) {
//				if(j==3) {break Loop1;
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
//		
//		System.out.println("\n");
//		Loop2:for(int i=4; i<=9; i++) {
//				for(int j=1; j<=9; j++) {
//					if(j==5) break Loop2;
//			
//			System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
//		
//		System.out.println("\n");
//		Loop3:for(int i=6; i<=9; i++) {
//				for(int j=1; j<=9; j++) {
//					if(j==7)break Loop3;
//			
//			System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
//		
//		System.out.println("\n");
//		Loop4:for(int i=8; i<=9; i++) {
//				for(int j=1; j<=9; j++) {
//					if(j==9)break Loop4;
//			
//			System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
		
		for(int i=2;i<=8;i+=2) {
			for(int j=1;j<=i;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
				System.out.println("");
		}
	}
}


