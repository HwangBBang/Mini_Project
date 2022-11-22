package KoreanWave;

public abstract class Design {
	//	추상	필드  
	public String kind;
	public int number;
	
	//	추상 메소드
	public abstract String selectTheme();
	public abstract void startProgram(String kind);
	
	// 추상 메소드  다형성 
	public abstract void option();
	public abstract void option(int number);
	
}



