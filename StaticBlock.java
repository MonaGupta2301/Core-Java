// Wap to demo of Static block
/* It is true to execute code without main() Using Static block only upto JDK 5 version
*/
class SB
{ 
        static
         { 
	          System.out.println("Inside the Static block......");
	     }
   
}
/*

OUTPUT : On JDK 10 Version

C:\java Programs>set path="c:\Program Files\Java\jdk-10\bin"

C:\java Programs>javac StaticBlock.java

C:\java Programs>java SB
Error: Main method not found in class SB, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/

/*
OUTPUT : On JDK 5 Version
C:\java Programs>set path="c:\Program Files\Java\jdk1.5.0_19\bin"

C:\java Programs>javac StaticBlock.java

C:\java Programs>java SB
Inside the Static block......
Exception in thread "main" java.lang.NoSuchMethodError: main

C:\java Programs>