import java.util.ArrayList;
import java.util.List;

import core.*;

public class Story {
	List<String> Name = new ArrayList<String>();
	Allname a = new Allname();
	
	public Story() {
	}

	public void start() {
		this.StartStory();
	}

	private void StartStory() {
		child Child = new child();
		a.join(Child.getName());
		Child.What(" теперь самое время с ней заговорить");
		Child.think();
		buzzing Buzzing = new buzzing();
		a.join(Buzzing.getName());
		Buzzing.FamiliarandWeakly();
		Child.listen(Buzzing);
		window Window = new window();
		a.join(Window.getName());
		Window.near(Child);
		people Kacona = new people("Карлсона");
		a.join(Kacona.getName());
		bun Bun = new bun();
		a.join(Bun.getName());
		Bun.put("на тарелке");
		Bun.where();
		Window.place(Bun);
		Child.laugh();
		people Freken = new people("Фрекен Бок");
		a.join(Freken.getName());
		Freken.notice(false);

	}

}