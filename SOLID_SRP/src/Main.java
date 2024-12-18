public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BreadBaker baker = new BreadBaker();

        SupplyOrder order = new SupplyOrder();

        CustomerService customerService = new CustomerService();

        InventoryManagement management = new InventoryManagement();

        BakeryCleaning cleaning = new BakeryCleaning();

        baker.setName("Theobroma");
        baker.bakeBread();

        order.setOrderId(101);
        order.supplyOrder();

        customerService.setCustomerId(10001);
        customerService.attendCustomer();

        management.manageInventory();

        cleaning.cleanBakery();
    }
}
