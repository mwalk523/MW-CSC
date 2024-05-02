public class biology extends schoolClass
{
   private int LabActivity;
   private double labGrade;
   
   public biology() 
   {
      LabActivity = 5;
      labGrade = 75;
      grade = 75;
   }
   
   public biology(int act)
   {
      LabActivity = act;
   }
   
   public void chooseActivity(int a)
   {
      LabActivity = a;
   }
   
   @Override
   public void setGrade (double g)
   {
      labGrade = g;
      super.setGrade(grade + (labGrade / 3));
   }
  
   public int getActivity()
   {
      return LabActivity;
   }
   
   public double getGrade()
   {
      return labGrade;
   }
   
   public double getTotal()
   {
      return grade;
   }
}     