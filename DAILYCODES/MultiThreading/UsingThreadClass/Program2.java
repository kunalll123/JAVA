class ThreadDemo extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		ThreadDemo obj=new ThreadDemo();
		obj.start();

		for(int i=0; i<5; i++){
			System.out.println("Befor sleep");
		}

		for(int i=0; i<5; i++){
			System.out.println("In main");
		}
	}
}

