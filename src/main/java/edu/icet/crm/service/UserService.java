package edu.icet.crm.service;

import edu.icet.crm.dto.user.UserDto;
import edu.icet.crm.dto.user.UserSaveDto;
import edu.icet.crm.dto.user.UserUpdateDto;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDto userSaveDto);

    List<UserDto> getAllUser();

    String updateUser(UserUpdateDto userUpdateDto);

    String deleteUser(int id);
}
