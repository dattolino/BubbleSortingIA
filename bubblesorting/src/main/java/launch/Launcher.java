package launch;

import javax.swing.SwingUtilities;

import gui.Window;

public class Launcher {

	public static void main(String[] args) {
		
	     SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Window();
			}
		});
	
	}	
}