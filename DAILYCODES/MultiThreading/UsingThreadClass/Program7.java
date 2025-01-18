class ThreadDemo extends Thread{

	public void run(){
		System.out.println(getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
}

class Client{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getPriority());

		ThreadDemo t1=new ThreadDemo();
		System.out.println(t1.getPriority());
	        t1.setPriority(7);
       		//t1.setPriority(11);	//Exception,because priority can be in 1 to 10.       
		t1.start();

	
	}
}

