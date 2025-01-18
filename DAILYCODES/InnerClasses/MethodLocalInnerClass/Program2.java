class Outer{
	int x=20;
        Outer(int x){
                System.out.println("In Outer-Constructor");
		System.out.println(x);
		System.out.println(this.x);
        }

        void fun(int x){
	
                System.out.println("In fun");
		System.out.println(x);
		

                class Inner{
			int x=60;
                        Inner(int x){
                                System.out.println("In Inner-Construcotr");
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(Outer.this.x);
                        }
                }
                Inner inr=new Inner(70);
        }
}

class Client{
        public static void main(String[] args){

                Outer obj1=new Outer(30);
		obj1.fun(50);
        }
}

