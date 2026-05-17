import java.util.*;

// select minimum from arrya and swap it by first element and in next iteration leave that sorted array..
class Q3
{
    static void select_sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int max=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[max])
                {
                    max=j;
                }
            }

            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {

        int [] arr={13,46,24,52,20,9};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Q3.select_sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}