package String;

public class revershString {
public static void main(String[] args) {
    String st = "Java";
    reversh(st);

        }
        public static void reversh(String st ){
            char[] c = st.toCharArray();
            int start = 0;
            int end = c.length-1;
            while(start<end){
                // c[start]= c[start]^c[end];
                // c[end]= c[start]^c[end];
                // c[start]= c[start]^c[end];not works on string 
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
            String stt = new String(c);
            System.out.println(stt);


        }
}
