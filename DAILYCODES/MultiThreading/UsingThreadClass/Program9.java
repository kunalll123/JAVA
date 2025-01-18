class ThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In run");

			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){

			}
		}
	}
}
class Client{
	public static void main(String[] args)throws InterruptedException{

		ThreadDemo td=new ThreadDemo();
		td.start();

		for(int i=0; i<10; i++){
			System.out.println("In Main");
			Thread.sleep(2000);
		}
	}
}
