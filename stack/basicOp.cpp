#include <stdio.h>

#define SIZE 5  // Maximum size of the stack

int top = -1;
int arr[SIZE];

// Function to check if the stack is full
int isFull() {
    if (top == SIZE - 1) {
        printf("Overflow occurred: Stack is full!\n");
        return 1;  // Return 1 (true)
    }
    return 0;  // Return 0 (false)
}

// Function to check if the stack is empty
int isEmpty() {
    return top == -1;  // Return 1 (true) if empty, 0 (false) otherwise
}

// Push function to add an element to the stack
void push() {
    if (isFull()) {
        return; // Return if stack is full
    } else {
        int temp;
        top++;  // Move the top pointer to the next position
        printf("Enter the data to push: ");
        scanf("%d", &temp);  // Input data from user
        arr[top] = temp;  // Store the data at the top position
        printf("Pushed %d to the stack.\n", temp);
    }
}

// Pop function to remove an element from the stack
void pop() {
    if (isEmpty()) {
        printf("Underflow occurred: Stack is empty!\n");
    } else {
        printf("Popped %d from the stack.\n", arr[top]);
        top--;  // Decrease the top pointer to remove the element
    }
}

// Peek function to view the top element of the stack
void peek() {
    if (isEmpty()) {
        printf("Stack is empty!\n");
    } else {
        printf("Top element: %d\n", arr[top]);
    }
}

int main() {
    int choice;
    
    // Display the menu for user interaction
    do {
        printf("\n*********** Menu ***********\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Check if Full\n");
        printf("5. Check if Empty\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);  // Take user input for the operation

        switch (choice) {
            case 1:
                push();  // Call push() function to add an element
                break;
            case 2:
                pop();  // Call pop() function to remove the top element
                break;
            case 3:
                peek();  // Call peek() function to view the top element
                break;
            case 4:
                if (isFull()) {
                    printf("The stack is full.\n");
                } else {
                    printf("The stack is not full.\n");
                }
                break;
            case 5:
                if (isEmpty()) {
                    printf("The stack is empty.\n");
                } else {
                    printf("The stack is not empty.\n");
                }
                break;
            case 6:
                printf("Exiting...\n");  // Exit the program
                break;
            default:
                printf("Invalid choice! Please try again.\n");  // Invalid input handling
        }
    } while (choice != 6);  // Loop until the user chooses to exit

    return 0;  // End of the program
}
