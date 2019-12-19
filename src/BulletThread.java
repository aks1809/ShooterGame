import java.awt.*;
public class BulletThread extends Thread{
Button b=new Button();
 public void run() {
	 try {
		 Game.a.add(b);
		 b.setBackground(Color.BLACK);
		 Game.f.add(b);
		int x=Game.tank.getX()+10;
		for(int i=330;i>=20&&Game.bt;i-=10) {
			b.setBounds(x, i, 10, 10);
			 Thread.sleep(30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
 }
}
