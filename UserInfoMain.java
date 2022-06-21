package pack05.ojdbc2;

import java.util.Scanner;

public class UserInfoMain {
	public static void main(String[] args) {
		//메뉴보여주기 (1.전체 학생 조회 2.로그인 3.회원가입)
		//로그인을 완 (회원정보 보기, 수정, 삭제)
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		UserInfoDAO userDao = new UserInfoDAO();
		UserInfoDTO dto = null;// 아직 로그인하기전
		String id = null;
		String pw = null;
		System.out.println("반갑습니다. 메뉴를 보여드립니다.");

		while (true) {
			if (dto == null || dto.getUser_id() == null) {

				System.out.println("1번.전체 학생 조회 , 2번.로그인 , 3.회원가입 4.종료");
				int inputMenu = Integer.parseInt(sc.nextLine());// <=메소드로 숫자만 입력하게 바꾸기.
				if (inputMenu == 1) {
					System.out.println("학생 조회");
					dao.viewList(dao.getStudentList()); // <= ArrayList ==
				} else if (inputMenu == 2) {
					System.out.println("로그인");
					System.out.println("아이디를 입력해주세요.");// <=inputType
					id = sc.nextLine();
					System.out.println("패스워드를 입력해주세요.");// <=input type='password'
					pw = sc.nextLine();
					dto = userDao.loginUser(id, pw); // 회원정보를 수정할때 키값이필요함(학생번호,아이디)
					
				} else if (inputMenu == 3) {
					System.out.println("회원가입");
					UserInfoDTO joinDto = new UserInfoDTO();
					// 메소드만든곳(정의) = 메소드쓸곳(호출)

					// <= return String userDao.rtnStrMsg(sc, "아이디를 입력하세요.");
					joinDto.setUser_id(userDao.rtnStrMsg(sc, "아이디를 입력하세요."));
					joinDto.setUser_pw(userDao.rtnStrMsg(sc, "비밀번호 입력하세요."));
					joinDto.setFirst_name(userDao.rtnStrMsg(sc, "성 입력하세요."));
					joinDto.setLast_name(userDao.rtnStrMsg(sc, "이름 입력하세요."));
					userDao.joinUser(joinDto);
				} else if (inputMenu == 4) {
					System.out.println("종료");
					break;
				} else {
					System.out.println(" 잘못된 입력 입니다.");
				}
			}else {//로그인 성공 후 
				System.out.println("1.회원정보 보기 , 2.수정 , 3.삭제 , 4.로그아웃");
				int number = Integer.parseInt(sc.nextLine());
				if(number == 1) {
					
				}else if(number == 2) {
					UserInfoDTO joinDto = new UserInfoDTO();
					joinDto.setUser_pw(userDao.rtnStrMsg(sc, "변경할 비밀번호를 입력하세요"));
					joinDto.setUser_id(dto.getUser_id());
					userDao.userUpdate(joinDto);
					
				}else if(number == 3) {
					
				}else if(number == 4) {
					dto = null;// 로그아웃 ( Web == Session );
				}else {
					
				}
			}//if
		}//while
				
//		while(true) {
//			System.out.println("번호를 선택해 주세요.");
//			System.out.println("1.전체 학생 조회 2.로그인 3.회원가입 4.종료");
//			System.out.print("▶ ");
//			int menu = Integer.parseInt(sc.nextLine());
//
//			if(menu == 1) {
//				System.out.println("전체 학생 데이터를 조회합니다.");
//				//DAO 학생조회 가져오기
//				//dao.getStudentList();
//				//dao.viewList();
//				dao.viewList(dao.getStudentList());
//				continue;
//			}else if(menu == 2) {
//				System.out.println("로그인을 진행합니다.");
//				System.out.print("아이디를 입력해주세요 ▶ "); //← 나중에 input 타입으로 변경
//				String id = sc.nextLine();
//				System.out.print("비밀번호를 입력해주세요 ▶ "); //← 나중에 input 타입으로 변경
//				String pw = sc.nextLine();
//				userDao.loginUser(id,pw);
//				if(true) {
//					System.out.println("로그인 되었습니다.");
//					System.out.println("1.회원정보 보기, 2.수정, 3.삭제");
//					int number = Integer.parseInt(sc.nextLine());
//					
//					if(number == 1) {
//						
//					}else if(number == 2) {
//						System.out.println("회원정보를 수정합니다.");
//						//일단은 id는 입력한 id로, 비번도 입력한 비번으로
//						//
//
//					}else if(number == 3) {
//						
//					}else {
//						System.out.println("잘못 누르셨습니다.");
//						continue;
//					}
//					break;
//				}//if
//			}else if(menu == 3) {
//				System.out.println("회원가입을 진행합니다.");
//				UserInfoDTO joinDto = new UserInfoDTO();
//				
//				//<= return String userDao.rtnStrMsg(scanner, "아이디를 입력하세요.");
//				joinDto.setUser_id( 	userDao.rtnStrMsg(sc, "아이디를 입력하세요.") );
//				joinDto.setUser_pw( userDao.rtnStrMsg(sc, "비밀번호 입력하세요."));
//				joinDto.setFirst_name( userDao.rtnStrMsg(sc, "성 입력하세요."));
//				joinDto.setLast_name( userDao.rtnStrMsg(sc, "이름 입력하세요."));
//				userDao.joinUser(joinDto);
//
////				System.out.print("아이디를 입력해주세요 ▶ "); //← 나중에 input 타입으로 변경
////				String id = scanner.nextLine();
////				System.out.print("비밀번호를 입력해주세요 ▶ "); //← 나중에 input 타입으로 변경
////				String pw = scanner.nextLine();
////				System.out.print("이름를 입력해주세요 ▶ "); //← 나중에 input 타입으로 변경
////				String fn = scanner.nextLine();
////				System.out.print("성을 입력해주세요 ▶ "); //← 나중에 input 타입으로 변경
////				String ln = scanner.nextLine();
////				
////				UserInfoDTO dto = new UserInfoDTO(6, id, pw, fn, ln, "sysdate", "sysdate");
////				userDao.joinUser(dto);
//				
//				if(true) {
//					System.out.println("회원가입이 완료되었습니다.");
//					continue;
//				}//if
//				
//			}else {
//				System.out.println("잘못 누르셨습니다. 다시 시작할까요?");
//				System.out.println("1번을 누르시면 다시 시작하고, 나머지 키를 누르시면 종료합니다.");
//				System.out.print("▶ ");
//				String num = sc.nextLine();
//				if(num.equals("1")) {
//					System.out.println("다시 시작합니다.");
//					main(args);
//				}else{
//					System.out.println("종료합니다 bye");
//					break;
//				}//if
//			}//if			
//		}//while
		sc.close();
				
	}//main()
}//class
