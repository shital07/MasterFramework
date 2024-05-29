package entity.pojo;


import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddUser {


    private String UserRole;
    private String Status;
    private String EmpName;
    private String userName;

    private String password;
    private String confirmPassword;


}
