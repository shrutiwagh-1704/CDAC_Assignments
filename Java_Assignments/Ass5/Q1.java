class Electronics{
    String productName;
    int productID;
    double Price;

    Electronics(String p,int PID,double price)
    {
        this.productName=p;
        this.productID=PID;
        this.Price=price;

    }

    public String toString()
    {
        return "ProductName: "+productName+"\nProductID: "+productID+"\nPrice: "+Price;
    }
}

class Cloths{
    String productName;
    int productID;
    double Price;

    Cloths(String p,int PID,double price)
    {
        this.productName=p;
        this.productID=PID;
        this.Price=price;

    }

    public String toString()
    {
        return "ProductName: "+productName+"\nProductID: "+productID+"\nPrice: "+Price;
    }
}


class Inventry <T>
{
    T product;

    // Inventry (T product)
    // {
    //     this.product=product;
    // }

    void AddProduct(T product)
    {
        this.product=product;
    }

    T getproduct()
    {
        return product;

    }
}

public class Q1
{
    public static void main(String[] args) {
        Electronics e1=new Electronics("Samsung phone M12",11 ,12000 );
        Inventry<Electronics> p1=new Inventry<>();
        p1.AddProduct(e1);
        Electronics e= p1.getproduct();
        System.out.println(e);

        Cloths c1=new Cloths("widelegJeans",15,600);
        Inventry<Cloths> p2= new Inventry<>();
        p2.AddProduct(c1);
        Cloths c=p2.getproduct();
        System.out.println(c);
    }
}