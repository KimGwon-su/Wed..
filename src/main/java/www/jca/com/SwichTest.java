package www.jca.com;

import javax.swing.JOptionPane;

public class SwichTest {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("번호를입력하시요"));
		
		switch(num) {
			case 1:
					System.out.println("예금조회를 선택하셧습니다."); break;
			case 2:
					System.out.println("예금출금을 선택하셧습니다."); break;
			case 3:
					System.out.println("예금입금을 선택하셧습니다."); break;
			case 4:
					System.out.println("예금이체를 선택하셧습니다."); break;
			default :
					System.out.println("번호를 잘못 누르셨습니다.");
		}
	}

}
