package online.loschachos.orderService.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import online.loschachos.orderService.dto.FoodDTO;
import online.loschachos.orderService.dto.RestaurantDTO;
import online.loschachos.orderService.dto.UserDTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {
	private Long orderId;
	private List<FoodDTO> foodList;
	private RestaurantDTO restaurant;
	private UserDTO userDTO;
}
