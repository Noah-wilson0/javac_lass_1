/*
 * 여러개의 부모클래스 상속 안됨-extends 뒤에는 단 하나의 부모 클래스만...
 * private 접근 제한을 갖는 필드와 매소드는 상속대상에서 제외
 */
package chap10;

public class DmbCellphone extends Cellphone{
	//필드
		int channel;
		//생성자
		DmbCellphone(String model, String color,int channel){
			this.model=model;
			this.color=color;
			this.channel=channel;
		}
		//메소드
		void turnOnDmb() {
			System.out.println("channel"+channel+"DMB start receiving broadcasts");
		}
		void changeChannelDmb(int channel) {
			this.channel=channel;
			System.out.println("채널"+channel+"변경.");
		}
		
	    void turnOffDmb(){
	        System.out.println("방송수신종료");
	    }
}
