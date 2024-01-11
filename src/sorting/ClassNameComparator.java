package sorting;

import java.util.Comparator;

public class ClassNameComparator implements Comparator<ClassRoom> {
	@Override
	public int compare(ClassRoom o1, ClassRoom o2) {
		if (o1.getNoOfStudent() == o2.getNoOfStudent() && o1.getClassId() > o2.getClassId())
			return 1;
		else if ((o1.getNoOfStudent() == o2.getNoOfStudent()) && o1.getClassId() < o2.getClassId())
			return -1;
		else
			return o1.getNoOfStudent() - o2.getNoOfStudent();
	}
}
