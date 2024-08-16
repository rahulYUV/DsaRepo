#include<iostream>
using namespace std;
 int swapone(int arr[],int size){
 int left=0;
 int right=size-1;
 	while(left<right){
 		while(arr[left]==0){
 			left++;
		 }
		 while(arr[right]==1){
		 	right--;
		 }
		 swap(arr[left],arr[right]);
		 left++;
		 right--;
	 }
 }
 void print(int arr[], int size){
 	for(int i=0;i<size;i++){
 		cout<<arr[i]<<" ";
	 }
 }
 int main(){
 	int arr[]={1,0,0,1,0,0,1,1,0,0,1,0};
 	int size=12;
 	swapone(arr,size);
 	print(arr,size);
 }
