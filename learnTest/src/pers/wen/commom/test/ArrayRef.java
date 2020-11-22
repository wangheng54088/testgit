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
	 * �����򷽷�Ҳ��Ϊ��ð��,�е�����
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
	 * ð������
	 * @param arr
	 */

	public static void bubbleSort(int[] arr) {
		// ��һ��forѭ���ǳ�����Ҫִ��Ҫ�߶�����
		for (int i = 0; i < arr.length - 1; i++) {
			// �ڶ���forѭ����ÿ����Ҫ�Ƚ϶��ٴ�
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// �˴��Ǵ�С��������
				if (arr[j] > arr[j + 1]) {
					// ����һ����ʱ����temp
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
