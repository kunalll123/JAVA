class ThreadDemo extends Thread{
	ThreadDemo(ThreadGroup tg,String str){
		super(str);
	}

	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(2000);
		}catch(Exception e){

		}
	}
}
class Client{
	public static void main(String[] args){
		System.out.println(Thread.currentThread());
		
		ThreadGroup tg=new ThreadGroup("Instagram");


		ThreadGroup subtg1=new ThreadGroup("Reels");
		ThreadGroup subtg2=new ThreadGroup("Post");

		ThreadDemo t1= new ThreadDemo(subtg1,"kunal");
		ThreadDemo t2=new ThreadDemo(subtg1,"Khushal");
		ThreadDemo t3=new ThreadDemo(subtg2,"Bhavesh");
		ThreadDemo t4=new ThreadDemo(subtg2,"Sunny");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println(tg.getParent().getName());
		System.out.println(tg.activeCount());
		System.out.println(subtg2.activeCount());
		System.out.println(tg.activeGroupCount());
		System.out.println(subtg1.getParent().getName());
	}
}
