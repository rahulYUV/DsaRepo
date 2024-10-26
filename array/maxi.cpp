#include<iostream>
using namespace std;
 int maxi(int arr[], int n){
    int max = 0;
            for(int i =0;i<n;i++){
                if(arr[i]>max){  //optimal approches 
                    max =arr[i];
                }
            }
        
            return max;

        }
        
 int main(){
    int arr[]={2,3,4,5,62};
    int size=5;
    int maximum = maxi(arr,size);
    cout<<" the maximum is "<<endl;
    cout<<maximum;
   cout<<endl;
    return 0;
 }