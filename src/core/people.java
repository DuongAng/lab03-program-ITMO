package core;

import inf.*;

public class people implements ThingInterface {
	private String name;
	private Action actions = new Action();
	public people(String name) {
		super();
		this.name = name;
	}

	public void notice(boolean Notice) {
		if(Notice==false) {
		System.out.println(name + " ничего не" + actions.noticed());
		}else {
			System.out.println(name + actions.noticed());
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof people) {
			return name.equals(((people) obj).getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
