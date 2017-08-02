package prob06;

public class Sub extends Calc {

	@Override
	public int calculate() {
		return ( super.getA() - super.getB() );
	}
}
