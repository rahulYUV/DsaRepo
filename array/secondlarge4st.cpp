#include<iostream>
#include<Climits>

using namespace std;
 int secondMax(int arr[],int size){
    int max =arr[0];
    int secondMaxi = INT_MIN;
    for(int i =1;i<size;i++){
        if(arr[i]>max){
            secondMaxi = max;
            max =arr[i];
        }
        else if(arr[i]<max && arr[i]>secondMaxi)
        {
            secondMaxi = arr[i];

        }
    }
    return secondMaxi;

 }
 int main(){
    int arr[]={6,15,10,14,15,14};
    int size = 6;
    int slargest = secondMax(arr,size);
    cout<<" the slargest is "<<endl;
    cout<<slargest<<endl;
    return 0; 

 }