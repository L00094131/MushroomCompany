package mushroom.spring.dao;

import java.util.List;

import mushroom.spring.model.Contact;

public interface ContactDAO {
    public void saveContact(Contact contact);
    
    public void deleteContact(int customer_Id);
     
    public Contact getContact(int customer_Id);
     
    public List<Contact> listContact();
}
