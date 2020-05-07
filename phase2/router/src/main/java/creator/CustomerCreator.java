/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creator;

import domain.Customer;

/**
 *
 * @author admin
 */
public class CustomerCreator {
    public Customer createCustomer(String username, String firstName, String lastName, String email){
        Customer cust = new Customer();
        cust.setCustomerCode(username);
        cust.setFirstName(firstName);
        cust.setLastName(lastName);
        cust.setEmail(email);
        cust.setGroup("0afa8de1-147c-11e8-edec-2b197906d816");
        return cust;
    }
}
