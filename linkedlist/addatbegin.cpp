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
    cout<<"data added success";

}
int disp(){
   struct node* temp = root;
   while(temp->next!=NULL){
    cout<<"-> "<<temp->data;
    temp=temp->next;

   }
    
}



int main(){
   

   addatbegin();
    disp();
    return 0;
}