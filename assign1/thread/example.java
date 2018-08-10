class work implements Runnable {
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch (Exception e){
				return;
			}
		}
	}
}


class example{
	public static void main(String[] args) throws Exception {
		work w1 = new work();
		Thread a = new Thread(w1);
		Thread b = new Thread(w1);
		a.start();
		Thread.sleep(500);
		b.start();
		System.out.println("x");
	}
}