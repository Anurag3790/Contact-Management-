package dev.project.ContactManagement.controllers;

import dev.project.ContactManagement.entities.Contact;
import dev.project.ContactManagement.services.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactServices contactServices;

    @GetMapping("/getAllContacts")
    public ResponseEntity<List<Contact>> getContacts() {
        List<Contact> contacts = contactServices.getAllContacts();
        return ResponseEntity.ok(contacts);
    }

    @GetMapping("/getSingleContact/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Long id) {
        Contact contact = contactServices.getContactById(id);
        if (contact != null) {
            return ResponseEntity.ok(contact);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/addContact")
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact) {
        Contact savedContact = contactServices.addContact(contact);
        return ResponseEntity.ok(savedContact);
    }

    @PutMapping("/updateContact/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable Long id, @RequestBody Contact updatedContact) {
        Contact contact = contactServices.updateContact(id, updatedContact);
        if (contact != null) {
            return ResponseEntity.ok(contact);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deleteContact/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        contactServices.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}
