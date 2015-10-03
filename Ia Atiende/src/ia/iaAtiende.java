package ia;

import javax.swing.JFrame;

public class iaAtiende {

	public static void main(String[] args) {
		atiende();
		//creamos una ventana
		Ventana v = new Ventana();
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void atiende(){
		System.out.println("Ia esta atendiendo!!!!");
		

	}

}
