#include<iostream>
#include <vector>
using namespace std;


class Employee
{
    int empID;
    string empName;
    double empSalary;
    static int nextID;

public:
    void AddDetail(vector<Employee>&emp_ref)
    {
        
        Employee e1;
        e1.empID=nextID;
        nextID++;
        cout<<"ENter the name of employee "<<endl;
        cin>>e1.empName;
        cout<<"Enter the salary of employee number"<<endl; 
        cin>>e1.empSalary;

        emp_ref.push_back(e1);


        
    }

    double cal_gross_salary(vector<Employee>&emp_reff,int empId)
    {
        int index=-1;
        for(int i=0;i<emp_reff.size();i++)
        {
            
            if(emp_reff[i].empID==empId)
            {
                index=i;
                break;
            }
        }

        if(index==-1)
        {
            cout<<"Employee NOT found..."<<endl;
            return -1;
        }
        else
        {
            double salary=emp_reff[index].empSalary;
            double GrossSalary=0;
            if(salary<=5000)
            {
                GrossSalary=salary+(0.10 * salary);
                return GrossSalary;
            }
            else if(salary>5000 && salary<=10000)
            {
                GrossSalary=salary +(0.15 * salary);
                return GrossSalary;

            }
            else if(salary>10000)
            {
                GrossSalary=salary + (0.20 * salary);
                // cout<<GrossSalary<<endl;
                return GrossSalary;
            }


        }
            
        
        // return 0;
    }

    void displaydetail(vector<Employee>&emp_ref,int empId)
    {
        int index=-1;
        for(int i=0;i<emp_ref.size();i++)
        {
           
            if(emp_ref[i].empID==empId)
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            cout<<"Employee NOT found..."<<endl;
            
        }

        else{
            
            cout<<"Emplloyee ID is "<<empId<<endl;
            cout<<"Name is: "<<emp_ref[index].empName<<endl;
            cout<<"Salary is : "<<emp_ref[index].empSalary<<endl;
            int result =cal_gross_salary(emp_ref,empId);
            if(result>0)
            {
                cout<<"Gross salary is :"<<result<<endl;
            }
            else
            {
                cout<<"NULL";
            }
            

        }

        
    }

    void update_Info(vector<Employee>&emp_ref,int empId)
    {
        int index=-1;
        for(int i=0;i<emp_ref.size();i++)
        {
            if(emp_ref[i].empID==empId)
            {
                index=i;
                break;
            }
        }

        if(index==-1)
            {
                cout<<"Employee NOT found..."<<endl;
                return;
            }
        else
        {
            cout<<"Enter the New Name: "<<endl;
            cin>>emp_ref[index].empName;

            cout<<"ENter the new salary"<<endl;
            cin>>emp_ref[index].empSalary;

        }

        

    }



};

int Employee::nextID = 1;

int main()
{
    
    vector<Employee>emp;
    Employee e;
    // e.GetDetails(emp);

    int choice=0;
    while(choice<5)
    {
        cout<<"1.Add a employee"<<endl;
        cout<<"2.Display Details"<<endl;
        cout<<"3.Get Gross Salary"<<endl;
        cout<<"4.Update Detail.."<<endl;

        cin>>choice;

        switch(choice)
        {
            case 1:
                e.AddDetail(emp);
                break;

            case 2:
            {
                int ID;
                cout<<"Enter your empID"<<endl;
                cin>>ID;
                e.displaydetail(emp,ID);
                break;
            }

            case 3:
            {
                int ID;
                cout<<"Enter your empID"<<endl;
                cin>>ID;
                int result=e.cal_gross_salary(emp,ID);
                if(result>0)
                {
                    cout<<result<<endl;
                }
                else
                {
                    cout<<"NULL";
                }
                
                break;
            }

            case 4:
            {
                int ID;
                cout<<"Enter your empID"<<endl;
                cin>>ID;
                e.update_Info(emp,ID);
                break;
            }
                
        }
    }

    return 0;
}