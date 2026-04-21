import java.math.BigDecimal;
import java.util.*;
class Solution19{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        List<BigDecimal> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            BigDecimal A = new BigDecimal(s[i]);
            arr.add(A);
        }
        Collections.reverseOrder();  // ❌ Error
        Collections.sort(arr);       // ❌ Error

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
// ❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌