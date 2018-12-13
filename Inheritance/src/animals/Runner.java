package animals;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Moo> mooooooo = new ArrayList<>();
		Human matt = new Human();
		mooooooo.add(matt);
		Cow bessie = new Cow();
		mooooooo.add(bessie);
		mooooooo.stream().forEach(mooer -> mooer.moo());
	}

}
