package hi_choi.spring.dao;

import hi_choi.spring.vo.Member;

public interface MemberDAO {
	
	int insertMember(Member m);
	int selectLogin(Member m);
	Member selectOneMember(String mno);
	

}
