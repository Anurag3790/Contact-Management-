package dev.project.ContactManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.project.ContactManagement.entities.Contact;

public interface ContactDao extends JpaRepository<Contact, Long> {
    // Additional custom query methods (if needed) can be added here
}
