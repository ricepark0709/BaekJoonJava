import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase(); // 모든 문자 대문자로 바꿔주기
		sc.close();

		int[] arr = new int[26]; // 알파벳 배열 선언
		int max = 0; // 최대 몇 번 반복하는지
		char result = 0; // 결과

		// 사용된 알파벳의 배열에 1씩 증가시킨다.
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 65]++; // 65는 'A'

			// 배열의 최대값 구하기
			if (max < arr[str.charAt(i) - 65]) {
				max = arr[str.charAt(i) - 65];
				result = str.charAt(i);

				// 만약 최대값이 중복이라면 ? 출력
			} else if (max == arr[str.charAt(i) - 65]) {
				result = '?';
			}
		}
		System.out.println(result);
	}

}