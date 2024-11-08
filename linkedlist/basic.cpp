#include<iostream>
using namespace std;
struct node{
    int data;
    struct node* next;
};
struct node* root = NULL;
void append() {
    struct node* temp;
    temp = (struct node*)malloc(sizeof(struct node));
    
    cout << "Enter the data: ";
    cin >> temp->data;
    temp->next = NULL;  // Set the next pointer of the new node to NULL

    if (root == NULL) {
        root = temp;  // If the list is empty, make the new node the root
    } else {
        struct node* p = root;
        while (p->next != NULL) {  // Traverse to the last node
            p = p->next;
        }
        p->next = temp;  // Link the new node to the last node
    }
    
    cout << "Data added successfully: " << temp->data << endl;  // Print the new data added
}

int main(){
    append();
    
    
}