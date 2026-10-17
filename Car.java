 class Car extends Vehicle
{   String brand;
    double rent;
    Car(String brand,double rent)
    {
       this.brand=brand;
       this.rent=rent;
    }


   void displayDetails()
   {
      System.out.println("Brand= "+brand);
      System.out.println("Rent per day= "+rent);
   }
}
