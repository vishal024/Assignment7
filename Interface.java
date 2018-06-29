interface Animal
{
   public void speak();
   public void eat();
}
class Cat implements Animal
{
   public void speak()
   {
      System.out.println("cat is speaking");
   }
   public void eat()
   {
     System.out.println("cat is eating");
    }
}
class Dog implements Animal
{
    public void speak()
    {
       System.out.println("dog is barking");
    }
   public void eat()
    {
       System.out.println("dog is eating meat");
    }
}
class Main
{
   public static void main(String[] args)
   {
      Cat c=new Cat();
      Dog d=new Dog();
      c.speak();
      c.eat();
      d.speak();
      d.eat();
}
} 