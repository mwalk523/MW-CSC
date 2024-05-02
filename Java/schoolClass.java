public class schoolClass 
{
   protected double grade;
   protected String teacher;
   
   public schoolClass()
   {
   }
   
   public schoolClass(String t)
   {
      teacher = t;
      grade = 100.0;
   }
   
   public void changeTeacher (String t)
   {
      teacher = t;
   }
   
   public void setGrade (double p)
   {
     grade = p;
   }
   
   public String getTeacher()
   {
      return teacher;
   }
   
   public double getGrade()
   {
      return grade;
   }
}