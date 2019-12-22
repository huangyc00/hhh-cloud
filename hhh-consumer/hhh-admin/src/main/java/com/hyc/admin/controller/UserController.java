package com.hyc.admin.controller;

import com.hyc.order.api.service.OrderService;
import com.hyc.product.api.service.ProductService;
import com.hyc.user.api.service.UserService;
import com.order.model.entity.Order;
import com.product.model.entity.Product;
import com.member.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable("id")String id){
        User user = userService.findById(id);
        Product product = productService.findById("ssss");
        Order order = orderService.findById("ordereee");
        user.setProductId(product.getId());
        user.setOrderId(order.getId());
        return user;
    }

    @PostMapping(value = "/test1")
    public String test1(){
        return "test1";
    }


    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbon")
    public String ribbon(){
        return restTemplate.getForObject("hhh-provider-user/ribbon",String.class);
    }

}
