#include<iostream>
using namespace std;

class BankAccount{

    const int AccountNumber;
    string accountHolderName;
    double balance;

public:
    
    BankAccount(int AccountNumber,string accountHolderName,double balance):AccountNumber(AccountNumber),accountHolderName(accountHolderName),balance(balance)
    {
        
    }

    void  DepositMoney(double a)
    {
        balance=balance+a;
    }

    void withdraw(int amt)
    {
        if(amt>balance)
        {
            cout<<"Not having sufficient balance to withdarw money lol.."<<endl;
        }
        else
        {
            balance=balance-amt;
            cout<<"Withdrawl is successfull.."<<endl;
        }
        

    }

    void displayAccountDetails()
    {
        cout<<"Account number: "<<AccountNumber<<endl;
        cout<<"Acount holder name:"<<accountHolderName<<endl;
        cout<<"Avl Balance:"<<balance<<endl;


    }

};

int main()
{

    // Initializing values
    int AccountNumber;
    string name;
    double balance;

    cout<<"Enter account number"<<endl;
    cin>>AccountNumber;

    cout<<"Enter Name"<<endl;
    cin>>name;

    cout<<"Enter balance"<<endl;
    cin>>balance;

    BankAccount B1(AccountNumber,name,balance);

    int choice=0;
  

    while(choice<4)
    {
        
        cout<<"1.Deposite money"<<endl;
        cout<<"2.Withdraw Money"<<endl;
        cout<<"3.Disply details"<<endl;
        cout<<"4.Exit"<<endl;

        cout<<"Enter your choice"<<endl;
        cin>>choice;

        switch(choice)
        {
            case 1:
            {
                int Amount;
                cout<<"Enter amount for Deposit.."<<endl;
                cin>>Amount;
                B1.DepositMoney(Amount);
                break;

            }

            case 2:
            {
                double amt;
                cout<<"ENter amount of Withdrwl:"<<endl;
                cin>>amt;
                B1.withdraw(amt);
                break;


            }
            case 3:
            {
                B1.displayAccountDetails();
            }


        }
    }
    return 0;
}