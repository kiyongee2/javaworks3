package innerinterface;

public class ButtonTest {

	public static void main(String[] args) {
		Button button = new Button();
		button.setListener(new CallListener());
		button.touch();
		
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍어요.");
			}
		});
		button.touch();
	}

}
