public class PrintSecondLargestElement {
    //Find out the second largest element of the given array
    //numbers=[5,3,9,7,4,1,8]
    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String args[]){
        int a[]={5,3,9,7,4,1,8};

        System.out.println("Second Largest Number in the given Array is : "+getSecondLargest(a,6));

    }
}

