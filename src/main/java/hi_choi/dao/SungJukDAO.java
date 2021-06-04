package hi_choi.spring.dao;

import java.util.List;

import hi_choi.spring.vo.SungJuk;

public interface SungJukDAO {
	int insertSungJuk(SungJuk sj);
	List<SungJuk> selectAllSungJuk();
	SungJuk selectOneSungJuk(int sjno);
	int updateSungJuk(SungJuk sj);
	int deleteSungJuk(int i);

}
