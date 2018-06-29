abstract class Animal
{
     String colour;
     String breed;
     String name;
  abstract void eat();
   public void speak()
    {
      System.out.println("Animal is speaking");
    }
}
class Dog extends Animal
{
    public void eat()
   {
     System.out.println(" dog is eating meat");
   }
   
}
class Example
{
   public static void main(String[] args)
  {
     Dog d=new Dog();
     d.eat();
     d.speak();
  }
} 
  
    