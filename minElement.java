public class minElement {
    public static void min(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Minumum element is "+min);
    }
    public static void main(String[] args)
    {
        int a[]={5,1,6,7,2};
        min(a);
    }
}
