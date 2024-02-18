public class Pet 
{
   private String name;
   private String animal;
   private int age;
   
   public void setName(String newName)
   {
      name = newName;
   }
   
   public void setAnimal(String newAnimal) 
   {
      animal = newAnimal;
   }
   
   public void setAge(int newAge)
   {
      age = newAge;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getAnimal()
   {
      return animal;
   }
   
   public int getAge()
   {
      return age;
   }
}