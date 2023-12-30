package ds;

public class ArrayDS {
	int[] array = null;

	public ArrayDS(int size) {
		// TODO Auto-generated constructor stub
		this.array = new int[size];
	}

	int[] insertAnElement(int pos, int ele) {
		// logic
		int[] res = new int[this.array.length + 1];
		for (int i = array.length - 1; i >= 0; i--) {
			if (i >= pos) {
				res[i + 1] = array[i];
			} else {
				res[i] = array[i];
			}

		}
		res[pos] = ele;
		this.array = res;
		return this.array;
	}

	int[] deleteAnElement(int index) {
		int res[] = new int[this.array.length - 1];
		for (int i = 0; i < array.length; i++) {
			if (i > index) {
				res[i - 1] = array[i];
			} else {
				res[i] = array[i];
			}
		}
		this.array = res;
		return this.array;
	}

	public static void main(String[] args) {
		ArrayDS obj = new ArrayDS(5);
		for (int i = 0; i < obj.array.length; i++) {
			obj.array[i] = i + 1;
		}
		obj.displayArray();
		obj.insertAnElement(3, 2);
		System.out.println();
		obj.displayArray();
		obj.deleteAnElement(4);
		System.out.println();
		obj.displayArray();

	}

	void displayArray() {
		for (int val : this.array) {
			System.out.print(val + " ");
		}
	}

}
