package bouncingball;

import javax.swing.JFrame;

public class NewFrame {
	
	public NewFrame() {
		
		Ball test = new Ball();
	    final JFrame mainFrame = new JFrame();
	    mainFrame.setTitle("4_Pong");
	    mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    mainFrame.getContentPane().add(test);
	    //mainFrame.setJMenuBar(test.getMenuBar());
	    mainFrame.pack();
	    mainFrame.setLocationRelativeTo(null);
	    mainFrame.setVisible(true);
	    mainFrame.setResizable(false);
	
	}

}
