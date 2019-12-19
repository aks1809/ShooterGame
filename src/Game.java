import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Game implements ActionListener,WindowListener,MouseMotionListener{
static Frame f;
Label l1,l2;
static TextField t1,t2;
static Button tank;
static ArrayList<Button> a;
static boolean bt=true,ct=true,tt=true;
static TimerThread t3;
static CallTarget t4;
public Game() {
	f=new Frame("New-Game");
	l1=new Label("Score");
	l2=new Label("Time");
	t1=new TextField("0");
	t2=new TextField("60");
	tank=new Button();
	a=new ArrayList<Button>();
	f.setLayout(null);
	f.setSize(400, 400);
	f.add(t1);
	f.add(t2);
	f.add(l1);
	f.add(l2);
	f.add(tank);
	f.setBackground(Color.PINK);
	f.addWindowListener(this);
	t1.setBounds(60, 370, 30, 20);
	l1.setBounds(10, 370, 40, 20);
	t2.setBounds(360, 370, 30, 20);
	l2.setBounds(320, 370, 30, 20);
	tank.setBounds(185, 330, 30, 30);
	tank.setBackground(Color.blue);
	f.setVisible(true);
	f.setResizable(false);
	tank.addActionListener(this);
	f.addMouseMotionListener(this);
	t3=new TimerThread();
	t3.start();
	t4=new CallTarget();
	t4.start();
}
public static void main(String args[]) {
	int g=javax.swing.JOptionPane.showConfirmDialog(null, "Start a new game?");
	if(g==0) {
		new Game();
	}
}	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		BulletThread b=new BulletThread();
		b.start();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		f.dispose();
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		tank.setBounds(arg0.getX()-15, 330, 30, 30);
	}

}
