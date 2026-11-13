public class Person {
    private String name;
    private int age;
    private static int count = 0;
    public Person (String personName,int personAge)
    {
        this.name = personName;
        this.age = personAge;
    }
   public void setName(String name)
   {
       this.name = name;
   }
   public int GetAge(){
       return this.age;
   }

}
