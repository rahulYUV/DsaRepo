#include<iostream>
using namespace std;
struct node{
    int data;
    struct node* next;

};
struct node* root =NULL;
void del(){
struct node* temp;
int loc;
printf(" eneter the location");
scanf("%d",loc);

    if(root ==NULL){
        cout<<"nothing to delete";

    }
    else if(loc==1){
        temp = root;
        root= temp->next;
        free(temp);

    }
    else{
        
    }
    
}