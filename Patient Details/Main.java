#include<iostream>
using namespace std;
class Patient    
{
        char patient_name[100];
        int bed;
        int ward;
        char doctor_name[100];
        char doctor_degree[100];
		int due;
  public:
                void accept_patient_details()
                {
                        cout<<"Enter Data"<<"\n";
                        cout<<"Enter Patient Name : "<<"\n";
                        cin>>patient_name;
                        cout<<"Enter Bed Number : "<<"\n";
                        cin>>bed;
                        cout<<"Enter Ward Name : "<<"\n";
                        cin>>ward;
                  		cout<<"Enter the Doctor Name : "<<"\n";
                  		cin>>doctor_name;
                  		cout<<"Enter Doctorate Degree : "<<"\n";
                  		cin>>doctor_degree;
                  		cout<<"Enter Dues of Patient : "<<"\n";
                  		cin>>due;
                }
                void display_patient_details()
                {
                        cout<<"Inserted Data"<<"\n";
                        cout<<"Patient Name : "<<patient_name<<"\n";
                        cout<<"Bed Number : "<<bed<<"\n";
                        cout<<"Ward Name : "<<ward<<"\n";
                        cout<<"Doctor Name : "<<doctor_name<<"\n";
                        cout<<"Doctorate Degree : "<<doctor_degree<<"\n";
                        cout<<"Total Dues of Patient : "<<due<<"\n";

                  		
                }
};
      
int main()
{
        Patient pat;
     
    pat.accept_patient_details();
    pat.display_patient_details();
     
    return 0;
}