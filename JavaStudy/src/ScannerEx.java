import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� �ڸ� ������ �Է����ּ���.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //�Է¹��� ���ڿ��� ���ڸ� ��ȯ
		
		System.out.println("�Է³��� : " + input);
		System.out.printf("num=%d%n", num);
		
	}

}
