#include<iostream>
using namespace std;

int main()
{
    int num = 10;

    int *ptr = &num;   // pointer
    int &ref = num;    // reference

    cout<<"Initial value: "<<num<<endl;

    *ptr = 20;
    cout<<"After modifying using pointer: "<<num<<endl;

    ref = 30;
    cout<<"After modifying using reference: "<<num<<endl;

    return 0;
}

// Two differences between pointer and reference
// Pointer:
// 1.Stores the address of a variable
// 2.Can be NULL

// Reference:
// 1.Works as an alias (another name for the same variable)
// 2.Cannot be NULL

// Why references cannot be reseated
// Once a reference is attached to a variable, it cannot refer to another variable later.
// Example:
// int a = 5;
// int b = 10;

// int &r = a;
// r = b;
// Here r still refers to a. Only the value of a changes.

// Why references cannot be NULL
// A reference must always refer to an existing variable.
// Since NULL means no variable, a reference cannot be NULL.
