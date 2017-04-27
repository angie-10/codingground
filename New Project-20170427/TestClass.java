public class TestClass{
     
     TestClass()
     {
         System.out.println(" This is the default Constructor");
     }
     
     TestClass (int loginid)
     {
         this();
         
     }
     
     public static void main(String []args){
         
         TestClass t = new TestClass(25);
         //System.out.println(t); /** Both of these statements indicate to the same reference 
         //System.out.println(this);
         
         
      
     }
}
