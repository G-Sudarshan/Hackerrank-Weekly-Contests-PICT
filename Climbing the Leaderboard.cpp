#include<bits/stdc++.h>
using namespace std;
int main(){ 
    long n,i,x;
    cin >> n;
    long a[1000000];
    i=0;
    cin>>a[0];
    for(long var = 1;var < n;var++){
       cin >> x;
       if(x!=a[i])
       {
           i++;
           a[i]=x;
       }    
    }
    // for(long var=0;var<n;var++) cout<<a[i]; 
    //sort(a,a+n);
    n=i+1;
    long m;
    cin >> m;
    i=n-1;
    for(long var= 0;var < m;var++){
       cin >> x;
        while(a[i]<x && i>=0)
            i--;
        //i--
        //var++
        if(i==-1)
            cout<<1<<endl;
        else if(a[i]==x)
        cout<<i+1<<endl;
        else cout<<i+2<<endl;//life saver
    }
    return 0;
}
