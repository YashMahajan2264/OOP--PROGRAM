public class pattern1 
{
    public static void main(String []args)
    {
        int n=10;
        System.out.println("Pattern A:-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==0 && j>0 && j<(n-1)/2) || (j==0 && i>0) || (i==(n-1)/2 && j<=(n-1)/2) || (j==(n-1)/2 && i>0))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern D:-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((j==0 || (i==0 && j<(n-1)/2) || (j==(n-1)/2)&&i>0&&i<(n-1)) || (i==(n-1) && j<(n-1)/2))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern H:-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || j==(n-1) || i==(n-1)/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern T:-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==(n-1)/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
