package edu.icet.crm.controller;

import edu.icet.crm.dto.author.AuthorDto;
import edu.icet.crm.dto.author.AuthorSaveDto;
import edu.icet.crm.dto.author.AuthorUpdateDto;
import edu.icet.crm.dto.user.UserDto;
import edu.icet.crm.dto.user.UserSaveDto;
import edu.icet.crm.dto.user.UserUpdateDto;
import edu.icet.crm.service.AuthorService;
import edu.icet.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String saveUser(@RequestBody UserSaveDto userSaveDto){
        userService.addUser(userSaveDto);
        return "Added success...";

    }
    @GetMapping("/getAllUser")
    public List<UserDto> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserUpdateDto userUpdateDto){

        return userService.updateUser(userUpdateDto);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable(value = "id")int id){

        userService.deleteUser(id);
        return "User deleted";
    }

}
