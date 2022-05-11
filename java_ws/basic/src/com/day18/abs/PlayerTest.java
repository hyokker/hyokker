package com.day18.abs;


abstract class Player{
	protected boolean isPause; //일시정지상태 저장을 위한 변수
	protected int currentPos;  //현재 play 되고있는 위치를 저장하기위한 변수
	
	//추상 클래스도 생성자 있어야 한다
	Player(){
		isPause=false;
		currentPos=0;
	}
	
	/**
	 지정된 위치에서 재생을 시작하는 기능
	 */
	public abstract void play(int pos);
	
	/**
	 재생을 즉시 멈추는 기능 
	 */
	public abstract void stop();
	
	public void play() {
		play(currentPos); // 추상메서드 호출가능
	}
	
	public void pause() {
		if(isPause) {
			isPause=false;
		}else {
			isPause=true;
			stop();
		}
	}
}

class CDPlayer extends Player{
	//부모 클래스의 주상메서드 구현
	public void play(int currentPos) {
		System.out.println(currentPos+"에서 재생을 시작한다");
	}
	
	public void stop() {
		System.out.println("재생을 즉시 멈춘다");
	}
	
	//CDPlayer 클래스에 필요한 멤버 추가
	private int currentTrack;
	
	public void nextTrack() {
		currentTrack++;
		System.out.println("다음 트랙" + currentTrack + "번 으로 이동");
	}
	
	public void prevTrack() {
		if(currentTrack>1) {
			currentTrack--;
			System.out.println("이전 트랙" + currentTrack + "번 으로 이동");
		}
	}
}//
public class PlayerTest {

	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.nextTrack();
		cd.prevTrack();
		cd.play(20);
		cd.pause();
		cd.play();
		cd.stop();
	}

}
