#include<iostream>
using namespace std;
int star(int n ){
    
        for(int i =0;i<n;i++){
            for(int j =0;j<i+1;j++){
                cout<<" ";
            }
            //full pyramid
            for(int k =0;k<2*n-2*i-1;k++){
                cout<<" ";

            }
            for(int l =0;l<i+1;l++){
                cout<<"*"<<endl;
                    }
                    cout<<endl;
        }



    return 0;
}

 int fancypattern(int n ){
    for(int i =0;i<n;i++){
        for(int j =0;j<2*i+1;j++){
            // cout<<"*";
           if(j%2==0){
             cout<<i+1;
           }
           else{
            cout<<"*";
           }
        }

        cout<<endl;
    }

    for(int i =4;i>0;i--){
        for(int j =0;j<2*i+1;j++){
            // cout<<"*";
           if(j%2==0){
             cout<<i;
           }
           else{
            cout<<"*";
           }
        }
        cout<<endl;

    }
    return 0;
 }


 int newpattern(int n ){
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i;j++){
               if(i ==0|| j ==0){
                 cout<<" *";
               }
               else{
                if(j ==0||j==n-i-1){
                    cout<<" *";
                }
                else{
                    cout<<" ";
                }
               }
            }
            cout<<endl;
        }

    return 0;
 }

int main(){
 int n =5;
    // star(8);
    // fancypattern(n);
    newpattern(n);


    return 0;
}