#include <iostream>
using namespace std;

int main()
{
	//for first time
	int hour1,minute1,second1;
	//for second time
	int hour2,minute2,second2;
	//for the total(sum) time
	int hour,minute,second;
 
	//taking the input from user
	cout<<"Enter time:"<<endl;
	cout<<"Hours :"<<"\n"; cin>>hour1;
	cout<<"Minutes :"<<"\n"; cin>>minute1;
	cout<<"Seconds :"<<"\n"; cin>>second1;

	//taking the input from user
	cout<<"Enter time:"<<endl;
	cout<<"Hours :"<<"\n"; cin>>hour2;
	cout<<"Minutes :"<<"\n"; cin>>minute2;
	cout<<"Seconds :"<<"\n"; cin>>second2;

	//adding the entered times
	second=second1+second2;
	minute=minute1+minute2+(second/60);
	hour=hour1+hour2+(minute/60);
	minute=minute%60;
	second=second%60;

	//displaying total time
	cout<<"Time after add: "<<hour<<":"<<minute<<":"<<second;

	return 0;
}