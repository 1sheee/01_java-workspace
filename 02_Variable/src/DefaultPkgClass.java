// 패키지 선언부 없음 == default 패키지

public class DefaultPkgClass {
	
	/*
	 *  < 패키지 pkg >
	 *  
	 * 1. 비슷한 역할 하는 클래스들의 보관함 (폴더)
	 * 
	 * 2. 기본패키지(default pkg)에 클래스 만드는건 권장 x
	 *		ㄴ 모든 클래스들을 기본패키지 안에 만들면 관리가 어려움 => 유지보수 힘듦
	 *		ㄴ 기본패키지 안에 클래스는 다른 클래스에서 사용 불가 ***
	 *
	 *
	 * 3. 패키지 생성 시 세 간계 이상으로 만들어 주는걸 권장 ex) com.br.first
	 * 	 주로 도메인의 역순으로 1, 2 레벨 작성
	 *	 ㄴ 도메인은 고유하기 때문에 중복을 방지할 수 있음 
	 *	 ㄴ 어떤 회사에서 제작된건지 쉽게 파악할 수 있음
	 *
	 * 		ex) com.회사명.애플리케이션명
	 * 
	 */

}