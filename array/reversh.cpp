#include<iostream>
using namespace std;
 void reversh(int arr[] , int n ){
    int left =0;
    int right =n-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
    //using for loop 
                    // for(int i =0;i<n/2;i++){
                    //         int temp = arr[left];
                    //         arr[left]=arr[right];
                    //         arr[right]=temp;
                    //         left++;
                    //         right--;

                    // }
                            for(int i =0;i<n;i++){
                                cout<<arr[i]<<endl;

                            }

 }
 int main(){
    int arr[]={1,2,3,4,5,6,};
    int size =6;
    reversh(arr,size);
    return 0;
 }