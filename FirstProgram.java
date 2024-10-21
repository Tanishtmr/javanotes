/*
   1. Datatypes
       char
       int
       float




 





 */



public class FirstProgram
{

        public static void main(String args[])
        {
                System.out.println(" this is my first program");

                String collegeName = "suresh gyan vihar university";
                // string datatype is alpha numeric
                String address = "121, jagatpura, jaipur, rajasthan - 302017";
                int age = 32; // non decimal values
                float perc = 98.75F;
                double value = 10.50;

                String productName = " Realme 8 "; 
                double productPrice = 18000;
                float productRating = 4.5F;
                double productMRP = 20000;

                boolean productDiscountPercentage = False;

                testVariableTypes();
         }

         public static void testVariableTypes()
         {
                System.out.println(" inside test variable method");
                System.out.println("")

         }
         public static void testConditionStatement()
         {
                System.out.println(x:" inside test conditional statement method");
                int a = 10;
                int b = 25;
                int c = 19;
                if (a > b && a > c) //conditon / boolean
                {
                        System.out.println(x:" a is greater");
                }
                else if (b > c)
                {
                        System.out.println(x:" b is greater")
                }
                
         }

}