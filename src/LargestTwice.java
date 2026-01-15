import java.util.Scanner;
public class LargestTwice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        int n=scan.nextInt();
        int[] arr =new int[n];
        
        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        int index=-1;
        int largest=arr[0];
        for (int i=0;i<n;i++) {
            if (arr[i]>largest) {
                largest = arr[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=index && arr[i]*2>largest){
                System.out.println("-1");
                break;
            } 
        }
        System.out.println(index); 
    
    }

}
