package core;

import inf.*;

public class child implements ThingInterface {
	private String name;
	private Action actions = new Action();
	
	public child() {
		name = "Малыш";
	}

	public child(String name) {
		super();
		this.name = name;
	}

	public void think(String s) {
		System.out.println( name + actions.thinks() + " что " + s);
	}

	public void listen(buzzing Buzzing) {
		System.out.println(name + actions.listens() +" "+ Buzzing);
	}

	public void laugh() {
		System.out.println(name + actions.laughs());
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " услышал знакомое слабое жужжание";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof child) {
			return name.equals(((child) obj).getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
