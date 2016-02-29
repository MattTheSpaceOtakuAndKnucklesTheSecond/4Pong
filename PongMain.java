package bouncingball;

public class PongMain  {
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {  
			public void run() {
				NewFrame application = new NewFrame();
				//application.NewGUI();
			}
		});
		
	}

}
