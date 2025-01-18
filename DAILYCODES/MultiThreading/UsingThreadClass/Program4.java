class ThreadDemo extends Thread{
	public void run(){
		for(int  i=0; i<10; i++){
			System.out.println("In run-ThreadDemo");
		}
	}
}

class MyThread extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In run-MyThread");
		}
	}
}

class Client{
	public static void main(String[] args){

		MyThread mt=new MyThread();
		ThreadDemo td=new ThreadDemo();

		mt.start();
		td.start();

	}
}
