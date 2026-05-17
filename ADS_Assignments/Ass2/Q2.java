import java.util.*;


// [1, 3, 5, 7, 4]

public class Q2 {

    static void inser_at(List<Integer>arr,int elm)
    {
        // int n2=arr.length+1;
        arr.add(elm);
        int j=arr.size()-2;
        // int j=arr.size()-1;
        while(j>0 && arr.get(j-1)>arr.get(j))
        {
            // Collections.swap(arr,(j-1),j);
            arr.set(j+1,arr.get(j));
            j--;

        }
        arr.set(j+1,elm);



        System.out.println("List After adding new elme: ");
        for(int e:arr)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        List<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);

        System.out.println("List before adding new elme: ");
        for(int elm:arr)
        {
            System.out.println(elm);
        }

        Q2.inser_at(arr,4);

    }
}

// while(arr[j]<elm)
// swap(arr[j],elm)
// j--
// arr size extra one
// [1, 3, 5, 7]
