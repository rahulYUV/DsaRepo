#include <stdio.h>
#define SIZE 5

int queue[SIZE];
int front = -1;
int rear = -1;

void enqueue() {
    if (rear == SIZE - 1) {
        printf("Overflow\n");
    } else {
        if (front == -1) { // Initial condition
            front = 0;
        }
        rear++;
        printf("Enter element: ");
        scanf("%d", &queue[rear]);
        printf("Data enqueued successfully\n");
    }
}

void dequeue() {   
    if (front == -1 || front > rear) {
        printf("Underflow\n");
    } else {
        printf("Data dequeued: %d\n", queue[front]);
        front++;
        if (front > rear) { // Reset the queue when all elements are dequeued
            front = rear = -1;
        }
    }
}

int main() {
    enqueue();
    enqueue();
    enqueue();
    enqueue();
    enqueue();
    enqueue(); // This should indicate overflow

    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue(); // This should indicate underflow

    return 0;
}
