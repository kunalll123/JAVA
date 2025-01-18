class Outer{
        Outer(){
                System.out.println("In Outer-Constructor");
        }

        void fun(){
                System.out.println("In fun");

                class Inner{
                        Inner(){
                                System.out.println("In Inner-Construcotr");
                        }
                }
                Inner inr=new Inner();
        }
}

class Client{
        public static void main(String[] args){

                Outer obj1=new Outer();
		obj1.fun();
        }
}
