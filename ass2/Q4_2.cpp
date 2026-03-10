#include<iostream>
#include<stdlib.h>
using namespace std;

int main()
{
    int *arr;

    arr = (int*) malloc(5 * sizeof(int));

    cout<<"Enter 5 numbers:"<<endl;

    for(int i=0;i<5;i++)
        cin>>arr[i];

    cout<<"Values are:"<<endl;

    for(int i=0;i<5;i++)
        cout<<arr[i]<<" ";

    free(arr);

    return 0;
}


// Why constructors are not called when using malloc
// malloc only allocates memory.
// It does not create objects, so constructors are not called.

// Why new is preferred in C++
// It calls constructors automatically
// It is type safe
// No type casting is required

// Difference in return types
// malloc returns a void* pointer.
// new returns a pointer of the required data type.

// Why malloc cannot initialize complex types
// malloc does not understand classes or objects.
// It only allocates raw memory.