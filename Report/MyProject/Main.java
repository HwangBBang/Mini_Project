package MyProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 객체 생성 .
		KoreanWave thisProgram = new KoreanWave();
		Game k_game = new Game();
		Pop k_pop = new Pop();
		Dining k_dining = new Dining();
		
		Scanner optionNumber = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
//		thisProgram.setCategory(k_game);
//		thisProgram.operateNumOne();
//		thisProgram.operateNumTwo();
//		thisProgram.operateNumThree();
//		
//		thisProgram.setCategory(k_pop);
//		thisProgram.operateNumOne();
//		thisProgram.operateNumTwo();
//		thisProgram.operateNumThree();
//		
//		thisProgram.setCategory(k_dining);
//		thisProgram.operateNumOne();
//		thisProgram.operateNumTwo();
//		thisProgram.operateNumThree();
		int number = 0;
		String kind;
	// 주제 입력 받기 

		System.out.println("****************************************");
		System.out.println("세계로 뻗어나가고 있는 한류를 소개하는 프로그램입니다.");
		System.out.println("그 중 세 가지 주제를 준비했습니다.");
		while (true){
			System.out.println("pop , dining , game 중 하나의 주제를 선택하세요 ");
			System.out.print("입력창 : ");
			kind = inputStr.next();
			
			if (kind.equals("pop")) {thisProgram.setCategory(k_pop); break;}
			
			else if ( kind.equals("game") ) {thisProgram.setCategory(k_game); break;}
			
			else if ( kind.equals("dining") ) {thisProgram.setCategory(k_dining); break;}
			
			else {
				System.out.println("※※※※ 잘못 된 입력입니다. 다시 입력해주세요. ※※※※");
				if (kind.contains("p")) {System.out.println("※※※ 알림 : 혹시 pop 을 입력하고 싶으셨나요? ※※※");}
				
				else if(kind.contains("d")) {System.out.println("※※※ 알림 : 혹시 dining 을 입력하고 싶으셨나요? ※※※");}
				
				else if(kind.contains("g")) {System.out.println("※※※ 알림 : 혹시 game 을 입력하고 싶으셨나요? ※※※");}
				
			}
		}
		// while 종료 , 주제 찾기 종료 
		System.out.println("프로그램이 시작됩니다.");
		System.out.println("========================");
		while (number != 4 ) {
			
			System.out.println("***** K-"+kind+"프로그램*****");
			System.out.println("========================");
			System.out.println("1.특징이 어떻게 되나요?  ");
			System.out.println("2.대표되는 것은 무엇인가요? ");
			System.out.println("3.사용자님이 대표되는 것을 추천해주세요 ");
			System.out.println("4.실행을 종료할게요 ");
			System.out.print("원하시는 옵션을 선택해주세요. :");
			number = optionNumber.nextInt();
			if (number == 4) {
				System.out.println("프로그램이 종료됩니다.\n");
				System.out.println("========================\n");
				System.out.println("****************************************");
				thisProgram.operateNumFour();
				break;
			}			
			else if (number>0 && number<4){
				if(number == 1) {thisProgram.operateNumOne();}
				
				else if (number == 2) {thisProgram.operateNumTwo();}
				
				else {thisProgram.operateNumThree();}
			}
			System.out.println("\n========================");
		}
		// 두번째while 문 종료 ,
		optionNumber.close();
		inputStr.close();
		
	
	
	}
}
