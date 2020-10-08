#include <iostream>
#include <string>
#include <math.h>
#include <algorithm>
#include <vector>
#include <stack>
#include <queue>
#include <set>
#include <map>
#include <utility>
using namespace std;
typedef long long ll;
void swap(int *x,int *y){
    int temp=*x;
    *x=*y;
    *y=temp;
}
void BubbleSort(int list[],int n){
    int i,j;
    for(i=0;i<n-1;i++)
        for(j=0;j<n-i-1;j++)
            if(list[j]>list[j+1])
                swap(&list[j],&list[j+1]);
}
int main(){
    int list[]={64,34,25,12,22,11,90};
    int i,n=sizeof(list)/sizeof(list[0]);
    BubbleSort(list,n);
    cout<<"Sorted listay: \n";
    for(i=0;i<n;i++)
        cout << list[i] << " ";
    cout << endl;
    return 0;
}
gity