package top.fanfpy.xiaoyuanxianyu.service;
import top.fanfpy.xiaoyuanxianyu.entity.Goods;
import top.fanfpy.xiaoyuanxianyu.vo.OrderVO;
import top.fanfpy.xiaoyuanxianyu.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
/**
 * @author Photon
 * */
public interface OrderService {


    /**
     * 查询所有订单
     * @return 返回集合
     * */
    List<Order> listOrder();

    /**
     * 通过id查商品
     * */
    Optional<Order> findById(Integer id);




}
