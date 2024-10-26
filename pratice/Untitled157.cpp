#include<stdio.h>
int getmax(int arr[],int size){
	int i , largest=0;
	for( i =0; i<size;i++){
		if(largest<arr[i]){
			largest=arr[i];
		}
	}
	return largest;
}
int main(){
	int arr[6]={2,56,66,77,9,0};
	int size=6;
	int c;
	c=getmax(arr,size);
	printf(" %d",c);
	return 0;
}
