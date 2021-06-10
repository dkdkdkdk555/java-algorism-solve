package collectionFramework.fifo;
import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍길동"));
		
		while(!messageQueue.isEmpty()) {
			Message mssa = messageQueue.poll();
			switch(mssa.command) {
				case "sendMail":
					System.out.println(mssa.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS" :
					System.out.println(mssa.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(mssa.to + "님에게 Kakaotalk을 보냅니다.");
					break;
			}
		}
		
	}
}
