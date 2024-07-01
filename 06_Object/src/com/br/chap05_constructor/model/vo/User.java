package com.br.chap05_constructor.model.vo;

public class User {
	
	
	// 필드부
	// 멤버변수들 작성
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * < Has-a 관계(포함관계) > - 하나의 관계만 가지는 중이라
	 * 	멤버변수로 다른 클래스 타입의 변수를 선언해두는 것
	 *  즉, 다른 클래스 타입의 객체를 포함할 수 있다.
	 *  
	 *  
	 *  User가 Cosmetic 한개를 가질 수 있도록 멤버변수로 설정
	 */
	private Cosmetic cos;
	
	
	// 생성자부
	/*
	 * < 생성자 >
	 * 객체를 생성할 때 동작되는 메소드같은 존재
	 * new 연산자와 함께 호출됨
	 * 
	 * [표현법]
	 * public 클래스명(매개변수, 매개변수, ...){
	 * 		객체생성 시 실행시킬 내용 작성
	 * }
	 * 
	 * < 생성자의 작성 목적 ?>
	 * 1. 객체를 생성해주기 위한 목적					=> 기본생성자 작성
	 * 2. 객체 생성과 동시에 각 필드에 초기화할 목적	=> 
	 * 
	 * < 생성자 작성 시 주의사항 > 
	 * 1. 반드시 생성자명은 클래스명과 동일하게 작성
	 * 2. 반환의 개념이 없기때문에 반환형을 기술하면 안됨
	 * 		=> 반환형 기술하는 순간 메소드로 인식되버림
	 * 3. 매개변수 생성자를 명시적으로 작성하게 되면
	 * 		기본생성자를 JVM이 자동으로 만들어주지 않음
	 * 		=> 따라서 기본생성자는 항상 작성하는 습관 들이자!
	 */
	public User() {
		// * 기본생성자 (매개변수 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 사용
		// new User(); 하는 순간 실행되는 생성자
		// 기본생성자 작성을 생략했을 경우 =>
		// => JVM이 자동으로 기본생성자를 만들어줌
		System.out.println("기본생성자 실행됨");
	}
	// 매개변수 3개짜리 생성자
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	// 매개변수 5개짜리 생성자
	public User(String userId, String userPwd, String userName, int age, char gender) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName);
		/*
		 * 위과 같이 중복되는 동일한 구문을 실행시키는 생성자가
		 * 이미 존재할 경우 this() 생성자 활용 가능
		 * => 같은 클래스 내에 또다른 생성자 호출
		 * ** 유의사항 : 반드시 첫줄에 작성해야됨!
		 */
		this.age = age;
		this.gender = gender;
	}
		
	// 메소드부
	// setter, getter, information
	
	public void setUserID(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String uerPwd) {
		this.userPwd = uerPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setCos(Cosmetic cos) {
		this.cos = cos;
	}
	
	
	public String getUserID() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char gender() {
		return gender;
	}
	public Cosmetic getCos() {
		return cos;
	}
	
	public String information() {
		
		String str = "아이디 : " + userId + " 비밀번호 : " + userPwd + " 이름 : " + userName + " 나이 : " + age + " 성별 : " + gender
				+ "\n<화장품정보>\n";
		
		
		// 널포인트익셉션 방지 목적
		if(cos != null) { // cos 멤버변수가 null이 아닐경우 즉, 화장품객체가 존재할 경우
			str += cos.information();
		}else {
			str += "화장품 없음";
		}
		
		return str;
				
				
			
	}
	
	
}
