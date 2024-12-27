#include<bits/stdc++.h>
using namespace std;

void ByReference(int &Age)
{
Age += 5;
cout<<"Age in ByValue Method is: "<<Age<<endl;
}

int main()
{
  //C++
  int Age;
  cout<<"Enter Age:"<<endl;
  cin >> Age;   
  ByReference(Age);
  cout<<"Age in Main Method is: "<<Age;
    return 0;
}
