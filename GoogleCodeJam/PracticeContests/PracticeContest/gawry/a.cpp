#include<cstdio>
#include<algorithm>
#include<iostream>
#include<sstream>
#include<string>
#include<vector>
#include<set>
#include<map>
#include<numeric>
#include<cmath>
using namespace std;

#define ALL(t) t.begin(),t.end()
#define FOR(i,n) for (int i=0; i<(int)(n); i++)
#define FOREACH(i,t) for (typeof(t.begin()) i=t.begin(); i!=t.end(); i++)
typedef vector<int> vi;
typedef long long int64;

int main() {
  int n,x,y;cin>>n;
  for(int c=1;c<=n;c++){
    cin>>x>>y;
    cout<<"Case #"<<c<<": "<<(y%2?"BLACK":"WHITE")<<endl;
  }
  return 0;
}
