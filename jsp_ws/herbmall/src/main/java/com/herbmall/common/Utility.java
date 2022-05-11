package com.herbmall.common;

import java.sql.Timestamp;
import java.util.Date;

public class Utility {
	public static String displayRe(int step) {
		String result="";
		if(step>0){
			for(int j=0;j<step;j++){
				result+="&nbsp;";
			}
			result+="<img src='../images/re.gif'>";
		}
		return result;
	}
	
	public static String cutString(String title,int len) {
		String result="";
		if(title.length()>len) {
			result=title.substring(0,len)+"...";
		}else {
			result=title;
		}
		return result;
	}

	public static String displayNew(Date regdate) {
		String result="";
		Date today = new Date();
		// getTime() : 1970.01.01 이후 경과된 시간을 밀리초로 나타내는 메소드
		long diff = (today.getTime()-regdate.getTime())/(1000*60*60);
		if(diff<24) {
			result="<img src='../images/new.gif'>";
		}
		return result;
	}
}
