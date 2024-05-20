public class OrderFacade {
    Payment payment;
    Notification notification;
    ProductDao productDao;
    Invoice invoice;

    OrderFacade() {
        payment = new Payment();
        notification = new Notification();
        productDao = new ProductDao();
        invoice = new Invoice();
    }

    public void orderProduct() {
        productDao.getProduct();
        payment.doPayment();
        invoice.generateInvoice();
        notification.sendNotification();
    }
}
