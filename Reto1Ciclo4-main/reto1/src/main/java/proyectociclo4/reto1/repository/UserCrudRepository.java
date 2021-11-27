package proyectociclo4.reto1.repository;

import java.util.List;
import java.util.Optional;

import proyectociclo4.reto1.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User,Long>{
    
    public Optional<User> findByEmail(String email);

    public List<User> findByEmailAndPassword(String email,String password);
    
}
