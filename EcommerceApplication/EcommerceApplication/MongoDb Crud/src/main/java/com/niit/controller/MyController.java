package com.niit.controller;

import com.niit.domain.Automobile;
import com.niit.domain.Cart;
import com.niit.repository.AutomobileRepository;
import com.niit.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mongo")
public class MyController {

    @Autowired
    private AutomobileRepository automobileRepository;

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping("/addauto")
    public ResponseEntity<?> addauto(@RequestBody Automobile automobile)
    {
        Automobile save = this.automobileRepository.save(automobile);
        return new ResponseEntity<>("Product added to DATABASE",HttpStatus.OK);
    }
    @PostMapping("/addtocart")
    public ResponseEntity<?> addcart(@RequestBody Cart cart)
    {
        Cart save =this.cartRepository.save(cart);
        return new ResponseEntity<>("Item added to your cart",HttpStatus.OK);
    }
    @GetMapping("/mycart/{username}")
    public List<Cart> mycart(@PathVariable String username)
    {
        //String name = user.getUsername();
        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(username));
        List<Cart> cart=mongoTemplate.find(query,Cart.class);
        return cart;
    }
    @GetMapping("/getauto")
    public List<Automobile> getall()
    {
        List<Automobile> automobileList=this.automobileRepository.findAll();
        return automobileList;
    }
    @DeleteMapping("/deleteauto/{id}")
    public List<Automobile> deletebyId(@PathVariable int id)
    {
        this.automobileRepository.deleteById(id);
        return this.automobileRepository.findAll();
    }

}
