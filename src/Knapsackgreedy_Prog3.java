import java.util.Scanner;
public class Knapsackgreedy_Prog3
{
public static void main(String[] args)
{
    int i , j=0,max_qty,m,n;
    float sum=0,max;
    Scanner sc= new Scanner(System.in);
            int array[][]=new int[2][20];
    System.out.println("Enter the number of items");
    n=sc.nextInt();
    System.out.println("Enter the weights of each item");
    for(i=0;i<n;i++)
    {
        array[0][i]=sc.nextInt();
    }

    for(i=0;i<n;i++)
    {
        array[1][i]=sc.nextInt();
    }
    System.out.println("Enter the maximum volume of Knapsack");
    max_qty=sc.nextInt();
    m=max_qty;
    while(m>=0)
    {
        max=0;
        for(i=0;i<n;i++)
        {
            if((float)array[1][i]/((float)array[0][i])>max)
            {
                max=((float) array[1][j]/((float )array[0][j]));
                        j=i;
            }
        }

        if(array[0][j]>0)
        {
            System.out.println("Quantity of item number"+(j+1)+"added is"+m);
                    sum+=m*max;

        }
        else
        {
            System.out.println("Quantity of item numbers"+j+1+"added is" + array[0][j]);
            m=array[0][j];
            sum+=(float)array[1][j];
        }
    }
    System.out.println("Total profit is"+sum);
    sc.close();
}

}
