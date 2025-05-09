package az.edu.itbrains.ecommerce.repositories;

import az.edu.itbrains.ecommerce.models.Role;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Log> {
}
