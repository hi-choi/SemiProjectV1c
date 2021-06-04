package hi_choi.spring.service;

import hi_choi.spring.vo.Member;

public interface MemberService {
	
	int newMember(Member m);
	int loginMember(Member m);
	Member readOneMember(String mno);
	

}
