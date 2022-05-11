package com.day18.abs;


abstract class Player{
	protected boolean isPause; //�Ͻ��������� ������ ���� ����
	protected int currentPos;  //���� play �ǰ��ִ� ��ġ�� �����ϱ����� ����
	
	//�߻� Ŭ������ ������ �־�� �Ѵ�
	Player(){
		isPause=false;
		currentPos=0;
	}
	
	/**
	 ������ ��ġ���� ����� �����ϴ� ���
	 */
	public abstract void play(int pos);
	
	/**
	 ����� ��� ���ߴ� ��� 
	 */
	public abstract void stop();
	
	public void play() {
		play(currentPos); // �߻�޼��� ȣ�Ⱑ��
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
	//�θ� Ŭ������ �ֻ�޼��� ����
	public void play(int currentPos) {
		System.out.println(currentPos+"���� ����� �����Ѵ�");
	}
	
	public void stop() {
		System.out.println("����� ��� �����");
	}
	
	//CDPlayer Ŭ������ �ʿ��� ��� �߰�
	private int currentTrack;
	
	public void nextTrack() {
		currentTrack++;
		System.out.println("���� Ʈ��" + currentTrack + "�� ���� �̵�");
	}
	
	public void prevTrack() {
		if(currentTrack>1) {
			currentTrack--;
			System.out.println("���� Ʈ��" + currentTrack + "�� ���� �̵�");
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
