#include<iostream>
using namespace std;
        int disp(int arr[],int size){
                for(int i =0;i<size;i++){
                    cout<<arr[i]<<" ";
                
            }
        }
        void swap(int &a,int &b){
            a =a^b;
            b =a^b;
            a =a^b;

        }

        int left(int arr[],int size){
            int temp =0 ;
            for(int i =0;i<size;i++){
                if(arr[i]<0){
                    swap(arr[i],arr[temp]);
                    temp++;
                }
                
            }
            disp(arr,7);
        return 0;
        }


int main(){

        int arr[]={-23,-7,12,-10,-11,40,60};
        left(arr,7);
    return 0;
}