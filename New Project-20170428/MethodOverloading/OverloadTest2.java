//Method overloading- Case 2
class Addition2
{
    //By changing the data type of arguments
    public int add(int a, int b){
        return a+b;
        
    }
   /* public int add(float a , float b)  Here if return type is not changes ambiguity occurs.
    {                                    // However, only changing the data type and not changing the arguments 
                                         doesn't meet the need of the hour for the Method overloading.
        return a+b;
        
    } */
    
    public double add(double a, double b){
        return a+b;
        
    }
    
    public float add(float a, float b)
    {
        return a+b;
        
    }
        
    
    
     public void add(int a, long b, float c) //type promotion
    {
       float val= a+b+c;    
       System.out.println("Sum4="+(a+b+c)); // type promotion
        
    }
        
    }


public class OverloadTest2
{
    public static void main (String args[])
    {
       Addition2 a = new Addition2();
       int sum1 =a.add(28,10);//calling the add method with int datatype
       double sum2=a.add(56.25, 78.9); //calling the add method with double datatype
       float sum3=a.add(78.f,20.2f);//calling the add method with float datatype
       a.add(13,45,20);
       System.out.println("Sum1="+sum1+" " + "Sum2="+" " +sum2+" "+"Sum3="+sum3);
    }
    
}