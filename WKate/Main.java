public class Main {
  public static void main (String[] args) {
    //this is commemt
    System.out.println("Hello World!");//this is a comment in line
    /*this comment should not be visible
    even if I start a new line*/
    String name = "John";
    System.out.println(name);

    int myFavoriteNumber = 17;
    myFavoriteNumber = 17000;
    //if we add final or constant befor declare variable it will be unchangeable
    final String firstName = "Kateryna";
    System.out.println(myFavoriteNumber + name + firstName);
    //declare a multiple variables
    int x = 10, y = 20, z = 300;
    System.out.println (x+y+z);

    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
System.out.println(myVar1);
System.out.println(myVar2);
System.out.println(myVar3);
  }
}
