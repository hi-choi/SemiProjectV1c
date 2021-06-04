package hi_choi.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hi_choi.spring.vo.SungJuk;

//SungJukDAO 인터페이스의 메서드를 구체화하는 클래스
@Repository("sjdao")
public class SungJukDAOImpl implements SungJukDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertSungJuk(SungJuk sj) {

		return sqlSession.insert("sungjuk.insertSungjuk",sj);
	}

	@Override
	public List<SungJuk> selectAllSungJuk() {

		return sqlSession.selectList("sungjuk.selectSungjuk");
	}

	@Override
	public SungJuk selectOneSungJuk(int sjno) {

		return null;
	}

	@Override
	public int updateSungJuk(SungJuk sj) {

		return 0;
	}

	@Override
	public int deleteSungJuk(int i) {
		return 0;
	}

	
	
}
