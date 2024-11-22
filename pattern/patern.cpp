
 
 #include<iostream>
 using namespace std;
 int star( int n ){
    for(int i =0;i<n;i++){
       for(int j =0;j<n-i-1;j++){
        cout<<" ";
        //spaces
        
       }
       for(int k =0;k<i+1;k++){
        cout<<"* ";
       }
            cout<<endl;

    }
    return 0;
 }




   
 
 int main(){
    int n =5;

//    star(5);
    return 0;
 }