package MyProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//카테고리 인터페이스를 상속받은 Game
public class Game extends Menu{
	
	// 컬랙션 프레임워크 어레이리스트 사용 
	List<String> gameList = new ArrayList<String>(List.of("배틀그라운드","로스트아크","메이플스토리","피파온라인","서든어택"));
	
	// 이하구문 재정의 
	@Override
	public void explain() {
		System.out.println("\nk-gmae 의 특징은 ");
		System.out.println("광대한 게임 세계관과 온라인 서비스 이다.\n"
				+ "한국 게임의 특징은 아니지만 한국 게이머들의 특징은 전세계적으로 유명하다. \n"
				+ "한국 게이머들은 수준 높은 실력과 집중력으로 각 분야에서 기지를 발휘 하고 있다. \n");
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

	
	@Override
	public void recommend() {
		Scanner inputRecomend = new Scanner(System.in);
		try {
			System.out.println("k-game 을 대표 하는 작품 혹은 사용자님이 즐겨하는 게임을 입력해주세요 ");
			System.out.print("입력: ");
			String keyword = inputRecomend.next();
			if (gameList.contains(keyword)){
				System.out.println("해당 작품은 이미 입력 되어있습니다.");	
			}
			else {gameList.add(keyword);}
		
		} catch (Exception e) {inputRecomend.close();}

	}
	
	
}
