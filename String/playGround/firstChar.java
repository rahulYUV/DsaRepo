
package String.playGround;
import java.util.*;


public class firstChar {
    public static void main(String[] args) {
        String s = new String("Hellow Java the3 3");
        // char[] c = s.toCharArray();
        //     for(int i =0;i<c.length;i++){
        //         if(c[i] != ' '){
        //             if(i==0){
        //                 System.out.println(c[i]);
        //             }
        //             else if(c[i-1]==' '){
        //                     System.out.println(c[i]);
        //             }
        //         }
        //     }


                // String st = new String("Hellow Java Is legendary");
                // char[] c = st.toCharArray();
                // for(int i =0;i<c.length;i++){
                //     if(c[i] != ' '){
                //         if(i==0){
                //             System.out.println(c[i]);
                //         }
                //         else if(c[i-1] == ' '){
                //             System.out.println(c[i]);
                //         }
                //     }
                // }
                String st="leetcode";
              firstUniqChar(st);

    }
    public static int firstUniqChar(String s) {
        char[] c = s.toCharArray();  // Convert string to character array
        int lengthh = c.length;  
        boolean flag;  // To track whether a character is repeated

        for (int i = 0; i < lengthh; i++) {
            flag = false;  // Assume the character is unique

            // Check if the character appears anywhere else in the string
            for (int j = 0; j < lengthh; j++) {
                if (i != j && c[i] == c[j]) {  // Skip comparing the character with itself
                    flag = true;  // Mark as repeated
                    break;  // No need to check further
                }
            }

            // If no duplicate was found, return index i
            if (!flag) {
                return i;
            }
        }

        return -1;  // If no unique character is found
    }

}
