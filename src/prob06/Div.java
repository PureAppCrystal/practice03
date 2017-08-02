package prob06;

public class Div extends Calc {

	@Override
	public int calculate() {
		return (  (int)(super.getA() / super.getB()) );
	}
}
