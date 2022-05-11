package com.day22;

public class Member {
		private String id;
		private String name;
		
		Member(String id, String name) {
			this.id=id;
			this.name=name;
		}
		
		public String toString() {
			return "Member[id="+id+", name="+name+"]";
		}
}