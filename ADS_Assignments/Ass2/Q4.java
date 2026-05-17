public class Q4 {
    static void bb_sort(int arr[])
    {
        int n=arr.length;
        // System.out.print("pass1: ");
        for(int i=0;i<n-1;i++)
        {
            boolean swap=false;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }

            }
             if(!swap)
            {
                break;
            }
            System.out.print("Pass"+ (i+1)+": ");
                for(int k=0;k<n;k++)
                {
                    System.out.print(arr[k]+" ");
                }
            System.out.println();
           
                
        }

        // for(int k=0;k<n;k++)
        //         {
        //             System.out.print(arr[k]+" ");
        //         }
        //         System.out.println();
                
    }
    public static void main(String[] args) {
        int[] arr={18 ,13, 14, 0 ,7};
        Q4.bb_sort(arr);

    }

}
