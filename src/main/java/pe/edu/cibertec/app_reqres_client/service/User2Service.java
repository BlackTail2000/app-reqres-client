package pe.edu.cibertec.app_reqres_client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_reqres_client.client.placeholder.iclientservice.User2Client;
import pe.edu.cibertec.app_reqres_client.client.placeholder.model.User2;

@Service
@RequiredArgsConstructor
public class User2Service {
    private final User2Client user2Client;

    public User2 createUser(User2 user) {
        return user2Client.createUser(user);
    }

    public User2 actuUser(User2 user2,Long id){
        return user2Client.actuUser(user2,id);
    }
}
