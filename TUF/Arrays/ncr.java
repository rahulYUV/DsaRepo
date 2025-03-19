package TUF.Arrays;

public class ncr {
    public static void main(String[] args) {
        int n = 5;
        int r = 4;
        long result = nCr(n,r);
        System.out.println("this is the NCR: "+result);


    }

    public static long nCr(int n , int r ){
             long res =1;

             for(int i=0;i<r;i++){
                res = res*(n-i);
                res = res/(i+1);
             }

             return res;


    }
}
