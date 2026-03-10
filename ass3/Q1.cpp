#include<iostream>
using namespace std;

class Employee
{
    int id;
    string name;
    mutable int accessCount;

public:

    Employee(int i,string n)
    {
        id=i;
        name=n;
        accessCount=0;
    }

    // Copy constructor
    Employee(const Employee &e)
    {
        id=e.id;
        name=e.name;
        accessCount=e.accessCount;
    }

    void display() const
    {
        accessCount++;
        cout<<"ID: "<<id<<" Name: "<<name<<" Access Count: "<<accessCount<<endl;
    }
};

int main()
{
    Employee e1(101,"Shruti");

    e1.display();
    e1.display();

    Employee e2=e1;

    cout<<"Copied object:"<<endl;
    e2.display();
}

// Why display() must be const

// Because it should not modify object data (except mutable variables).

// Why accessCount is mutable

// Because even inside a const function we want to change accessCount.