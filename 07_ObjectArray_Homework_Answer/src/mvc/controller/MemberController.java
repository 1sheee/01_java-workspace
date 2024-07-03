package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim123@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yoo55@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon01@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin89@naver.com");
		memberCount = 5;
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId(String userId) {
		
		Member m = null;
		
		for(int i=0; i<memberCount; i++	) {
			if(mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		
		return m;
	}
	
	public void insertMember(Member m) {
		
		mem[memberCount] = m;
		memberCount++;
		
	}
	
	public Member searchMember(int menu, String search) {
		
		Member searchMember = null;
		
		for(int i=0; i<memberCount; i++) {
			if(menu == 1) {
				if(mem[i].getUserId().equals(search))
					searchMember = mem[i];
			}else if(menu == 2) {
				if(mem[i].getName().equals(search))
					searchMember = mem[i];
			}else {
				if(mem[i].getEmail().equals(search))
					searchMember = mem[i];
			}
		}
		
		return searchMember;
	}
	
	public void updateMember(Member m, int menu, String update) {
		if(menu == 1) {
			m.setUserPwd(update);
		}else if(menu == 2) {
			m.setName(update);
		}else {
			m.setEmail(update);
		}
	}
	
	public void deleteMember(String userId) {
		
		for(int i=0; i<memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) {
				for(int j=i; j<memberCount-1; j++) { // 삭제할회원 뒤에있는 회원들을 앞으로 땡기는과정
					mem[j] = mem[j+1];
				}
				mem[memberCount-1] = null; // 마지막자리는 null로
				break; // NullPointerException 방지
			}
		}
		
		memberCount--;
	}

}
