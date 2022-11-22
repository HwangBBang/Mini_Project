package KoreanWave;

public class KPop extends KoreaWave implements InterFace{

	public String kind = "pop";
	public int number;
	
	String [] musicianArray = {"BTS", "블랙핑크", "싸이", "EXO", "트와이스", "빅뱅", "소녀시대"}; 
	//	추상 메소드 실체 메소드 (재정의)
	
	
	@Override
	public void explain() {
		System.out.println("케이팝 아이돌 음악의 특징은 단순하고 경쾌한 리듬 과 비트감, 따라 부르기 쉬운 멜로디,\n"
				+ "신선한 노랫말 , 멋진 댄스 실력으로 선보이는 군무를 통한 시각적인 요소\n"
				+ " ");
	}

	@Override
	public void representing() {
		
	}

	@Override
	public void recommend() {
		
	}

}
