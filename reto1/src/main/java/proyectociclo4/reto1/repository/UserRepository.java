package proyectociclo4.reto1.repository;

import java.util.List;
import java.util.Optional;

import proyectociclo4.reto1.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {
    
    @Autowired
    private UserCrudRepository userRepo;

    public List<User> getAllUsers(){
        return (List<User>) userRepo.findAll();
    }

    public User saveUser(User userEntity){
        return userRepo.save(userEntity);
    }

    public Optional<User> findEmail(String email){
        return userRepo.findByEmail(email);
    }
    public List<User> findEmailAndPass(String email, String password){
        return userRepo.findByEmailAndPassword(email,password);
    }
}
