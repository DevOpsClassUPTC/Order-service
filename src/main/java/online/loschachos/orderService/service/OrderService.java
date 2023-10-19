package online.loschachos.orderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import online.loschachos.orderService.dto.OrderDTO;
import online.loschachos.orderService.dto.OrderDTOFromFE;
import online.loschachos.orderService.dto.UserDTO;
import online.loschachos.orderService.entity.Order;
import online.loschachos.orderService.mapper.OrderMapper;
import online.loschachos.orderService.repo.OrderRepo;

@Service
public class OrderService {
	@Autowired
	OrderRepo orderRepo;
	@Autowired
	SequenceGenerator sequenceGenerator;	
	@Autowired
	RestTemplate restTemplate;
	
	public OrderDTO saveOrderInDB(OrderDTOFromFE ordenDetails) {
		Long newOrderId = sequenceGenerator.generateNextOrderId();
		UserDTO dto = fetchUserDetailsFromUserId(ordenDetails.getUserId());
		Order orderToSaved = new Order(newOrderId, ordenDetails.getFoodList(), ordenDetails.getRestaurant(), dto);
		orderRepo.save(orderToSaved);
		return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToSaved);
	}
	
	private UserDTO fetchUserDetailsFromUserId(Long userId) {
		return restTemplate.getForObject("http://USER-SERVICE/user/fetchById/"+userId, UserDTO.class);
	}
}
