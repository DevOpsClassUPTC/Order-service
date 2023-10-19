package online.loschachos.orderService.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
	private Long orderId;
	private List<FoodDTO> foodList;
	private RestaurantDTO restaurant;
	private UserDTO userDTO;
}
