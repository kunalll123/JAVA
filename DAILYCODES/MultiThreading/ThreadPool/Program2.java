import java.util.concurrent.*;

class ThreadTask implements Runnable{
        int num=0;
        ThreadTask(int num){
                this.num=num;
        }

        public void run(){
                System.out.println(Thread.currentThread().getName() + "Start-" + num);
		fun();
		System.out.println(Thread.currentThread().getName() + "End-" + num);
	}

	void fun(){
		try{
			Thread.sleep(2000);
		}catch(Exception e){

		}
	}
}

class ThreadPool{
	public static void main(String[] args){

		ExecutorService threadpool=Executors.new fixedThreadpool(10);

		for(int i=1; i<=10; i++){

			ThreadTask task=new ThreadTask(i);
			threadpool.execute(task);
		}
		threadpool.shutdown();
	}
}
