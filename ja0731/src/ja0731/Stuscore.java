package ja0731;

public class Stuscore {
	
	public static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{no = count++;}
	
	Stuscore(){
		
	}
	
	Stuscore(String name, int kor, int eng, int math){
		this.name=name;
		this.kor =kor;
		this.eng=eng;
		this.math=math;
		this.total=kor+eng+math;
		this.avg=total/3.-0;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Stuscore.count = count;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
