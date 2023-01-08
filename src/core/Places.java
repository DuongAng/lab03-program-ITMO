package core;

public enum Places {
	NEAR_WINDOW,
	IN_WINDOW,
	ON_THE_PLATE;
	@Override
	public String toString() {
		if(this == NEAR_WINDOW) {
			return " у окна";
		}else if(this == IN_WINDOW) {
			return " в окне";
		}else {
			return " на тарелке";
		}
	}
}
