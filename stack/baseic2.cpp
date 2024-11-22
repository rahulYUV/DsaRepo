#include<iostream>
using namespace std;

#define SIZE 5
int top = -1;
int arr[SIZE];

bool isFull() {
    return top == SIZE - 1;
}

bool isEmpty() {
    return top == -1;
}

void push(int data) {
    if (isFull()) {
        cout << "Overflow occurred" << endl;
    } else {
        top++;
        arr[top] = data;
        cout << "Data added successfully: " << data << endl;
    }
}

void pop() {
    if (isEmpty()) {
        cout << "Underflow occurred" << endl;
    } else {
        int temp = arr[top];
        top--;
        cout << "Data popped successfully: " << temp << endl;
    }
}

int main() {
    push(5);
    pop();

    return 0;
}
