package TUF.Arrays.Ease;

public class ApperOncee {
    
  
    
        public static void main(String[] args) {
            int[] arr={1,1,2,2,10,3,3,4,4,10,5};
                int temp = once(arr);
                System.out.println(temp+"this is appear twice ");
        }
    
            static int once(int[] arr){
                int xor =0;
                for(int x: arr){
                    xor = xor^x;
                }
                return xor;

            }
    
    
    }

