#include<iostream>
using namespace std;

class Employee
{
    const int employeeId;
    string name;
    float salary;

public:

    Employee(int id, string n, float s) : employeeId(id), name(n), salary(s)
    {
    }

    void display()
    {
        cout<<"Employee ID: "<<employeeId<<endl;
        cout<<"Name: "<<name<<endl;
        cout<<"Salary: "<<salary<<endl;
    }
};

int main()
{
    Employee e1(101,"Shruti",50000);

    e1.display();

    return 0;
}

// Why must const members be initialized in initializer list?
// Const variables must get their value at the time of creation.
// They cannot be assigned later inside the constructor body.

// What happens if you try to assign the value of a const member inside constructor body?
// It will give a compile-time error because const variables cannot be modified after initialization.

// Why is initializer list faster than assignment?
// Initializer list directly initializes the variable when the object is created.
// Assignment first creates the variable and then changes its value, which takes an extra step.