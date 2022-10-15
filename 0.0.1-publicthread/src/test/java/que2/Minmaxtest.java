package que2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Minmaxtest {
	@Test
	
	public void check() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(23);
		l.add(78);
		l.add(92);
		l.add(53);
		l.add(44);
		l.add(90);
		l.add(64);
		l.add(88);
		l.add(99);
		
		Minmax m = new Minmax();
		assertEquals(2,m.min(l));
		assertEquals(99,m.max(l));
	}

}
