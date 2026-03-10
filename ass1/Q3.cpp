#include<iostream>
using namespace std;


class Toll_Booth
{
    int totalvaehicle;
    double totalRevenue;

    public:

       

        void reset()
        {
            this->totalvaehicle=0;
            this->totalRevenue=0;
        }

        void  vehiclePayingToll(int  vehicleType,  double  tollAmount)
        {
            totalvaehicle++;

            if(vehicleType==1)
            {
                totalRevenue+=tollAmount;

            }
            else if(vehicleType==2)
            {
                totalRevenue+=tollAmount;
                
            }
            else if(vehicleType==3)
            {
                totalRevenue+=tollAmount;
            }
        }

        int getTotalVehicles()
        {
            return totalvaehicle;
        }

        double getTotalRevenue()
        {
            return totalRevenue;
        }
};

// int Toll_Booth::totalvaehicle = 0;

int main()
{
    Toll_Booth t1;

    int choice=0;
    while(choice<7)
    {
        cout<<"1.Add a Standard Car and collect toll"<<endl;
        cout<<"2.Add a Standard truck and collect toll"<<endl;
        cout<<"3.Add a Standard bus and collect toll"<<endl;
        cout<<"4.Display Total vehicles passed"<<endl;
        cout<<"5.Display Total Revenue"<<endl;
        cout<<"6.Reset booth statistics "<<endl;
        cout<<"7.EXIT.."<<endl;


        cout<<"ENter choice"<<endl;
        cin>>choice;

        switch(choice)
        {
            case 1:
            {
                t1.vehiclePayingToll(1,180);
                break;
            }
            case 2:
            {
                t1.vehiclePayingToll(2,300);
                break;
            }
            case 3:
            {
                t1.vehiclePayingToll(3,350);
                break;
            }

            case 4:
            {
                cout<<"Total vehicles passed are:"<<t1.getTotalVehicles()<<endl;
                break;
            }
            case 5:
            {
                cout<<"Total Revenue is :"<<t1.getTotalRevenue()<<endl;
                break;
            }

            case 6:
            {
                t1.reset();
            }

            




    }

    return 0;

}
}