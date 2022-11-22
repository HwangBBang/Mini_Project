package KoreanWave;

import java.util.ArrayList;
import java.util.List;

public interface InterFace {
	// 상수 
	List<String> KpopList = new ArrayList<>();
	List<String> KdiningList = new ArrayList<>();
	List<String> KGameList = new ArrayList<>();
	
	// 추상 메소드 
	
//	void option();
//	void option(int number);
	void explain();
	void representing();
	void recommend();

}
