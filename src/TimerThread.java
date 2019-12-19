public class TimerThread extends Thread{
public void run() {
	try {
		for(;Integer.parseInt(Game.t2.getText())>0;Game.t2.setText(""+(Integer.parseInt(Game.t2.getText())-1))){
			Thread.sleep(1000);
		}
		Game.t2.setText(""+0);
		javax.swing.JOptionPane.showMessageDialog(Game.f ,"Game_Over\nYour Score is="+Game.t1.getText());
		Game.bt=false;
		Game.ct=false;
		Game.tt=false;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}
