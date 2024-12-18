public class CustomerService {

    private int customerId;

    public CustomerService()
    {

    }

    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(int id)
    {
        customerId = id;
    }

    public void attendCustomer()
    {
        System.out.println("Attending customer with customer id: " + customerId);
    }
}
