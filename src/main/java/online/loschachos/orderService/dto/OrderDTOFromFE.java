package online.loschachos.orderService.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {
	private List<FoodDTO> foodList;
	private Long userId;
	private RestaurantDTO restaurant;
}
