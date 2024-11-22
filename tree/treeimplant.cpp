#include<iostream>
#include<malloc.h>
using namespace std;

struct node{
    int data;
    struct node* left;
    struct node* right;

};
struct node* newNode(int data){
    struct node* newNode;
    newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data=data;
    newNode->left=NULL;
    newNode->right=NULL;
    return newNode;
}

int main(){
    struct node* root= newNode(2);
    root->left= newNode(2);
    root->right=newNode(3);

    root->left->left = newNode(4);

    printf("%d root",root->data);
    printf("%d root left",root->left);
    printf("%d root right",root->right);
    printf("%d root right l right", root->left->left);
    return 0;
      
  
    
     
    


}

