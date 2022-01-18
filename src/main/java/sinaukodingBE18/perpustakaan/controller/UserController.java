package sinaukodingBE18.perpustakaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sinaukodingBE18.perpustakaan.service.UserService;

@RestController
@RequestMapping("users")
public class UserController extends BaseController{

  @Autowired
    private UserService service;

}
