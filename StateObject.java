public class StateObject {
	boolean condition;

	public StateObject(boolean cond) {
		condition = cond;
	}

	public void start() {

	}

	public void stop(boolean cond) {
		condition = false;
	}

	public boolean checkState() {
		return condition;
	}
}