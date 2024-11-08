#include<iostream>
using namespace std;

struct node{
    int data;
    struct node* next;
};
struct node* root =NULL;
void addatbegin(){
    struct node* temp;
    temp = (struct node*)malloc(sizeof(struct node));
    cout<<" enter the node element ";
    cin>>temp->data;
    temp->next=root;
    root=temp;

}
int main(){
    addatbegin();
    return 0;
}