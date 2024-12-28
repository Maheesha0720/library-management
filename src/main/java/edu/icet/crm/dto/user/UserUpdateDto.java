package edu.icet.crm.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserUpdateDto {
    private int userId;
    private String name;
    private String email;
}
