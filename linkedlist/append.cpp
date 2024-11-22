#include<iostream>
using namespace std;

struct node{
    int data;
    struct node* next;
};
  struct node* root =NULL;
void append(){
    struct node* temp;
    temp = (struct node*)malloc(sizeof(struct node));
    printf("entert the element: ");
    scanf("%d",&temp->data);
    if(root==NULL){
        root=temp;
    }
    else{
        struct node*p = root;
        while(p->next!=0){
            p=p->next;
        }
        p->next=temp;
        printf("\n element succes added in list %d",temp->data);


    }
}

        void deletefirst(){
            if(root==NULL){
                cout<<"nothing to delte"<<endl;
            }
            else{
                struct node* temp =root;
                root = root->next;
                free(temp);
            }
        }
        void disp(){
            if(root ==NULL){
                cout<<" nothing to delete"<<endl;

            }
            else{
                struct node* temp=root;
                while(temp->next!=NULL){
                    cout<<temp->data<<"-> ";
                }
            }
        }
int main(){
    append();
    append();
    deletefirst();
   disp();
    return 0;
}













// struct node* root=NULL;
//     void append(){
//         struct node* temp;
//         temp = (struct node*)malloc(sizeof(struct node));
//         cout<<"enter the node element: "<<endl;
//         cin>>temp->data;
//         temp->next=NULL;

//         if(root ==NULL){
//             root=temp;

//         }
//         else{
//             struct node* p = root;
//             while(p->next!=NULL){
//                 p=p->next;
//             }
//             p->next=temp;
//         }
//         cout<<"data added successfully: "<<temp->data<<endl;
//     }
//    void length(){
//     int count=0;
//     struct node* temp;
//     temp=root;
//     while(temp->next!=NULL){
//         temp=temp->next;
//         count++;
//     }
//     printf("%d",count);

//    }
