package chapter4proj;

public class Student
{
   private String firstName, lastName;
   private static int test1=1, test2=2, test3=3, testScore1, testScore2, testScore3;
   private static double testAverage;
   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last)
   {
      firstName = first;
      lastName = last;
      testScore1 = 0;
      testScore2 = 0;
      testScore3 = 0;
   }
   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public void setTestScore(int testNumber, int score) {
	   if(testNumber == 1)
		   test1 = score;
	   else if(testNumber == 2)
		   test2 = score;
	   else
		   test3 = score;
   }
   
   public static int getTestScore(int testNumber) {
	   if(testNumber == 1)
		   return test1;
	   else if(testNumber == 2)
		   return test2;
	   else
		   return test3;
   }
   
   public String toString()
   {
      String result;
      result = firstName + " " + lastName + "\n";
      result += "Test Average:\t" + testAverage + "%";
      return result;
   }
   
   public static double average(Student student) {
	   testAverage = (student.getTestScore(1) + student.getTestScore(2) + student.getTestScore(3))/3.0;
	   return testAverage;
   }
   
   public static void main(String[] args) {
	   Student dude = new Student("First", "Last");
	   dude.setTestScore(1, 60);
	   dude.setTestScore(2, 10);
	   dude.setTestScore(3, 20);
	   double avg = average(dude);
	   
	   System.out.print(dude.toString());
   }
}