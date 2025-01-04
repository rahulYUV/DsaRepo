#include<iostream>
#include<vector>
using namespace std;

//leetcode 
//rotate array by k 

void rotate( vector<int>&ans, int k ){
    int n =ans.size();
    vector<int>rot(n);
    for(int i =0;i<n;i++){
        int newi = ((i+k)%n);
        rot[newi]= ans[i];
    }

    ans = rot;

}



int main(){
   
    // vector<int>num;
    // num={10,20,30,40,50,60};
    // // cout<<num[2];
    // rotate(num,2);
    // for(int i =0;i<num.size();i++){
    //     cout<<num[i];
    //     cout<<" ";

    // }
    return 0;


}
