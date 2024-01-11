package sorting;

import java.util.ArrayList;
import java.util.Collections;

class ClassRoom implements Comparable<ClassRoom> {
	private int classId;
	private int noOfStudent;
	private String className;

	public ClassRoom(int classId, int noOfStudent, String className) {
		this.classId = classId;
		this.noOfStudent = noOfStudent;
		this.className = className;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "ClassRoom [classId=" + classId + ", noOfStudent=" + noOfStudent + ", className=" + className + "]";
	}

	@Override
	public int compareTo(ClassRoom o) {

		return this.className.compareTo(o.className);
	}
}

public class ClassRoomTest {
	public static void main(String[] args) {
		ArrayList<ClassRoom> list = new ArrayList<>();
		list.add(new ClassRoom(10, 50, "Class Name 5"));
		list.add(new ClassRoom(2, 890, "Class Name 2"));
		list.add(new ClassRoom(5, 98, "Class Name 3"));
		list.add(new ClassRoom(9, 98, "Class Name 12"));
		list.add(new ClassRoom(5, 98, "Class Name 2"));
		list.add(new ClassRoom(5, 98, "Class Name 2"));
		list.add(new ClassRoom(5, 9, "Class Name 9"));
		System.out.println("List before sorting");
		for (ClassRoom classRoom : list) {
			System.out.println(classRoom);
		}

//		System.out.println("List after sorting using ClassId Comparator");
//		Collections.sort(list, new ClassIdCompator());
//
//		System.out.println();
//		for (ClassRoom classRoom : list) {
//			System.out.println(classRoom);
//		}

		System.out.println("List after sorting using ClassNameComparator");
		Collections.sort(list, new ClassNameComparator());

		System.out.println();
		for (ClassRoom classRoom : list) {
			System.out.println(classRoom);
		}
	}
}
