package pack05.ojdbc2;

import java.util.Scanner;

public class UserInfoMain {
	public static void main(String[] args) {
		//메뉴보여주기 (1번.전체 학생 조회 2번.로그인 3.회원가입)
		//로그인을 완 (회원정보 보기, 수정, 삭제)
		StudentDAO dao = new StudentDAO();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("반갑습니다. 메뉴를 보여드립니다.");
		while(true) {
			System.out.println("번호를 선택해 주세요.");
			System.out.println("1.전체 학생 조회 2.로그인 3.회원가입 4.종료");
			System.out.print("▶ ");
			int menu = Integer.parseInt(scanner.nextLine());

			if(menu == 1) {
				System.out.println("전체 학생 데이터를 조회합니다.");
				//DAO 학생조회 가져오기
				//dao.getStudentList();
				//dao.viewList();
				dao.viewList(dao.getStudentList());
				continue;
			}else if(menu == 2) {
				System.out.println("로그인을 진행합니다.");
				
				if(true) {
					System.out.println("로그인 되었습니다.");
					System.out.println("1.회원정보 보기, 2.수정, 3.삭제");
				}//if
//				System.out.println("메뉴를 선택하세요.");
//				System.out.println("1번.회원정보 보기, 2번.수정, 3번.삭제");
//				System.out.print("▶ ");
//				int num = Integer.parseInt(scanner.nextLine());
//				if(num == 1) {
//					System.out.println("회원정보를 확인합니다.");
//					continue;
//				}else if(num == 2){
//					System.out.println("회원정보를 수정합니다.");
//					continue;
//				}else if(num == 3){
//					System.out.println("회원정보를 삭제합니다.");
//					continue;
//				}else {
//					System.out.println("잘못 누르셨습니다.");
//					continue;
//				}
			}else if(menu == 3) {
				System.out.println("회원가입을 진행합니다.");
				
			}else {
				System.out.println("잘못 누르셨습니다. 다시 시작할까요?");
				System.out.println("1번을 누르시면 다시 시작하고, 나머지 키를 누르시면 종료합니다.");
				System.out.print("▶ ");
				String num = scanner.nextLine();
				if(num.equals("1")) {
					System.out.println("다시 시작합니다.");
					main(args);
				}else{
					System.out.println("종료합니다 bye");
					break;
				}//if
			}//if			
			scanner.close();
		}//while
				
	}//main()
}//class
