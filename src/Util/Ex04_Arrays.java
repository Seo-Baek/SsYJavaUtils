package Util;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 	4. Arrays 클래스
 * 		- 배열 객체를 처리하는 클래스. 
 */

public class Ex04_Arrays {

	public static void main(String[] args) {
		
		String[] str = {"홍길동", "이순신", "유관순"};
		for(String k : str) {
			System.out.println("str 배열요소 ==> " + k);
		}
		System.out.println();
		
		// 1. fill() : 배열의 요소를 특정한 값(데이터)로 채우는 메소드.
		Arrays.fill(str, "김유신");
		for(String k : str) {
			System.out.println("str 배열요소 ==> " + k);
		}
		System.out.println();
		
		String[] str2 = {"김유신", "김유신", "김유신"};
		
		// 2. equals(객체, 객체) : 두 객체의 내용을 비교하는 메소드
		if(Arrays.equals(str, str2)) {
			System.out.println("두 객체의 내용(데이터)는 같습니다.");
		} else {
			System.out.println("두 객체의 내용(데이터)는 다릅니다.");
		}
		System.out.println();
		
		// 3. sort() : 배열의 원소(데이터)를 정렬(오름차순)하는 메소드.
		int[] arr = { 54, 76, 13, 97, 41 };
		for(int k : arr) {
			System.out.println("arr 배열 요소 ==> " + k);
		}
		System.out.println();
		
		Arrays.sort(arr);    //오름차순 정렬
		for(int k : arr) {
			System.out.println("arr 배열 요소 ==> " + k);
		}
		System.out.println();
		
		/*
		 * [문제] 키보드로 배열의 크기를 입력 후 
		 * 		 해당 배열의 정수값을 배열의 크기만큼 입력 받는다.
		 * 		 입력받은 데이터를 Arrays 클래스의 sort 메소드로 오름차순 정렬
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요.");
		int[] arr2 = new int[sc.nextInt()];
		for(int i = 0; i < arr2.length; i++) {
			System.out.print((i+1) + "번째 정수를 입력하세요.");
			arr2[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.print("arr2 = {");
		for(int i = 0; i < arr2.length; i++) {
			if(i == arr2.length-1) {
				System.out.print(arr2[i] + "}");
			}else {
				System.out.print( arr2[i] + ", ");
			}
		}
		System.out.println("\n");
		Arrays.sort(arr2);
		System.out.println("오름차순 후 arr2 배열요소");
		System.out.print("arr2 = {");
		for(int i = 0; i < arr2.length; i++) {
			if(i == arr2.length-1) {
				System.out.print(arr2[i] + "}");
			}else {
				System.out.print( arr2[i] + ", ");
			}
		}
		sc.close();
	}

}
