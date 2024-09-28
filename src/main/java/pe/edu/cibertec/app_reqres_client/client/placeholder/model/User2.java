package pe.edu.cibertec.app_reqres_client.client.placeholder.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class User2 {
    private Long id;
    private String name;
    private String job;
    private String createdAt;
    private String updatedAt;
}
