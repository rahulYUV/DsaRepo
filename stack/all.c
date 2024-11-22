#include<stdio.h>
#include<stdbool.h>
#define size 5
int top =-1;
int arr[size];
 
 bool isfull(){
    if(top ==size-1){
        printf(" overflow occure");
        return true;

    }
    else{
        return false;
    }

 }
 bool isEmpty(){

                if(top==-1){
                    printf(" underflow occur");
                    return true;
                }
                else{
                    return false;
                }
 }
 int  push(){
    if(isfull()){
        return 1;
    }
    else{
            top++;
            printf(" enter the data: ");
            scanf("%d",&arr[top]);
            printf("%d data pushed successfully",arr[top]);
    }
    return 0;

 }
 int pop(){
        if(isEmpty()){
            return 1;
        }
        else{
            int temp;
            temp = arr[top];
            top--;
            printf("%d data popped success", temp);
            return 0;
        }
 }
int peek(){
                if(isEmpty()){
            return 1;
        }
        else{
            int temp;
            temp = arr[top];
            
            printf("%d on the top ", temp);
            return 0;
        }
 }
  int disp(){
    int i ;
     if(isEmpty()){
            return 1;
        }
         for(i =top;i>0;i--){
                    printf(" %d the %d is ", arr[top],i);
                    printf(" \n");
                }
        
        return 0;
  }
 int main(){

    push();
    push();
    push();
    pop();
    disp();
    // isEmpty();
    return 0;
 }