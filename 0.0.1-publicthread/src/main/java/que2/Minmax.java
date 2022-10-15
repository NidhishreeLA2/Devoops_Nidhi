package que2;

import java.util.ArrayList;
import java.util.Comparator;

public class Minmax {
	public void createlist() {
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
		
	}
	
	public int min(ArrayList<Integer> list) {
		int min = list.stream().min(Comparator.comparing(i -> i)).get();
		return min;
	}
	public int max(ArrayList<Integer> list) {
		int max = list.stream().max(Comparator.comparing(i -> i)).get();
		return max;
	}

}
