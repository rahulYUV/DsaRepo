import java.util.StringTokenizer;  

public class TokenizerExample {   
    public static void main(String[] args) {
        // String Tokenizer
        StringTokenizer st = new StringTokenizer("java python sql ai ml", " ");
        // st.hasMoreTokens();
        // System.out.println(st.nextToken());
        // st.hasMoreTokens();
        // System.out.println(st.nextToken());
        // st.hasMoreTokens();
        // System.out.println(st.nextToken());
        // st.hasMoreTokens();
        // System.out.println(st.nextToken());
        // st.hasMoreTokens();
        // System.out.println(st.nextToken());
       
         while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
         }
    }
}
