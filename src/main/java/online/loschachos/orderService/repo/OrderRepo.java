package online.loschachos.orderService.repo;

import org.springframework.stereotype.Repository;
import online.loschachos.orderService.entity.Order;


import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface OrderRepo extends MongoRepository <Order, Long>{
    
}
