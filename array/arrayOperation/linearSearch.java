package array.arrayOperation;

public class linearSearch {

    public static void main(String args[]){
        // int[]  brr= {10,20,30,40,50};
        // int  index = FindKey(brr, 70);
        // System.out.println(index);

        String[] menu ={"dosa","sambhar","desert","samosa","misal"};
        int index = FindMenu(menu,"none");
        if(index!=-1){
        System.out.println(index+" menu is at this index");
        }else{
            System.out.println("the item is not exitst in the menu"+ index);
        }
    }
        public static int FindMenu(String[] arr,String key){
            for(int i =0;i<arr.length;i++){
                if(arr[i]==key){
                    return i;
                }
            }
            return -1;
        }


    static int FindKey(int[] arr, int key){
            for(int i =0;i<arr.length;i++){
                if(arr[i]== key){
                    return i;

                }

            }   
            return -1;     
    }
}
