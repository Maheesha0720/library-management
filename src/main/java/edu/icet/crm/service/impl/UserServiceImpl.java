package edu.icet.crm.service.impl;

import edu.icet.crm.dto.user.UserDto;
import edu.icet.crm.dto.user.UserSaveDto;
import edu.icet.crm.dto.user.UserUpdateDto;
import edu.icet.crm.entity.User;
import edu.icet.crm.repository.UserRepo;
import edu.icet.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public String addUser(UserSaveDto userSaveDto) {
        userRepo.save(new User(
                userSaveDto.getName(),
                userSaveDto.getEmail()
        ));
        return userSaveDto.getName();
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users= userRepo.findAll();
        List<UserDto> userDtoList =new ArrayList<>();

        for (User user:users){
            userDtoList.add(new UserDto(
                    user.getUserId(),
                    user.getName(),
                    user.getEmail()
            ));
        }
        return userDtoList;
    }

    @Override
    public String updateUser(UserUpdateDto userUpdateDto) {
        if (userRepo.existsById(userUpdateDto.getUserId())) {

            User user = userRepo.getById(userUpdateDto.getUserId());
            user.setName(userUpdateDto.getName());
            user.setEmail(userUpdateDto.getEmail());
            userRepo.save(user);
            return user.getName();
        }else {
            System.out.println("User ID not exist...!!");
        }
        return null;
    }

    @Override
    public String deleteUser(int id) {
        if (userRepo.existsById(id)){
            userRepo.deleteById(id);
        }else{
            System.out.println("record not found..");
        }
        return null;
    }
}
