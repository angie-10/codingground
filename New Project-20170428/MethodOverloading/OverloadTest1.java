//Method overloading
class Addition
{
    //By changing the no. of arguments
    public int add(int a, int b){
        return a+b;
        
    }
    public int add(int a , int b, int c)
    {
        return a+b+c;
        
    }
    
}

public class OverloadTest1
{
    public static void main (String args[])
    {
       Addition a = new Addition();
       int sum1 =a.add(28,10); //calling the add method with two arguments
       int sum2=a.add(15,15,70); //calling the add method with 3 agruments
       System.out.println("Sum1="+sum1+" " + "Sum2="+" " +sum2);
    }
    
}