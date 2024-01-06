package sorting;

import java.util.Comparator;

public class ClassIdCompator implements Comparator<ClassRoom> {

	@Override
	public int compare(ClassRoom o1, ClassRoom o2) {

		return o1.getClassId() - o2.getClassId();
	}

}
