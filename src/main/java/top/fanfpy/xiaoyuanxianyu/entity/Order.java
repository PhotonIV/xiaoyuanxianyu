package top.fanfpy.xiaoyuanxianyu.entity;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Random;

/**
 * @author Photon
 * @date 2020/4
 * Order实体类
 * */
@Data
@Entity(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer goodsId;

    private String goodsName;

    @NotNull(message = "卖家不能为空")
    private String sellerId;

    @NotNull(message = "买家不能为空")
    private String buyerId;

    @NotNull(message = "买家电话号码不能为空")
    private String tel;

    @NotNull(message = "买家收货地址不能为空")
    private String addr;

    private BigDecimal price;

    @NotNull(message = "是否上架默认为0，1为交易中，2为交易成功")
    private Byte sented = 0;

    private String updateTime;

    public Integer getId() {
        new Random().nextInt();
        return id;
    }




}
