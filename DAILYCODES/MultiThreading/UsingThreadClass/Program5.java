class ThreadDemo extends Thread{

	public void run(){
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(getName());
	}
}

class Client{
	public static void main(String[] args){

		ThreadDemo td=new ThreadDemo();
		td.start();

		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(td.getName());
	}
}
