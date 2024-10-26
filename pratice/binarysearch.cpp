#include<iostream>
using namespace std;
int binarySearch(int arr[], int size, int key){
    int left=0;
    int right =size-1;
    int mid = (left + right)/2;
    int flag =-1;
    while(left<=right){
        if(key==arr[mid]){
            flag=1;
                return mid;
                
        }
        if( key>arr[mid]){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
        mid = (left+right)/2;
        

        
           
        
    }
    return flag;
}
int main(){
    int even[6]={2,4,6,8,12,18};
    int odd[5]={3,8,11,14,16};
    int index = binarySearch(even,6,77);
    cout<<" index is key is "<<index;
    return 0;
}