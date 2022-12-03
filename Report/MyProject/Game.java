package MyProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//카테고리 인터페이스를 상속받은 Game
public class Game implements Category{

	List<String> gameList = new ArrayList<>(List.of("배틀그라운드","로스트아크","메이플스토리","피파온라인","서든어택"));
	
	// 이하구문 재정의 
	@Override
	public void explain() {
		System.out.println("game explan");
		
	}

	@Override
	public void representing() {
		System.out.println("\nk-game 을 대표하는 작품들은 다음과 같습니다. ");
		System.out.println();
		for(int i = 0; i < gameList.size();i++) {
			System.out.print(gameList.get(i)+" ");
		}
		System.out.println();
	}

	Scanner inputRecomend = new Scanner(System.in);
	@Override
	public void recommend() {
	
		System.out.println("k-game 을 대표 하는 작품을 입력해주세요 ");
		System.out.print("입력: ");
		String keyword = inputRecomend.next();
		
		gameList.add(keyword);

	}
	public void exit() {
		inputRecomend.close();	
	}
	
}
