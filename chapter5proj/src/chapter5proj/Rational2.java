package chapter5proj;

//5.2

public class Rational2 implements Comparable
{
   private int numerator, denominator;
   public static Rational2 a = new Rational2(8, 9);
   public static Rational2 b = new Rational2(6, 9);

   //-----------------------------------------------------------------
   //  Sets up the rational number by ensuring a nonzero denominator
   //  and making only the numerator signed.
   //-----------------------------------------------------------------
   public Rational2 (int numer, int denom)
   {
      if (denom == 0)
      denom = 1;

      // Make the numerator "store" the sign
      if (denom < 0)
      {
      numer = numer * -1;
      denom = denom * -1;
      }

      numerator = numer;
      denominator = denom;
      reduce();
}

   //-----------------------------------------------------------------
   //  Returns the numerator of this rational number.
   //-----------------------------------------------------------------
   public int getNumerator ()
   {
      return numerator;
   }

   //-----------------------------------------------------------------
   //  Returns the denominator of this rational number.
   //-----------------------------------------------------------------
   public int getDenominator ()
   {
      return denominator;
   }

   //-----------------------------------------------------------------
   //  Returns the reciprocal of this rational number.
   //-----------------------------------------------------------------
   public Rational2 reciprocal ()
   {
      return new Rational2 (denominator, numerator);
   }

   //-----------------------------------------------------------------
   //  Adds this rational number to the one passed as a parameter.
   //  A common denominator is found by multiplying the individual
   //  denominators.
   //-----------------------------------------------------------------
   public Rational2 add (Rational2 op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int sum = numerator1 + numerator2;

      return new Rational2 (sum, commonDenominator);
   }

   //-----------------------------------------------------------------
   //  Subtracts the rational number passed as a parameter from this
   //  rational number.
   //-----------------------------------------------------------------
   public Rational2 subtract (Rational2 op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int difference = numerator1 - numerator2;

      return new Rational2 (difference, commonDenominator);
   }

   //-----------------------------------------------------------------
   //  Multiplies this rational number by the one passed as a
   //  parameter.
   //-----------------------------------------------------------------
   public Rational2 multiply (Rational2 op2)
   {
      int numer = numerator * op2.getNumerator();
      int denom = denominator * op2.getDenominator();
      return new Rational2 (numer, denom);
   }

   //-----------------------------------------------------------------
   //  Divides this rational number by the one passed as a parameter
   //  by multiplying by the reciprocal of the second rational.
   //-----------------------------------------------------------------
   public Rational2 divide (Rational2 op2)
   {
      return multiply (op2.reciprocal());
   }

   //-----------------------------------------------------------------
   //  Determines if this rational number is equal to the one passed
   //  as a parameter. Assumes they are both reduced.
   //-----------------------------------------------------------------
   public boolean equals (Rational2 op2)
   {
      return ( numerator == op2.getNumerator() &&
               denominator == op2.getDenominator() );
   }

   //-----------------------------------------------------------------
   //  Returns this rational number as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      String result;

      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
else
            result = numerator + "/" + denominator;
      return result;
   }

   //-----------------------------------------------------------------
   //  Reduces this rational number by dividing both the numerator
   //  and the denominator by their greatest common divisor.
   //-----------------------------------------------------------------
   private void reduce ()
   {
      if (numerator != 0)
      {
         int common = gcd (Math.abs(numerator), denominator);

         numerator = numerator / common;
         denominator = denominator / common;
      }
   }

   //-----------------------------------------------------------------
   //  Computes and returns the greatest common divisor of the two
   //  positive parameters. Uses Euclid's algorithm.
   //-----------------------------------------------------------------
   private int gcd (int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

      return num1;
   }
   
   public int compareTo(Object obj) {
	   double numer = (double)((Rational2)obj).getNumerator();
	   double denom = (double)((Rational2)obj).getDenominator();
	   if(Math.abs(numer - numerator) < .0001 && Math.abs(denom-denominator) < .001)
		   return 1;
	   else
		   return 0;
   }
   
   public static void main(String[] args) {
	   System.out.println(b.getNumerator() + "/" + b.getDenominator());
	   System.out.println(a.compareTo(b));
   }
}