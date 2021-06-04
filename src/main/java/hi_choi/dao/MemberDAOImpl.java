package hi_choi.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hi_choi.spring.vo.Member;

@Repository("mdao")
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertMember(Member m) {
		
		return sqlSession.insert("member.insertMember",m);
	}

	@Override
	public int selectLogin(Member m) {

		return sqlSession.selectOne("member.loginMember",m);
	}

	@Override
	public Member selectOneMember(String userid) {

		return sqlSession.selectOne("member.selectOneMember",userid);
	}

}
