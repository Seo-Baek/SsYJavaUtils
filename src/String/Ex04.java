package String;

import java.util.StringTokenizer;

/*
 * StringTokenizer 클래스
 * 	- 특수 문자를 기준으로 문자열을 잘라주는 클래스(파싱).
 * 	- 웹에서 전화번호를 하이픈(-)을 기준으로 앞자리,
 * 	   중간자리, 뒷자리 형식으로 구분해서 번호 추출 시 사용함.
 * 	  (주민번호, 핸드폰번호 등등)
 */

public class Ex04 {

	public static void main(String[] args) {
		
		// 형식) StringTokenizer("원본문자열", "구분문자")
		StringTokenizer st = new StringTokenizer("010-4725-3440", "-");
		
		// hasMoreTokens() : 리턴할 다음 토큰이 있으면 true 값 반환, 없으면 false
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
