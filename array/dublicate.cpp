#include<iostream>
using namespace std;
 
 int removeDublicate(int arr[],int size){
    int count = 0;
    for(int i =1;i<size;i++){
        if(arr[i]!=arr[i+1]){
             count++;
        }

       
    }
    return count;
 }
    int main (){
        int arr[]={1,1,2,3,3,4,4,4,4,4,5,5};
        int size = 12;
        int count = removeDublicate(arr,size);
        cout<<count;
        return 0;
    }