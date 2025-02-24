import java.util.Random;
import java.util.Scanner;
public class MergeSort_Prog2 {

static int max=30000;
void merge(int [] array, int low ,int mid, int high)
{
    int i=low;
    int j=mid+1;
    int k=low;
    int[]resarray;
    resarray=new int [max];
    while(i<=mid&&j<=high)
    {
        if(array[i]<array[j])
        {
            resarray[k]=array[i];
            i++;
            k++;
        }
        else {
            resarray[k]=array[j];
            j++;
            k++;

        }
    }
}
}
