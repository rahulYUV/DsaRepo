#include<iostream>
using namespace std;
bool prime(int n ){
    for(int i=2;i<n*0.5;i++){
        if(n%i==0){
           return false;
        }
    }  
  
    return true;
}
int main(){
    if(prime(5)){
        cout<<" it is prime";
    }
    else{
        cout<<" it is not prime";
    }
   return 0;
}