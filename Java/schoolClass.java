public class schoolClass 
{
   protected double grade;
   protected String teacher;
   protected static int count = 0;
   
   public schoolClass()
   {
   }
   
   public schoolClass(String teacher)
   {
      this.teacher = teacher;
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