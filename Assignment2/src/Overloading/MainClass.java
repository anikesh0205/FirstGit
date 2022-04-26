package Overloading;
class MyClass {
int height;
MyClass() {
   System.out.println("bricks");
   height = 20;
}
MyClass(int i) {
   System.out.println("Building new House that is " + i + " feet tall");
   height = i;
}
void info(int a) {
   System.out.println("House is " + height + " feet tall");
}
void info(String s) {
   System.out.println(s + ": House is " + height + " feet tall");
}
}
public class MainClass {
public static void main(String[] args) {
   MyClass t = new MyClass();
   t.info(2);
   t.info("overloaded method");
   
   //Overloaded constructor:
   new MyClass();
   //new MyClass(10);
   
}
}
