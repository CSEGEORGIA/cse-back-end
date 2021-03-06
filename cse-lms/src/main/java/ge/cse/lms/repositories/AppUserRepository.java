package ge.cse.lms.repositories;


import ge.cse.lms.models.AppUser;
import ge.cse.lms.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);

    List<AppUser> findAllByRoles(Role role);
}
