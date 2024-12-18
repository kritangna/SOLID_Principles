public class SupplyOrder {

    private int orderId;
    public SupplyOrder()
    {

    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int id)
    {
        orderId = id;
    }

    public void supplyOrder()
    {
        System.out.println("Supplying order with id: " + orderId);
    }
}
