package TUF.Arrays.Hard;



public class PascalTriangle {
    public static void main(String [] args){
            

        int row = 6;
        // Pascal(row);
        optimalRowPrinting(row);


        
    }
    public static void Pascal(int n ){
        int nn = n-1;
        for(int c=1;c<=n;c++){
            System.out.print(nCr(nn,c-1)+" ");
        }
    }


    public static void optimalRowPrinting(int n ){
        int ans = 1;
        System.out.println(ans);
        for(int i =1;i<n;i++){
            ans = ans *(n-i);
            ans = ans/(i);
            System.out.print(ans);
        }

    }
public static long nCr(int var0, int var1) {
    long var2 = 1L;

    for(int var4 = 0; var4 < var1; ++var4) {
       var2 *= (long)(var0 - var4);
       var2 /= (long)(var4 + 1);
    }

    return var2;
 }
}