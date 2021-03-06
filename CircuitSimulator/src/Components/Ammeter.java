package Components;


public class Ammeter extends Component {
	
	private double readCurrent;
	private final static int MAX_ROTATION = 2;
	
	public Ammeter(int x, int y, int type) {
		super.x = x;
		super.y = y;
		super.type = type;
		maxRotation = MAX_ROTATION;
	}

	public double getReadCurrent() {
		return readCurrent;
	}

	public void setReadCurrent(double readCurrent) {
		this.readCurrent = readCurrent;
	}

}
