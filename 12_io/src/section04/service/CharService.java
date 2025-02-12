package section04.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharService {

	/* [문자 기반 스트림]
	 * 
	 * - 2byte 문자(char) 단위로 입/출력하는 스트림
	 * 
	 * - 문자만 작성된 파일(txt, bin 등),
	 *   채팅, JSON, 웹 요청(주소)/응답(HTML)
	 *   
	 * - 문자 기반 스트림 최상위 인터페이스 : 
	 * 	 Reader(입력), Writer(출력)
	 */
	 
	/** 문자 기반 스트림을 이용한 파일 출력 */
	public void fileOutput1() {
		
		FileWriter fw = null;
		
		try {
			String content = """
리부트 정상화 해줬잖아
본서버 완화도 해줘잖아
컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
본서버 완화도 해줬잖아
컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아


돈 열심히 쓰는줄 알았더니
대부분 전투력 5000만 INVEN
이런놈들 믿고 해달란거 다 해준 내가 병신이지 병신이야

아니지 나는 정상화의 신
아직 남아있는 최후의 수단이 있지
리부트 최종뎀 정상화 공격력 마력 체력 마나까지 정상화 (이제 돈 열심히 써줄거지?)

리부트 정상화 해줬잖아 본서버 완화도 해줘잖아 컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
리부트 정상화 해줬잖아 본서버 완화도 해줬잖아
컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아


AdGuard는 있어도 메벤남 가드는 없네
밸런스 패치? 하... 돈이나 쓰고 말해
우린 BM팔이가 먼저야
보스도 낼때마다 어렵게 내면 어렵다 지랄
쉽게 내니 쉽다고 지랄
대체 뭐 어쩌라는거냐 도대체 뭐가 문제냐고


(Verse2.전재학)

다 해준게 문제야
아이템 가치 보존해주느라 유효기 아직도 10년이 넘은 아이템을 기간제로 지급해야하지
이건 마치 갤럭시 s3를 신규가입시 기간제 대여
물론 그냥은 또 못줘 미션을 깨야 받을수 있지
하드리셋 안한 대가 톡톡히 치르거라 창섭아


리부트 정상화 해줬잖아
본서버 완화도 해줘잖아
컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
본서버 완화도 해줬잖아
컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아


다 해드렸잖아요
돈 좀 써주세요
우리 BM 관심좀요
꼭이요			
""";
			// 폴더가 없을 경우 생성
			String path = "io_test/char";
			File folder = new File(path);
			if(!folder.exists()) folder.mkdir();
			
			// 문자 기반 파일 출력 스트림 객체 생성
			fw = new FileWriter(folder + "/" + "다해줬잖아.txt");
			
			// 문자 기반 스트림을 이용해서 출력하기
			fw.write(content); // String, char[] 출력을 위한 기능이 제공됨
			
			// 스트림에 남은 데이터를 밀어냄
			fw.flush(); // close() 시 자동 수행됨
			
			System.out.println("출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	/** 문자 기반 스트림 + 보조 스트림을 이용한 파일 출력 */
	public void fileOutput2() {
		
		FileWriter fw = null;
		BufferedWriter bw = null; // 버퍼를 이용한 보조 스트림
		
		try {
			String content = """
					리부트 정상화 해줬잖아
					본서버 완화도 해줘잖아
					컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
					본서버 완화도 해줬잖아
					컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
					
					
					돈 열심히 쓰는줄 알았더니
					대부분 전투력 5000만 INVEN
					이런놈들 믿고 해달란거 다 해준 내가 병신이지 병신이야
					
					아니지 나는 정상화의 신
					아직 남아있는 최후의 수단이 있지
					리부트 최종뎀 정상화 공격력 마력 체력 마나까지 정상화 (이제 돈 열심히 써줄거지?)
					
					리부트 정상화 해줬잖아 본서버 완화도 해줘잖아 컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
					리부트 정상화 해줬잖아 본서버 완화도 해줬잖아
					컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
					
					
					AdGuard는 있어도 메벤남 가드는 없네
					밸런스 패치? 하... 돈이나 쓰고 말해
					우린 BM팔이가 먼저야
					보스도 낼때마다 어렵게 내면 어렵다 지랄
					쉽게 내니 쉽다고 지랄
					대체 뭐 어쩌라는거냐 도대체 뭐가 문제냐고
					
					
					(Verse2.전재학)
					
					다 해준게 문제야
					아이템 가치 보존해주느라 유효기 아직도 10년이 넘은 아이템을 기간제로 지급해야하지
					이건 마치 갤럭시 s3를 신규가입시 기간제 대여
					물론 그냥은 또 못줘 미션을 깨야 받을수 있지
					하드리셋 안한 대가 톡톡히 치르거라 창섭아
					
					
					리부트 정상화 해줬잖아
					본서버 완화도 해줘잖아
					컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
					본서버 완화도 해줬잖아
					컨텐츠 출시도 해줬잖아 씨발 다! 그냥 다 해줬잖아
					
					
					다 해드렸잖아요
					돈 좀 써주세요
					우리 BM 관심좀요
					꼭이요			
					""";
			// 폴더가 없을 경우 생성
			String path = "io_test/char";
			File folder = new File(path);
			if(!folder.exists()) folder.mkdir();
			
			// 문자 기반 파일 출력 스트림 객체 생성
			fw = new FileWriter(folder + "/" + "다해줬잖아_buffer.txt");
			
			// 보조 스트림 객체 생성
			bw = new BufferedWriter(fw);
			
			// 문자 기반 보조 스트림을 이용해서 출력하기
			bw.write(content); // String, char[] 출력을 위한 기능이 제공됨
			
			// 스트림에 남은 데이터를 밀어냄
			bw.flush(); // close() 시 자동 수행됨
			
			System.out.println("출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	
	/**
	 * 문자 기반 입력 스트림 + 보조 스트림 이용해서 파일 읽어오기
	 * 스트림을 여러 개 쓰다보니 try 옆이 길어져서 사용빈도가 좀 낮음
	 */
	public void fileInput() {
		
		/* [try - with - resource]
		 * - 자바 7버전(2011년)에서 추가된 기능
		 * - finally에서 작성하던 close 처리 구문을
		 * 	 자동으로 수행하도록 만드는 구문
		 */	
		String path = "io_test/char/다해줬잖아.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// 보조 스트림을 이용해서 파일 내용 읽어오기
			
			StringBuilder sb = new  StringBuilder(); // 읽어온 내용 누적
			String temp = null; // 임시 변수 
			
			
			
			while(true) {
				temp = br.readLine(); // 한 줄씩  읽어오기				
				
				if(temp == null) break; // 읽어온 내용이 없으면 null을 반환해 반복을 종료함
				
				sb.append(temp); // 읽어온 내용 누적(엔터 미포함
				sb.append("\n"); // 엔터 추가				 
			}
			
			System.out.println("읽어오기 성공!!");
			System.out.println("---------------");
			System.out.println(sb.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// fianlly에서 close 하던 구문 생략 가능
	}
	
	// Scanner 대신 스트림을 이용한 문자열 입력 받기
	// -> Scanner가 편리하긴 한데 매우 느림!!!
	
	// 키보드 입력 -> 바이트(2진수) 코드 입력 -> 문자 변화
	
	public void keyboardInput() {
		
		// System.in : 기본 장치(키보드)와 연결된 InputStream 반환
		
		// InputStreamReader : 바이트 스트림 -> 문자 스트림 변환
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			 // 문자 기반													   (System.in)바이트 기반 
			
			System.out.print("문자열 입력1 : ");
			String input1 = br.readLine(); // 입력된 한 줄 읽어오기
			
			System.out.print("문자열 입력2 : ");
			String input2 = br.readLine(); // 입력된 한 줄 읽어오기
			
			System.out.println("input1 : " + input1);
			System.out.println("input2 : " + input2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
