#include<iostream>
using namespace std;
		int negativeshift(int arr[],int size){
			int j=0;
			for(int i =0;i<size;i++){
					if(arr[i]<0){
						swap(arr[i],arr[j]);
							j++;
						
					}
			}
			return 0;
		}
  	
  	
  
  void printarr(int arr[],int size){
  	for(int i=0;i<size;i++){
  		cout<<arr[i]<<" ";
  		
	  }
  }
  int main(){
  	int arr[6]={23,-7,12,-10,-11,40};
  	int size=6;
  	negativeshift(arr,size);
  	printarr(arr,size);
  	
  	return 0;
  }
