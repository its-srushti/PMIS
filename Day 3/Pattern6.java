//print pattern order like 12345 in 1st row and 1234 in 2nd row and so on
     /**
      * Pattern6
      */
     public class Pattern6 {
         public static void main(String[] agrs){

         
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
     
        
     }
    }
    