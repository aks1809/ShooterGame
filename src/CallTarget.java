
public class CallTarget extends Thread{
public void run() {
	try {
		while(Game.ct) {
		TargetThread t=new TargetThread();
		t.start();
		Thread.sleep(2000);
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}
