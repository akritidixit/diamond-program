class Diamond
{
 
public static void main(String[] args)
          {
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=5-i;j++)
            {
            System.out.print(" ");//print space
          }
 
           for(int j=1;j<=i*2-1;j++)
           {
           System.out.print("*");//print asterisk for the upper triangle
           }
           System.out.println();
} //upper triangle
           for(int i=4;i>0;i--)
           {
              for(int j=1;j<=5-i;j++)
 
           {
           System.out.print(" ");
           }
           for(int j=1;j<=i*2-1;j++)
 {
System.out.print("*");//print asterisk for lower triangle
}
System.out.println();
}//lower triangle
}}