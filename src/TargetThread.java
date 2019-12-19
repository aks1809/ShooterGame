import java.awt.*;
public class TargetThread extends Thread{
Button b=new Button();
boolean bc=false;
public void run() {
	try {
			b.setBackground(Color.GREEN);
			int p=(int)(Math.random()*360),i=20;
			Game.f.add(b);
			for(;i<=290&&Game.ct&&Game.tt;i+=10) {
				b.setBounds(p, i, 40, 40);
				for(int j=0;j<Game.a.size()&&!bc;j++) {
					if(Game.a.get(j).getX()>=p&&Game.a.get(j).getX()<=(p+40)&&Game.a.get(j).getY()<=(i+40)&&Game.a.get(j).getY()>=i) {
						Game.f.remove(Game.a.get(j));
						Game.f.remove(b);
						bc=true;
						Game.a.remove(j);
						Game.t1.setText(""+(Integer.parseInt(Game.t1.getText())+1));
						break;
					}
				}
				Thread.sleep(100);
			}
			if(!bc&&i>=300){
				Game.bt=false;
				Game.ct=false;
				Game.tt=false;
				Game.t2.setText(""+0);
			}
			Game.f.remove(b);
			b=null;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}