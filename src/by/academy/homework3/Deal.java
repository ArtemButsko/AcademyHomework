package by.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Deal {
    private Person seller;
    private Person customer;
    private LocalDate deadlineDate;
    private Product[] products;
    private int idLastProd;
    private boolean completed;

    public Deal(){
        completed = false;
        products = new Product[2];
        idLastProd = 0;
    }

    public Deal(Person customer, Person seller, Product[] products) {
        this.customer = customer;
        this.seller = seller;
        this.products = products;
        this.deadlineDate = LocalDate.now().plusDays(10);

    }
    public void setCustomer(Person customer) {
        this.customer = customer;
    }
    public void setSeller(Person seller) {
        this.seller = seller;
    }
    public void deal(){

        if (completed){
            System.out.println("Deal already completed");
            return;
        }
        if (customer == null ||
                seller == null ||
                customer == seller ){
            System.out.println("Deal can not be completed");

        }
        double finalPrice = 0;
        for (Product product : products) {
            if (product != null)
                finalPrice += product.getPrice();
        }
        if (Double.compare(customer.getMoney(),finalPrice) < 0 ){
            System.out.println("Deal can not be completed. Not enough money");
            return;
        }
        customer.setMoney(customer.getMoney() - finalPrice );
        seller.setMoney(seller.getMoney() +  finalPrice);
        completed = true;
        deadlineDate = LocalDate.now().plusDays(10);
        System.out.println("Congratulation with deal");

    }
    public void printProducts() {
        if (idLastProd == 0){
            System.out.println("products array is empty");
            return;
        }
        for (int i = 0; i < idLastProd; i++) {
            System.out.println("Product[" + (i+1) + "]"+ products[i].toString());
        }
    }

    public void printReceipt(){
        if (!completed) {
            System.out.println("Deal not complete yet");
            return;
        }
        System.out.println("Сделка совершена продавцом : " + seller.getName() + "  и покупателем "+ customer.getName());
        System.out.println("Чек сделки готов");
        System.out.println();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String deadline = deadlineDate.format(formatter);
        System.out.format("Дата:              %s",deadlineDate);
        System.out.println();
        System.out.println("Продукт  |кол-во  |цена    |сума с учетом скидки");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < idLastProd; i++) {
            System.out.format("%-8s |%-8s|%-8s0|%-8s ",products[i].getName(),
                    products[i].getQuantity(),products[i].getPrice(),products[i].getFullPrice());
            System.out.println();

        }

        System.out.println("------------------------------------------------");
    }

        public void addProduct(Product newProduct){
        if (completed){
            return;
        } else {
            if (idLastProd == products.length) {
                Product[] newArray = new Product[products.length * 2 + 1];
                System.arraycopy(products, 0, newArray, 0, products.length);
                products = newArray;
            }
            products[idLastProd] = newProduct;
            idLastProd++;
        }
    }

    public void  deleteProduct(int index) {
        if (completed) {
            return;
        } else {
            if (index >= idLastProd) {
                return;
            }
            products[index] = null;
            for (int i = index; i < idLastProd; i++) {
                products[i] = products[i + 1];
            }
            idLastProd--;
        }
    }

}
