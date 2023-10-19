package online.loschachos.orderService.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import online.loschachos.orderService.dto.OrderDTO;
import online.loschachos.orderService.entity.Order;

@Mapper
public interface OrderMapper {
	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
	
	Order mapOrderDTOToOrder(OrderDTO orderDTO);
	OrderDTO mapOrderToOrderDTO(Order order);
}
