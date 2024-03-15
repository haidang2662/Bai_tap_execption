package service;

import entities.Customer;
import entities.GroupCustomer;
import entities.PersonCustomer;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    public void display(Scanner scanner, List<Customer> customers){
        System.out.println("Nhập số lượng khách hàng: ");
        do{
            try{
                int n = Integer.parseInt(scanner.nextLine());
                if(n <= 0){
                    System.out.println("so can nhap vao phai la 1 so nguyen duong khong phai so am vui long nhap lai");
                    continue;
                } else {
                    for (int i = 0; i < n ; i++) {
                        System.out.println("Nhập thông tin cho khách hàng " + (i + 1));
                        System.out.print("Họ và tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Địa chỉ: ");
                        String address = scanner.nextLine();
                        System.out.print("Số điện thoại: ");
                        Integer telephone = Integer.parseInt(scanner.nextLine());
                        System.out.println("Chọn loại khách hàng (1. Cá nhân, 2. Tập thể, 3. Doanh nghiệp): ");
                        int loaiKH = Integer.parseInt(scanner.nextLine());

                        Customer customer = new Customer();
                        switch (loaiKH) {
                            case 1:
                                customer = new PersonCustomer(name, address, telephone);
                                break;
                            case 2:
                                customer = new GroupCustomer(name, address ,telephone);
                                break;
                            case 3:
                                customer = new PersonCustomer(name, address, telephone);
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ");
                                break;
                        }
                        customers.add(customer);
                    }
                    System.out.println(customers);
                }
            } catch (NumberFormatException e){
                System.out.println("So nhap vao bat buoc phai la so nguyen duong khong phai chu hoac so thap phan");
            };


        }
        while (true);


    }
    public Customer findCustomerrById(Scanner scanner,List<Customer> customers,int idCustomer){

        for(Customer customer : customers){
            if(customer.getId() == idCustomer);
            return customer;
        }
            return null;
    }
}
