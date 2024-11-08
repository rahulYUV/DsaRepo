#include<iostream>
using namespace std;

struct node{
    int data;
    struct node* next;
};
struct node* root=NULL;
    void append(){
        struct node* temp;
        temp = (struct node*)malloc(sizeof(struct node));
        cout<<"enter the node element: "<<endl;
        cin>>temp->data;
        temp->next=NULL;

        if(root ==NULL){
            root=temp;

        }
        else{
            struct node* p = root;
            while(p->next!=NULL){
                p=p->next;
            }
            p->next=temp;
        }
        cout<<"data added successfully: "<<temp->data<<endl;
    }
 int main(){
    append();
    append();
    return 0;
 }
