package core;

import inf.*;

public class child implements ThingInterface {
	private String name;
	private Action actions = new Action();
	private String Thinks;
	
	
	public child() {
		name = "Малыш";
	}

	public child(String name) {
		super();
		this.name = name;
	}
	
	public void What(String s) {
		this.Thinks=s;
	}
	
	public void think() {
		System.out.println( name + actions.thinks() + " что" + Thinks);
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
		return name+Thinks ;
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
