//package com.remets.miniOnlineMarket.controller;
//
//import com.remets.miniOnlineMarket.domain.Buyer;
//import com.remets.miniOnlineMarket.service.BuyerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping
//public class BuyerController {
//    @Autowired
//    BuyerService buyerService;
//
//    @GetMapping("/buyers")
//    public List<Buyer> getAll(){
//        return buyerService.getAll();
//    }
//
//    @GetMapping("/buyers/{id}")
//    public Optional<Buyer> getById(@PathVariable Long id) {
//        return buyerService.getById(id);
//    }
//
//    @DeleteMapping("/buyers/{id}")
//    public void deleteById(@PathVariable Long id) {
//        buyerService.deleteById(id);
//    }
//
//    @PostMapping("/buyer")
//    public void addBuyer(@RequestBody Buyer buyer) {
//        buyerService.addBuyer(buyer);
//
//    }
//
////    public void follow(){
////
////    }
////    public void review(){
////
////    }
////    public void placeOrder(){
////
////    }
////    public void makePayment(){
////
////    }
////    public void crudCart(){
////
////    }
////    public void maintainsAddress(){
////
////    }
////    public void calculatePoint(){
////
////    }
////    public void checkOrderHistory(){
////
////    }
////    public void cancelOrder(){
////
////    }
////    public void operations(){
////
////    }
//
//
//}
