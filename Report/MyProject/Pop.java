package MyProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 카테고리 인터페이스를 상속받은 pop 
public class Pop implements Category{
	
	// 컬랙션 프레임워크 어레이리스트 사용 
	List<String> popList = new ArrayList<String>(List.of("BTS", "블랙핑크", "싸이", "EXO", "트와이스", "빅뱅", "소녀시대"));
	
	@Override
	public void explain() {
		System.out.println("\nk-pop 의 특징은 ");
		System.out.println("케이팝 아이돌 음악의 특징은 단순하고 경쾌한 리듬 과 비트감을 갖고있고"
				+ "따라 부르기 쉬운 멜로디 신선한 가사가 두드러진다.\n"
				+ "또한 멋진 댄스 실력으로 선보이는 군무를 통한 시각적인 요소가 특징이라고 할 수 있다."
				+ " ");
	}

	@Override
	public void representing() {
		// TODO Auto-generated method stub
		System.out.println("\nk- pop을 대표하는 아티스트들은 다음과 같습니다. ");
		System.out.println();
		for(int i = 0; i < popList.size();i++) {
			System.out.print(popList.get(i)+" ");
		}
		System.out.println();
		
		
	}
	
	@Override
	public void recommend() {
		Scanner inputRecomend = new Scanner(System.in);
		try {
			System.out.println("k-pop대표 아티스트를 입력해주세요 ");
			System.out.print("입력: ");
			String keyword = inputRecomend.next();
			
			popList.add(keyword);	

		} catch (Exception e) {inputRecomend.close();}
			
	}
	
		
}
