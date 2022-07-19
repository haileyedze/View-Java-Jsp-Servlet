package common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class CommonUtil {
	
	//Http 요청결과를 받는 처리
	public String requestAPI( String apiURL, String property ) {
		String result = "";
		try {
		      URL url = new URL(apiURL);
		      HttpURLConnection con = (HttpURLConnection)url.openConnection();
		      con.setRequestMethod("GET");
		      con.setRequestProperty("Authorization", property);
		      int responseCode = con.getResponseCode();
		      BufferedReader br;
		      System.out.print("responseCode="+responseCode);
		      if(responseCode==200) { // 정상 호출
		        br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
		      } else {  // 에러 발생
		        br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"));
		      }
		      String inputLine;
		      StringBuffer res = new StringBuffer();
		      while ((inputLine = br.readLine()) != null) {
		        res.append(inputLine);
		      }
		      br.close();
		      if(responseCode==200) {
		        result = res.toString();
		      }
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		return result;
	}
	
	
	//Http 요청결과를 받는 처리
	public String requestAPI( String apiURL ) {
		String result = "";
		try {
		      URL url = new URL(apiURL);
		      HttpURLConnection con = (HttpURLConnection)url.openConnection();
		      con.setRequestMethod("GET");
		      int responseCode = con.getResponseCode();
		      BufferedReader br;
		      System.out.print("responseCode="+responseCode);
		      if(responseCode==200) { // 정상 호출
		        br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
		      } else {  // 에러 발생
		        br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"));
		      }
		      String inputLine;
		      StringBuffer res = new StringBuffer();
		      while ((inputLine = br.readLine()) != null) {
		        res.append(inputLine);
		      }
		      br.close();
		      if(responseCode==200) {
		        result = res.toString();
		      }
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		return result;
	}
	
	
	//비밀번호 암호화 - 단방향
	//비밀번호 까먹었을 때 다시 찾기 위해서는 복호화 가능하게 양방향 쓰고
	//비밀번호를 새로 만들게 할 때는 단방향 → 현재방식
	//비밀번호 암호화에 사용할 솔트만들기
	public String generateSalt() {
		//암호화 랜덤문자를 만들어주는 기능을 가진 객체
		SecureRandom  random = new SecureRandom(); 
		byte salt[] = new byte[24];
		random.nextBytes(salt);
		
		//각 byte 를 16진수로 변환
		StringBuffer buf = new StringBuffer();
		for( byte b : salt ) {
			buf.append( String.format("%02x", b) );
		}
		return	buf.toString();
	}
	
	//솔트를 사용해 문자를 암호화하기
	public String getEncrypt(String pw, String salt) {
		String salt_pw = pw + salt;
		
		//암호화해쉬함수를 사용해 암호화 방식 지정
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update( salt_pw.getBytes() );
			byte[] digest = md.digest();
			
			//16진수로 변환
			StringBuffer buf = new StringBuffer();
			for( byte b : digest ) {
				buf.append( String.format("%02x", b) );
			}
			salt_pw = buf.toString();
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return salt_pw;
	}
	
	//이메일전송하기
	public void sendEmail(String email, String name, HttpServletRequest request){
		
		//1. 간단한 이메일 전송
		//sendSimpleEmail(email, name);
		
		//2. 파일첨부한 이메일 전송
		//sendAttachEmail(email, name, request);
		
		//3. Html 형식의 이메일 전송
		semdHtmlEmail(email, name, request);
	}

	//이메일전송하기
	public void sendEmail(String email, String name){
		
		//1. 간단한 이메일 전송
		//sendSimpleEmail(email, name);
		
		//2. 파일첨부한 이메일 전송
		//sendAttachEmail(email, name);
		
	}
	
	//Html 형식의 이메일 전송
	private void semdHtmlEmail(String email, String name, HttpServletRequest request) {
		HtmlEmail mail = new HtmlEmail();
		mail.setDebug(true);
		mail.setCharset("utf-8");
		mail.setHostName("smtp.naver.com");
		mail.setAuthentication("diebienemaja@naver.com", "Rkdeksldpf09");
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom("diebienemaja@naver.com", "관리자");
			mail.addTo(email, name);
			mail.setSubject("회원가입 축하 메일");
			
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<h3>오픈소스기반의 IoT과정</h3>");
			msg.append("<a href='http://naver.com'><img src='https://file.mk.co.kr/meet/yonhap/2022/07/15/image_readtop_2022_624066_0_101411.jpg'/></a>");
			msg.append("<hr>");
			msg.append("<div>회원가입을 축하합니다</div>");
			msg.append("<div>첨부된 가입관련 파일을 확인하세요</div>");
			msg.append("<div>프로젝트까지 마무리하고 취업에 성공하시길 바랍니다</div>");
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg(msg.toString());
			
			EmailAttachment file = new EmailAttachment();
			file.setPath(request.getServletContext().getRealPath("files") + "/회원가입축하.txt");
			mail.attach(file);
			
			mail.send();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	//파일첨부한 이메일 전송
	private void sendAttachEmail(String email, String name, HttpServletRequest request) {
		MultiPartEmail mail = new MultiPartEmail();
		
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		mail.setAuthentication("diebienemaja@naver.com", "Rkdeksldpf09");
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom("diebienemaja@naver.com", "오픈소스 관리자");
			mail.addTo(email, name);
			
			mail.setSubject("오픈소스기반의 지능형 IoT 과정 회원가입");
			mail.setMsg(name + "님, 회원가입을 축하합니다");
			
			//파일첨부하기 - 물리적 위치 지정
			//파일첨부기능을 가진 객체 생성
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Android\\97.이미지\\image1.jpg");
			mail.attach(file);
			
			//어플리케이션이 있는 파일첨부하기
			file = new EmailAttachment();
			file.setPath(request.getServletContext().getRealPath("files") + "/회원가입축하.txt");
			mail.attach(file);
			
			//url 이미지 주소 복사해서 첨부하기
			file = new EmailAttachment();
			file.setURL( new URL(//Exception 때문에 오류날 수 있음
					"https://file.mk.co.kr/meet/yonhap/2022/07/15/image_readtop_2022_624066_0_101411.jpg"
					));		
			mail.attach(file);
			mail.send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//파일첨부한 이메일 전송
	private void sendAttachEmail(String email, String name) {
		MultiPartEmail mail = new MultiPartEmail();
		
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		mail.setAuthentication("diebienemaja@naver.com", "Rkdeksldpf09");
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom("diebienemaja@naver.com", "오픈소스 관리자");
			mail.addTo(email, name);
			
			mail.setSubject("오픈소스기반의 지능형 IoT 과정 회원가입");
			mail.setMsg(name + "님, 회원가입을 축하합니다");
			
			//파일첨부하기 - 물리적 위치 지정
			//파일첨부기능을 가진 객체 생성
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Android\\97.이미지\\image1.jpg");
			mail.attach(file);
			mail.send();
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//간단한 이메일 전송
	private void sendSimpleEmail(String email, String name) {
		//이메일 전송 기능을 가진 객체 생성
		SimpleEmail mail = new SimpleEmail();
		
		mail.setCharset("utf-8");	//한글깨지지 않게
		mail.setDebug(true);//메일전송과정확인(로그출력 - 디버그 보기)
		
		mail.setHostName("smtp.naver.com");	//이메일 서버 지정
		//아이디, 비번 입력해서 로그인하기
		//mail.setAuthentication("관리자의 이메일 아이디", "비밀번호");
		mail.setAuthentication("diebienemaja@naver.com", "Rkdeksldpf09");
		mail.setSSLOnConnect(true);	//로그인하기
		
		try {
			//mail.setFrom("관리자 이메일 주소", "보내는 사람 이름 지정");	//메일 보내는 사람 지정: abc@naver.com
			mail.setFrom("diebienemaja@naver.com", "오픈소스 관리자");
			mail.addTo(email, name);	//메일 받는 사람 지정
			//mail.addTo("sim@", "심청");	//메일 받는 사람 지정
			
			mail.setSubject("오픈소스기반의 지능형 IoT 과정 회원가입");	//제목쓰기
			mail.setMsg(name + "님, 회원가입을 축하합니다");	//내용쓰기
			mail.send();//보내기 버튼 클릭
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}