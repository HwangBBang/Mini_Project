package MyProject;

import java.util.*;


class Rs{
	private String name;
	private String adress;
	private int price;
	public Rs() {}
	public Rs(String name, String adress, int price) {
		this.name = name;
		this.adress = adress;
		this.price = price;	
	}
	public String getName(){return name;}
	public String getAdress(){return adress;}
	public int getPrice(){return price;}
}

//카테고리 인터페이스를 상속받은 Menu를 상속받은 dining 
public class Dining	extends Menu{

//	List<String> diningList = new ArrayList<>(List.of("이원일", "심영순", "유현수", "김훈이", "강민구", "임정식"));
	
	// diningMap 의 key 값 은 스트링 벨류값은 객체로 받고 
	// 생성시 초기화 하고싶음 
	Map <String, Object> diningMap = new HashMap<String, Object>() ;

	public void Map(){
		diningMap.put("이원일", new Rs("이원일의 식탁","서울시 용산구 한남동 684-35 ",4));
		diningMap.put("심영순", new Rs("일상담미","서울시 용산구 한남동 680-1",7));
		diningMap.put("유현수", new Rs("두레유","서울시 종로구 가회동 16-12",3));
		diningMap.put("강민구", new Rs("밍글스","서울특별시 강남구 선릉로 757 힐탑빌딩 ",15));
		diningMap.put("김훈이", new Rs("단지","346 W 52nd St, New York, NY 10019 미국",7));
		diningMap.put("임정식", new Rs("정식당","서울시 강남구 청담동 83-24",16));
	}
	
	
	List<String> diningList = new ArrayList<>(diningMap.keySet());
	
	Iterator<String> iterator = diningMap.keySet().iterator();
	
	
	
	
	@Override
	public void explain() {
		System.out.println("\nk-dining 의 특징은 ");
		System.out.println("곡물을 활용한 음식이 다양하다.\n"
				+ "곡물 음식으로는 죽, 국수, 만두, 수제비, 떡, 술 등이 있다.\n"
				+ "조리법이 매우 다양하고 향신료를 많이 사용한다. \n"
				+ "간장, 설탕, 파, 마늘, 깨소금, 참기름, 후춧가루, 고춧가루 등을 사용한 요리가 주축을 이루고 있다. \n");
	}

	@Override
	public void representing() {
		
		
		System.out.println("\nk- dining 을 대표하는 셰프들은 다음과 같습니다. ");
		System.out.println();
		for(int i = 0; i < diningList.size();i++) {
			System.out.print(diningList.get(i)+" ");
		}
		System.out.println();
	
	}

	
	@Override
	public void recommend() {
		Scanner inputRecomend = new Scanner(System.in);	
		try {
			List<String> diningList = new ArrayList<>(diningMap.keySet());
			System.out.println("k-dining 을 대표 하는 쉐프를 입력해주세요 ");
			System.out.print("입력: ");
			String keyword = inputRecomend.next();
			if (diningList.contains(keyword)){
				System.out.println("해당 작품은 이미 입력 되어있습니다.");	
			}
			else {diningList.add(keyword);}
		
		} catch (Exception e) {inputRecomend.close();}
		

	}

	

}
