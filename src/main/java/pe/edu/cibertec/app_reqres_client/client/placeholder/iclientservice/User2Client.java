package pe.edu.cibertec.app_reqres_client.client.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.app_reqres_client.client.placeholder.model.User2;

@FeignClient(name = "user2Client", url = "https://reqres.in")
public interface User2Client {

    @PostMapping("/api/users")
    User2 createUser(@RequestBody User2 user);
}
