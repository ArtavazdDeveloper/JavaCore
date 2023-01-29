package chapter7.inner;

 class Outer {
     int outer_x = 100;

     void test(){
         Inner inner = new Inner();
         inner.display();
     }
     class Inner{
         void display(){
             System.out.println("вывод: outer_x = " + outer_x);
         }
     }
}
