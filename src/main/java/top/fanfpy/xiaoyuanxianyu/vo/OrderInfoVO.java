package top.fanfpy.xiaoyuanxianyu.vo;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
/**
 * @author Photon
 * @date 2020/4/08
 * */
public class OrderInfoVO {
    private Integer orderId;

    private Integer goodsId;
    private Integer goodsNmae;

    private String sellerId;

    private String buyerId;

    private String tel;

    private String addr;

    private BigDecimal price;

    private Byte sented = 0;

    @JsonProperty("date")
    private String updateTime;

   // List<String> goodsimglist;


    public Integer getId() {
        return orderId;
    }

    public void setId(Integer id) {
        this.orderId = id;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getSented() {
        return sented;
    }

    public void setSented(Byte sented) {
        this.sented = sented;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    public Integer getGoodsId() {
        return goodsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNmae() {
        return goodsNmae;
    }

    public void setGoodsNmae(Integer goodsNmae) {
        this.goodsNmae = goodsNmae;
    }

    @Override
    public String toString() {
        return "OrderInfoVO{" +
                "orderId=" +  orderId+
                "goodsId=" + goodsId +
                "goodsNmae=" + goodsNmae +
                ", sellerId=" + sellerId +'\'' +
                ", buyerId='" + buyerId + '\'' +
                ", tel=" + tel +'\'' +
                ", addr=" + addr +'\'' +
                ", price=" + price +
                ", updateTime='" + updateTime + '\'' +
                ", sented=" + sented +
                '}';


    }
}

