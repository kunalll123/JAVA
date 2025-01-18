class ThreadExcep extends Thread{
	public void run(){
		System.out.println("In run");
		System.out.println(10/0);
	}
}

class Client{
	public static void main(String[] args){

		ThreadExcep te=new ThreadExcep();
		te.start();

		System.out.println(10/0);
	}

/*Output in mixmod=
 
In runException in thread "main"
Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
        at Client.main(Program8.java:14)
java.lang.ArithmeticException: / by zero
        at ThreadExcep.run(Program8.java:4)} */
