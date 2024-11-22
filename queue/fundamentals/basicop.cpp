#include<iostream>
using namespace std;
#define N 5
int arr[N];
int front =-1;
int rear = -1;
void enqueue(int data){
    if(rear==N-1){
        cout<<"overflow condition"<<endl;
        }
    else if(front ==rear==-1){
        front =rear=0;
        arr[rear]=data;

    }
    else{
        rear++;
        arr[rear]=data;
        cout<<" data added succes",data;
        cout<<endl;
    }
}
void dequeue(){
    if (front == -1 && rear == -1) {
        cout << "Underflow occurred";
        cout << endl;
    }
    else if (front == rear) { // Only one element in the queue
        int temp = arr[front];
        front = rear = -1; 
        cout << temp << " element dequeued successfully"; 
        cout << endl;
    }
    else {
        int temp = arr[front];
        front++;
        cout << temp << " element dequeued successfully" << endl;
    }
}

    
    int main(){
        enqueue(5);
        enqueue(5);
        enqueue(5);
        enqueue(5);
        enqueue(5);
        dequeue();
         dequeue();
          dequeue();
           dequeue();
           
     enqueue(5);
          return 0;
    }
