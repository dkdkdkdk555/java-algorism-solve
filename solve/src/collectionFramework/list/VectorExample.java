package collectionFramework.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("인간", "코크는 장코크다.", "장코크"));
		list.add(new Board("인간", "이상규는 상규다.", "이상규"));
		list.add(new Board("동물", "어물정망신은 꼴두기가 시킨다.", "꼴뚜기"));
		list.add(new Board("동물", "하마..!", "하마"));
		list.add(new Board("곤충", "벌레만도 몬한 새끼", "벌레 충"));
		
		list.remove(2); // 꼴뚜기 제거
		list.remove(3); // 곤충 제거
		
		for(Board board : list) {
			System.out.println(board.subject + " : " + board.content + " : " + board.writer);
		}
	}
}
