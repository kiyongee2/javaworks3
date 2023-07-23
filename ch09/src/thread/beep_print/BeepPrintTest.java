package thread.beep_print;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		//비프음 재생
		//awt - abstract window Toolkit
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<=10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// "띵" 문자를 1초 간격으로 10번 출력하기
		for(int i=1; i<=10; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
