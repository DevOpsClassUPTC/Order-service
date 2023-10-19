package online.loschachos.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import online.loschachos.orderService.dto.OrderDTO;
import online.loschachos.orderService.dto.OrderDTOFromFE;
import online.loschachos.orderService.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDetails) {
        OrderDTO orderSaveInDB = orderService.saveOrderInDB(orderDetails);
        return new ResponseEntity<>(orderSaveInDB, HttpStatus.CREATED);
    }
}
