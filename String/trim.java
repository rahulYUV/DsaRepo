package String;

public class trim {
    public static void main(String[] args) {
        String s = "   Hello uhser!! Welcomeh ";
            //   trimm(s);

            replace(s);

    }


        public static void replace(String st){
            char[] c = st.toCharArray();
            for(int i =0;i<c.length;i++){
                        if(c[i] == 'h' ||  c[i] == 'H' ){
                            c[i]= 'r';
                        }
            }

            String result = new String(c);
            System.out.println(result);
        }


        public static void trimm(String st){
            
            char[] c = st.toCharArray();
            int start = 0;
            int end = c.length-1;
            int count =0;

                for(int i =0;i<end;i++){
                    if(c[i] != ' '){
                        start= i;
                    }
                }
                for(int i = end;i>=0;i--){
                    if(c[i] !=0){
                        end = i;
                    }
                }
                String result = new String(c,start,end);
                System.out.println(result +"the result is "+ result);
                    
        }

}
