package com.day18;

public class DownCastArray {
	public static void main(String[] args) {
		//Car 배열에 요소 3개 넣고, drive() 메서드 호출(for, 확장for)
		Car[] c = new Car[3];
		c[0]= new Ambulance();
		c[1]= new FireEngine();
		c[2]= new Ambulance();
		
		for(int i=0;i<c.length;i++) {
			c[i].drive();
		}
		
		System.out.println("\n");
		
		for(Car cc : c ) {
			cc.drive();
		}
		
		 System.out.println("\nDown Castingx");
	     for(int i=0;i<c.length;i++) {
	         if(c[i] instanceof FireEngine) {
	            FireEngine f = (FireEngine)c[i];
	            f.water();
	         }else if(c[i] instanceof Ambulance) {
	            Ambulance am = (Ambulance)c[i];
	            am.siren();
	         }
	      }//for
	      
	      System.out.println("\n--------------");
	      
	      for(Car cc: c) {
	         if(cc instanceof FireEngine) {
	            FireEngine f = (FireEngine)cc;
	            f.water();
	         }else if(cc instanceof Ambulance) {
	            Ambulance am = (Ambulance)cc;
	            am.siren();
	         }
	      }//for
	   }

	}