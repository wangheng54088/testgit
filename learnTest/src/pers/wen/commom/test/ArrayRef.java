package pers.wen.commom.test;

public class ArrayRef {

	public static void main(String[] args) {

		int score[] = { 558, 43, 12, 4, 5, 557, 7, 8, 1 };
		int age[] = { 33, 1, 2, 6, 84, 3, 100 };
//		insertionSort(score);
		bubbleSort(score);
		print(score);
		System.out.println("\n--------------------");
		insertionSort(age);
		print(age);
	}

	/*
	 * 此排序方法也称为是冒泡,有点奇妙
	 */
	public static void insertionSort(int temp[]) {
		for (int i = 1; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if (temp[i] < temp[j]) {
					int x = temp[i];
					temp[i] = temp[j];
					temp[j] = x;
				}
			}
		}
	}
	/**
	 * 冒泡排序
	 * @param arr
	 */

	public static void bubbleSort(int[] arr) {
		// 第一个for循环是程序需要执行要走多少趟
		for (int i = 0; i < arr.length - 1; i++) {
			// 第二个for循环是每趟需要比较多少次
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 此处是从小到大排列
				if (arr[j] > arr[j + 1]) {
					// 定义一个临时变量temp
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void print(int temp[]) {
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "\t");
		}
	}

}
