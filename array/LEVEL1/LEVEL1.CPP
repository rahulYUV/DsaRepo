// ARRAY IS THE COLLECTION OF SIMAILAR DATA TYPE
//WEHRE ELEMENT STORE IS CONTIONOUGES MEMORY LOCATION 
//WHY IT IS NEEDED : WHEN I HAVE TO COMPUTE SIMILAR DATA ELEMENTS 
// THEN IT IS ESSENTIAL 
#include<iostream>
#include<limits.h>
using namespace std;
            int disp(int arr[],int size){
                for(int i =0;i<size;i++){
                    cout<<arr[i]<<" ";
                
            }
            }
            bool linearsearch(int arr[],int size,int key){
                for(int i =0;i<size;i++){
                    if(arr[i]==key){
                        return true;
                        
                    }
                }
                return false;
            }

            void countonezero(int arr[],int size){
                int zero=0;
                int one =0;
                for(int i =0;i<size;i++){
                    if(arr[i]==0){
                        zero++;
                    }else{
                        one++;
                    }
                }
                cout<<zero<<"and one is :"<<one;

            }

            int smallest(int arr[],int size){
                int small = INT_MAX;
                for(int i=1;i<size;i++){
                    if(arr[i]<small){
                        small=arr[i];
                    }
                }
                return small;
            }
            //pass by reference 
            int swap(int &a , int &b ){
            	a=a^b;
            	b=a^b;
            	a=a^b;
            	
			}

            void reversh(int arr[],int size){
                int left=0;
                int right=size-1;
                while( left<=right){
//                    int temp;
//                    arr[left]=(arr[left]^arr[right]);
//                    arr[right]=(arr[left]^arr[right]);
//                    arr[left]=(arr[left]^arr[right]);
						swap(arr[left],arr[right]);
                    left++;
                    right--;
                }

            }
            
            //extreme print
            
            void extreme(int arr[],int size){
            	int left =0;
            	int right=size-1;
            	while(left<=right){
            		if(left+right==size-1){
            				swap(arr[left],arr[right]);
					}
            	
				}
			}
int main(){
    int arr[5];
    cout<<sizeof(arr);
    bool flag[35];

    cout<<sizeof(flag);
    cout<<" this is the garbage value: "<<arr[0]<<endl;
    cout<<&arr[0];
    //garbage value and the address is different 
    int a;
    cout<<"this is without a :"<<a<<endl;
    cout<<"addressof operator"<<&a<<endl;

    int bh[10];
     cout<<"this is without a :"<<bh<<endl;
    cout<<"addressof operator"<<&bh<<endl;

       
        // int c[5]; continouse memory allocation 
        // for(int i=0;i<5;i++){
        //     cout<<" the address of i is:"<<&c[i]<<endl;
        // }
            // int ch[5];
            // for(int i =0;i<5;i++){
            //     cout<<" enter the elemnt at "<<i<<"it postion::";
            //     cin>>ch[i];
            //     cout<<endl;
            // }
cout<<"******************************************"<<endl;

                        // int dh[10];
                        // int sum =0;
                        // for(int i =0;i<10;i++){
                        //     int temp;
                        //     cout<<"enter the "<<i<<"th value";
                        //     cin>>dh[i];
                        //     sum=(sum+dh[i]);
                        // }
                        // cout<<" the sum is : "<<sum;
 //linerar search 



                //     
                //     int key =10;
                //     int flagg =0;
                //     for(int i =0;i<5;i++){
                //         if(arr[i]==key){
                //             cout<<"element is founded";
                //         	// flag =1;
                //            flagg =1;
                //             break;
                //         }
                //     }
                //     if(flag==0){
                //     	cout<<" key is not found";
				// 	}

				// 	int farr[5]={1,2,3,4,5};
				// 	bool chh= linearsearch(farr,5,5);
				// 	cout<<chh;

                //  int ghh[]={1,1,1,0,0};
                //     countonezero(ghh,5);
                    int ea[6]={1,-1,6,8,10,10};
//                  int c=  smallest(ea,5);
                  cout<<endl;
                    cout<<endl;

					cout<<endl;
					disp(ea,6);
					cout<<endl;
//					
//                    reversh(ea,6);
//                    disp(ea,6);
				extreme(ea,6);
                  disp(ea,6);
                    




    
}
