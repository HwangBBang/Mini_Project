package MyProject;

import java.util.*;

// 객체 Ab 생성을위한 클래스, Ab클래스는 해쉬맵의 벨류값이다.

class Ab{
//	필드 
	private String name;
	private String agency;
	private int volume;
//	생성자 
	public Ab() {}
	public Ab(String name, String agency, int volume) {
		this.name = name;
		this.agency = agency;
		this.volume = volume;	
	}
//	메소드 
	public String getName(){return name;}
	public String getAgency(){return agency;}
	public int getVolume(){return volume;}
}


// 카테고리 인터페이스를 상속받은 pop 
public class Pop extends Menu{
	
	// 컬랙션 프레임워크 어레이리스트 사용 
	Map <String, Object> popMap = new HashMap<String, Object>() ;
	List<String> popList = new ArrayList<String>();

	public Pop() {
		popMap.put("BTS", new Ab("Dynamite, 불타오르네, Butter ","HYBE", 7240));
		popMap.put("블랙핑크", new Ab("마지막처럼, How You Like That, 뚜두뚜두","YG",7050));
		popMap.put("PSY", new Ab("강남스타일, That That, 예술이야","P-NATION",1770));
		popMap.put("트와이스", new Ab("TT, FANCY, CHEER UP","JYP",1510));
		popMap.put("빅뱅", new Ab("Still Life, Fantastic Baby, LOSER","YG",1490));
		popList = new ArrayList<>(popMap.keySet());
	}
	
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
			if (popList.contains(keyword)){
				System.out.println("해당 아티스트는 이미 입력 되어있습니다.");	
			}
			else {popList.add(keyword);}
			

		} catch (Exception e) {inputRecomend.close();}
			
	}
	public void introduce(String artist) {
		if (popMap.containsKey(artist)) {
			String name = ((Ab) popMap.get(artist)).getName();
			String agency = ((Ab) popMap.get(artist)).getAgency();
			int volume = ((Ab) popMap.get(artist)).getVolume();
			
			System.out.println(
					" 대표곡 3개 : " + name +"\n"+
					" 소속사 : " + agency +"\n"+
					" YouTube 구독자 수 : " + volume+ "만명 "
					);
		}
		else {
			System.out.println(artist+" 아티스트에 대한 정보는 없습니다.");
		}
		
	}
	
	
		
}
