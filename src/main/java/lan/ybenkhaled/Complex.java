package lan.ybenkhaled;

public class Complex {

	int r, i;

	public Complex(int r, int i) {
		this.r = r;
		this.i = i;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Complex [" + r + ", " + i + ".i]";
	}

}
