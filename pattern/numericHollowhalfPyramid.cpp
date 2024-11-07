#include<iostream>
using namespace std;
int star(int n ){
    for(int i =0;i<n;i++){
        for(int j =0;j<i+1;j++){
            if(j==0|| j==i|| i == n-1){
                cout<<j+1;

            }
            else{
                cout<<" ";
            }
        }
        cout<<endl;
    }
}
int main(){
    star(5);
    return 0;
}