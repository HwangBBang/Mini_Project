package MyProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//카테고리 인터페이스를 상속받은 dining 
public class Dining implements Category{

	List<String> diningList = new ArrayList<>(List.of("이원일", "심영순", "유현수", "김훈이", "강민구", "임정식"));
	
	
	@Override
	public void explain() {
		System.out.println("k-dining 의 특징은 ");
		System.out.println();
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

	Scanner inputRecomend = new Scanner(System.in);
	@Override
	public void recommend() {
		// TODO Auto-generated method stub
		System.out.println("k-dining 을 대표 하는 쉐프를 입력해주세요 ");
		System.out.print("입력: ");
		String keyword = inputRecomend.next();
		
		diningList.add(keyword);

	}
	public void exit() {
		inputRecomend.close();	
	}
	

}
