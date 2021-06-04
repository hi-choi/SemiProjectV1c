package hi_choi.spring.vo;

public class SungJuk {

	protected String sjno;
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int tot;
    protected double avg;
    protected double mean;
    protected char grd;
    protected String regdate;

    public SungJuk(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    
    public SungJuk() {
    	//mybatis3 쓸때 필요함
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }
	
    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public String getSjno() {
        return sjno;
    }

    public void setSjno(String sjno) {
        this.sjno = sjno;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    
    public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	@Override
    public String toString() {
        String fmt = "{name:'%s', kor:%d, eng:%d, mat:%d," +
                     "tot:%d, avg:%.1f, mean:%.1f grd:'%s'}\n";
        String result = String.format(
                    fmt,name,kor,eng,mat,tot,avg,mean, grd);
        return result;
    }

}
