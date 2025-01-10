package dev.project.ContactManagement.services;

import dev.project.ContactManagement.entities.Contact;
import dev.project.ContactManagement.repositories.ContactRepository;
import dev.project.ContactManagement.dao.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServices implements ContactRepository {

    @Autowired
    private ContactDao contactDao;

    @Override
    public List<Contact> getAllContacts() {
        return contactDao.findAll();
    }

    @Override
    public Contact getContactById(Long id) {
        Optional<Contact> contact = contactDao.findById(id);
        return contact.orElse(null);
    }

    @Override
    public Contact addContact(Contact contact) {
        return contactDao.save(contact);
    }

    @Override
    public Contact updateContact(Long id, Contact updatedContact) {
        if (contactDao.existsById(id)) {
            updatedContact.setId(id);
            return contactDao.save(updatedContact);
        }
        return null;
    }

    @Override
    public void deleteContact(Long id) {
        if (contactDao.existsById(id)) {
            contactDao.deleteById(id);
        }
    }
}
