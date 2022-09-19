import java.util.HashMap;
import java.util.Scanner;

class twoSome{
    public static int[] sum(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return new int[]{map.put(arr[i],i)};
            }
            else{
                map.put(target-arr[i],i);
            }
        }
        return new int[]{0,0};
       
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr, target);
        
     }
}