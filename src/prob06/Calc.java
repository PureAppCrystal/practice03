package prob06;

public class Calc {
	private int a;
	private int b;
	
	
	
	//게터세터
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}


	
	//함수
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	

	public int calculate() {
		System.out.println("계산할 수 없습니다.");
		return 0;
	}
}
