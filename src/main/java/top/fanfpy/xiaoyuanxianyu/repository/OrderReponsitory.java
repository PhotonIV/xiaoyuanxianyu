package top.fanfpy.xiaoyuanxianyu.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import top.fanfpy.xiaoyuanxianyu.entity.Goods;
import top.fanfpy.xiaoyuanxianyu.entity.Order;

import java.util.List;

public interface OrderReponsitory extends JpaRepository<Order,Integer>{

//    List<Order> findByOrderId(Integer orderId);



}
