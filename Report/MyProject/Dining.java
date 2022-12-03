package MyProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//카테고리 인터페이스를 상속받은 dining 
public class Dining implements Category{

	List<String> diningList = new ArrayList<>(List.of("이원일", "심영순", "유현수", "김훈이", "강민구", "임정식"));
	
	
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
			System.out.println("k-dining 을 대표 하는 쉐프를 입력해주세요 ");
			System.out.print("입력: ");
			String keyword = inputRecomend.next();
			
			diningList.add(keyword);	
		} catch (Exception e) {inputRecomend.close();}
		

	}
	
	

}
