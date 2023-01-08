package core;

import inf.*;

public class bun implements ThingInterface {
	private String name;
	private Places place = Places.ON_THE_PLATE;
	
	public bun() {
		name = "Плюшкa";
	}

	public bun(String name) {
		this.name = name;
	}

	public void where(String Where) {
		System.out.println( name + " с блюда " + place );
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "плюшку с блюда";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof bun) {
			return name.equals(((bun) obj).getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
