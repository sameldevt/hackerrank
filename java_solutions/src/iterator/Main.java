package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof Integer) {
				continue;
			}
			if (element instanceof String && element == "###") {
				while (it.hasNext()) {
					element = it.next();
					System.out.println(element);
				}
			}

			break;
		}
		return it;

	}
}