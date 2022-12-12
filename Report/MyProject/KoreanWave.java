package MyProject;


//한류 클래스
public class KoreanWave {
	private Category category;
	
	public void setCategory(Category category) {this.category = category;}
	
	// 프로그램에 쓰이는 메소드 
	public void operateNumOne() {
		category.explain();
	}
	public void operateNumTwo() {
		category.representing();
	}
	public void operateNumThree() {
		category.recommend();
	}
		
	
}
