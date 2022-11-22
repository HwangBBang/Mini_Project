package KoreanWave;
import java.util.Scanner;

public class KoreaWave extends Design {
	String kind;
	// 생성자 
	public KoreaWave(){
	}
	
	
	
	Scanner optionNumber = new Scanner(System.in);
	Scanner selectStr = new Scanner(System.in);
	
	@Override
// selectTheme 함수 : 프로그램의 시작을 알리는 함수임 
// 리턴값은 String 으로 소개할 주제를 선정함 
	
	public String selectTheme() {
		System.out.println("****************************************");
		System.out.println("세계로 뻗어나가고 있는 한류를 소개하는 프로그램입니다.");
		System.out.println("그 중 세 가지 주제를 준비했습니다.");
		while (true){
			System.out.println("pop , dining , game 중 하나의 주제를 선택하세요 ");
			System.out.print("입력창 : ");
			kind = selectStr.next();
			if (kind.equals("pop") || kind.equals("game") || kind.equals("dining")) {
				return kind;
			}
			else {
				System.out.println("※※※※ 잘못 된 입력입니다. 다시 입력해주세요. ※※※※");
				if (kind.contains("p")) {
					System.out.println("※※※ 알림 : 혹시 pop 을 입력하고 싶으셨나요? ※※※");
				}
				else if(kind.contains("d")) {
					System.out.println("※※※ 알림 : 혹시 dining 을 입력하고 싶으셨나요? ※※※");
				}
				else if(kind.contains("g")) {
					System.out.println("※※※ 알림 : 혹시 game 을 입력하고 싶으셨나요? ※※※");
				}
			}
		}
	}
	
	@Override
	public void startProgram(String kind) {
		System.out.println("프로그램이 시작됩니다.");
		System.out.println("========================");
		while (number != 4 ) {
			
			System.out.println("***** K-"+kind+"프로그램*****");
			System.out.println("========================");
			System.out.println("1.특징이 어떻게 되나요?  ");
			System.out.println("2.대표되는 것은 무엇인가요? ");
			System.out.println("3.추천해주세요 ");
			System.out.println("4.실행을 종료할게요 ");
			System.out.print("원하시는 옵션을 선택해주세요. :");
			number = optionNumber.nextInt();
			if (number == 4) {
				System.out.println("프로그램이 종료됩니다.");
				System.out.println();
				System.out.println("========================");
				System.out.println();
				System.out.println("****************************************");
				break;
			}
			
			else if (number>0 && number<4){
				option(number);
			}
			else {
				option();
			}
			System.out.println();
			System.out.println("========================");
		}
	}
	
// 메서드 다형성: 파라미터가 없을 때 
	@Override
	public void option() {
		System.out.println("※※ 알림: 잘못된 입력입니다. ※※");
	}
//	메서드 다형성: 파라미터가 없을 때	
	public void option(int number) {
		if(number == 1) {
//			특징 소개 
		}
		else if (number == 2) {
//			대표하는 것들 소개 
		}
		else {
//			추천하는 것 
		}
		
	}
	

	

	

}
