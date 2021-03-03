package top.fanfpy.xiaoyuanxianyu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import top.fanfpy.xiaoyuanxianyu.entity.Goods;
import top.fanfpy.xiaoyuanxianyu.entity.GoodsImg;
import top.fanfpy.xiaoyuanxianyu.entity.Order;
import top.fanfpy.xiaoyuanxianyu.entity.User;
import top.fanfpy.xiaoyuanxianyu.repository.GoodsRepository;
import top.fanfpy.xiaoyuanxianyu.repository.OrderReponsitory;
import top.fanfpy.xiaoyuanxianyu.repository.UserRepository;
import top.fanfpy.xiaoyuanxianyu.vo.GoodsInfoVO;
import top.fanfpy.xiaoyuanxianyu.vo.OrderInfoVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class OrderServiceImpl {
    @Autowired
    private OrderReponsitory orderReponsitory;
    @Autowired
    private GoodsRepository goodsReponsitory;
    @Autowired
    private UserRepository userReponsitory;


    public List<Order> listOrder() {
        return orderReponsitory.findAll();
    }

    public void delOrder(Integer id) {
        orderReponsitory.deleteById(id);
    }

    public Order upOrder(Order order) {
        return orderReponsitory.save(order);
    }

    public List<Order> findallOrder() {
        return orderReponsitory.findAll();
    }

    public Optional<Order> findById(Integer id) {
        return orderReponsitory.findById(id);
    }

    public OrderInfoVO GoodsInfo(Integer orderId, Integer imgNum) {
        /**
         * @date 2018/6/6
         * 创建goodsInfo对象 通过商品id获取 goods对象 获取 商品图片
         * 通过goods 获取 用户id 获取用户名 头像
         * 然后一次添加到GoodsInfo
         */
        OrderInfoVO orderInfoVO = new OrderInfoVO();
        List<String> stringList = new ArrayList<>();

        //查询对应的商品
        Goods goods = orderReponsitory.findById(orderId).get();
        //对应的用户
        //Seller user = orderReponsitory.findById(goods.getUserId()).get();

        //对应商品的图片

        List<GoodsImg> goodsImgList = goodsImgRepository.findByGoodsId(goodsId, PageRequest.of(0,3));


        orderInfoVO.setGoodsId(goods.getId());
        orderInfoVO.setUserId(goods.getUserId());
        orderInfoVO.setUserName(user.getUsername());
        orderInfoVO.setUserImg(user.getUserImg());
        orderInfoVO.setGoodsTitle(goods.getName());
        orderInfoVO.setPrice(goods.getPrice());
        orderInfoVO.setPageView(goods.getPageView());
        orderInfoVO.setSented(order.getStatus());
        orderInfoVO.setDescrible(goods.getDescrible());
        orderInfoVO.setUpdateTime(goods.getUpdateTime());
        orderInfoVO.setGoodsImgList(stringList);

        return orderInfoVO;
    }
}

