package dev.project.ContactManagement.repositories;

import dev.project.ContactManagement.entities.Contact;
import java.util.List;

public interface ContactRepository {
    List<Contact> getAllContacts();

    Contact getContactById(Long id);

    Contact addContact(Contact contact);

    Contact updateContact(Long id, Contact updatedContact);

    void deleteContact(Long id);
}
