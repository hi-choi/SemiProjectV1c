package hi_choi.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import hi_choi.spring.dao.SungJukDAO;
import hi_choi.spring.vo.SungJuk;

//SungJukService 인터페이스의 메서드를 구체화하는 클래스
@Service("sjsrv")
public class SungJukServiceImpl implements SungJukService {

	@Autowired
	private SungJukDAO sjdao;


	@Override
	public int newSungJuk(SungJuk sj) {
		computeSungJuk(sj);
		return sjdao.insertSungJuk(sj);
		
	}
	
	@Override
	public void computeSungJuk(SungJuk sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = tot / 3.0; 
		String grd = "가";
		
		if (avg >= 90) grd = "수";
		else if (avg >= 80) grd = "우";
		else if (avg >= 70) grd = "미";
		else if (avg >= 60) grd = "양";
		
		sj.setTot(tot);
		sj.setAvg(avg);
		sj.setGrd(grd.charAt(0));
	}

	@Override
	public List<SungJuk> readAllSungJuk() {
		return sjdao.selectAllSungJuk();
	}

	@Override
	public SungJuk readOneSungJuk(int sjno) {
		return null;
	}

	@Override
	public int modifySungJuk() {
		return 0;
		
	}

	@Override
	public int removeSungJuk() {
		return 0;
		
		
	}

	

}
