package pe.edu.cibertec.app_reqres_client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.app_reqres_client.client.placeholder.model.User2;
import pe.edu.cibertec.app_reqres_client.service.User2Service;

@RestController
@RequiredArgsConstructor
public class User2Controller {
    private final User2Service user2Service;

    @PostMapping("/user/create")
    public User2 createUser(@RequestBody User2 user) {
        return user2Service.createUser(user);
    }

    @PutMapping("/user/actu/{id}")
    public User2 actuUser(@RequestBody User2 user2, @PathVariable("id") Long id){
        return user2Service.actuUser(user2, id);
    }
}
