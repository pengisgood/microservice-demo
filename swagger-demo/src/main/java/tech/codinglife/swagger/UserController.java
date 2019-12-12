package tech.codinglife.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @ApiOperation(value = "用户列表")
    @GetMapping
    public List<User> getUsers() {
        return null;
    }

    @ApiOperation(value = "用户信息")
    @GetMapping("{id}")
    public User getUser(@PathVariable String id) {
        return null;
    }

    @ApiOperation(value = "创建用户")
    @PostMapping
    public void createUser(@RequestBody User user) {

    }

    @ApiOperation(value = "编辑用户")
    @PutMapping("{id}")
    public User editUser(@RequestBody User user) {
        return null;
    }

    @ApiOperation(value = "修改用户性别")
    @PatchMapping("{id}")
    public User editUserGender(@PathVariable String id, @RequestParam Gender gender) {
        return null;
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("{id}")
    public User deleteUser(@PathVariable String id) {
        return null;
    }

}
