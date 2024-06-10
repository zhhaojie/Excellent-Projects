package com.meituan.sdk.model.ad.report.dailyLaunchReportOffline;

import com.google.gson.annotations.SerializedName;

/**
* 对象列表
* This file was automatically generated.
*/
public class LaunchInfo {
    /**
    * 天数
    */
    @SerializedName("date")
    private String date;
    /**
    * 推广id
    */
    @SerializedName("launch_id")
    private Integer launchId;
    /**
    * 推广名称
    */
    @SerializedName("launch_name")
    private String launchName;
    /**
    * 门店名称
    */
    @SerializedName("shop_name")
    private String shopName;
    /**
    * 花费
    */
    @SerializedName("charge")
    private Double charge;
    /**
    * 曝光
    */
    @SerializedName("imp")
    private Integer imp;
    /**
    * 点击
    */
    @SerializedName("click")
    private Integer click;
    /**
    * 商户浏览量
    */
    @SerializedName("pv")
    private Integer pv;
    /**
    * 感兴趣
    */
    @SerializedName("interest_action")
    private Integer interestAction;
    /**
    * 图片点击
    */
    @SerializedName("view_photo")
    private Integer viewPhoto;
    /**
    * 评论点击
    */
    @SerializedName("view_review")
    private Integer viewReview;
    /**
    * 优惠促销点击
    */
    @SerializedName("view_yh")
    private Integer viewYh;
    /**
    * 团购点击
    */
    @SerializedName("view_tg")
    private Integer viewTg;
    /**
    * 地址点击
    */
    @SerializedName("view_address")
    private Integer viewAddress;
    /**
    * 预付商品点击
    */
    @SerializedName("view_yf")
    private Integer viewYf;
    /**
    * 分享
    */
    @SerializedName("share")
    private Integer share;
    /**
    * 收藏
    */
    @SerializedName("add_favor")
    private Integer addFavor;
    /**
    * 预约及意向
    */
    @SerializedName("yyyx_action")
    private Integer yyyxAction;
    /**
    * 电话点击
    */
    @SerializedName("call")
    private Integer call;
    /**
    * 在线咨询点击
    */
    @SerializedName("chat")
    private Integer chat;
    /**
    * 预约量
    */
    @SerializedName("yy_order")
    private Integer yyOrder;
    /**
    * 优惠促销领取
    */
    @SerializedName("order_promo")
    private Integer orderPromo;
    /**
    * 团购订单量
    */
    @SerializedName("order_tg")
    private Integer orderTg;
    /**
    * 智能支付订单量
    */
    @SerializedName("offline_cnt")
    private Integer offlineCnt;
    /**
    * 预付商品订单量
    */
    @SerializedName("yf_cnt")
    private Integer yfCnt;
    /**
    * 闪惠买单量
    */
    @SerializedName("order_sh")
    private Integer orderSh;
    /**
    * 订单量
    */
    @SerializedName("pay_cnt")
    private Integer payCnt;
    /**
    * 优惠预订订单量
    */
    @SerializedName("reserve_cnt")
    private Integer reserveCnt;
    /**
    * 技师点击
    */
    @SerializedName("view_stylist")
    private Integer viewStylist;
    /**
    * 商家会员卡点击量
    */
    @SerializedName("click_card")
    private Integer clickCard;
    /**
    * 签到
    */
    @SerializedName("add_checkin")
    private Integer addCheckin;
    /**
    * 商家会员卡购买量
    */
    @SerializedName("card_cnt")
    private Integer cardCnt;
    /**
    * 店铺信息点击
    */
    @SerializedName("view_info")
    private Integer viewInfo;
    /**
    * 款式点击
    */
    @SerializedName("view_style")
    private Integer viewStyle;
    /**
    * 意向客流
    */
    @SerializedName("yx_action")
    private Integer yxAction;
    /**
    * 款式一口价订单量
    */
    @SerializedName("order_kuanshi")
    private Integer orderKuanshi;
    /**
    * 扫码支付订单
    */
    @SerializedName("scanpay_cnt")
    private Integer scanpayCnt;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Integer getLaunchId() {
        return launchId;
    }
    public void setLaunchId(Integer launchId) {
        this.launchId = launchId;
    }
    public String getLaunchName() {
        return launchName;
    }
    public void setLaunchName(String launchName) {
        this.launchName = launchName;
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public Double getCharge() {
        return charge;
    }
    public void setCharge(Double charge) {
        this.charge = charge;
    }
    public Integer getImp() {
        return imp;
    }
    public void setImp(Integer imp) {
        this.imp = imp;
    }
    public Integer getClick() {
        return click;
    }
    public void setClick(Integer click) {
        this.click = click;
    }
    public Integer getPv() {
        return pv;
    }
    public void setPv(Integer pv) {
        this.pv = pv;
    }
    public Integer getInterestAction() {
        return interestAction;
    }
    public void setInterestAction(Integer interestAction) {
        this.interestAction = interestAction;
    }
    public Integer getViewPhoto() {
        return viewPhoto;
    }
    public void setViewPhoto(Integer viewPhoto) {
        this.viewPhoto = viewPhoto;
    }
    public Integer getViewReview() {
        return viewReview;
    }
    public void setViewReview(Integer viewReview) {
        this.viewReview = viewReview;
    }
    public Integer getViewYh() {
        return viewYh;
    }
    public void setViewYh(Integer viewYh) {
        this.viewYh = viewYh;
    }
    public Integer getViewTg() {
        return viewTg;
    }
    public void setViewTg(Integer viewTg) {
        this.viewTg = viewTg;
    }
    public Integer getViewAddress() {
        return viewAddress;
    }
    public void setViewAddress(Integer viewAddress) {
        this.viewAddress = viewAddress;
    }
    public Integer getViewYf() {
        return viewYf;
    }
    public void setViewYf(Integer viewYf) {
        this.viewYf = viewYf;
    }
    public Integer getShare() {
        return share;
    }
    public void setShare(Integer share) {
        this.share = share;
    }
    public Integer getAddFavor() {
        return addFavor;
    }
    public void setAddFavor(Integer addFavor) {
        this.addFavor = addFavor;
    }
    public Integer getYyyxAction() {
        return yyyxAction;
    }
    public void setYyyxAction(Integer yyyxAction) {
        this.yyyxAction = yyyxAction;
    }
    public Integer getCall() {
        return call;
    }
    public void setCall(Integer call) {
        this.call = call;
    }
    public Integer getChat() {
        return chat;
    }
    public void setChat(Integer chat) {
        this.chat = chat;
    }
    public Integer getYyOrder() {
        return yyOrder;
    }
    public void setYyOrder(Integer yyOrder) {
        this.yyOrder = yyOrder;
    }
    public Integer getOrderPromo() {
        return orderPromo;
    }
    public void setOrderPromo(Integer orderPromo) {
        this.orderPromo = orderPromo;
    }
    public Integer getOrderTg() {
        return orderTg;
    }
    public void setOrderTg(Integer orderTg) {
        this.orderTg = orderTg;
    }
    public Integer getOfflineCnt() {
        return offlineCnt;
    }
    public void setOfflineCnt(Integer offlineCnt) {
        this.offlineCnt = offlineCnt;
    }
    public Integer getYfCnt() {
        return yfCnt;
    }
    public void setYfCnt(Integer yfCnt) {
        this.yfCnt = yfCnt;
    }
    public Integer getOrderSh() {
        return orderSh;
    }
    public void setOrderSh(Integer orderSh) {
        this.orderSh = orderSh;
    }
    public Integer getPayCnt() {
        return payCnt;
    }
    public void setPayCnt(Integer payCnt) {
        this.payCnt = payCnt;
    }
    public Integer getReserveCnt() {
        return reserveCnt;
    }
    public void setReserveCnt(Integer reserveCnt) {
        this.reserveCnt = reserveCnt;
    }
    public Integer getViewStylist() {
        return viewStylist;
    }
    public void setViewStylist(Integer viewStylist) {
        this.viewStylist = viewStylist;
    }
    public Integer getClickCard() {
        return clickCard;
    }
    public void setClickCard(Integer clickCard) {
        this.clickCard = clickCard;
    }
    public Integer getAddCheckin() {
        return addCheckin;
    }
    public void setAddCheckin(Integer addCheckin) {
        this.addCheckin = addCheckin;
    }
    public Integer getCardCnt() {
        return cardCnt;
    }
    public void setCardCnt(Integer cardCnt) {
        this.cardCnt = cardCnt;
    }
    public Integer getViewInfo() {
        return viewInfo;
    }
    public void setViewInfo(Integer viewInfo) {
        this.viewInfo = viewInfo;
    }
    public Integer getViewStyle() {
        return viewStyle;
    }
    public void setViewStyle(Integer viewStyle) {
        this.viewStyle = viewStyle;
    }
    public Integer getYxAction() {
        return yxAction;
    }
    public void setYxAction(Integer yxAction) {
        this.yxAction = yxAction;
    }
    public Integer getOrderKuanshi() {
        return orderKuanshi;
    }
    public void setOrderKuanshi(Integer orderKuanshi) {
        this.orderKuanshi = orderKuanshi;
    }
    public Integer getScanpayCnt() {
        return scanpayCnt;
    }
    public void setScanpayCnt(Integer scanpayCnt) {
        this.scanpayCnt = scanpayCnt;
    }




    @Override
    public String toString() {
        return "LaunchInfo{" + "date=" + date + "," + "launchId=" + launchId + "," + "launchName=" + launchName + "," + "shopName=" + shopName + "," + "charge=" + charge + "," + "imp=" + imp + "," + "click=" + click + "," + "pv=" + pv + "," + "interestAction=" + interestAction + "," + "viewPhoto=" + viewPhoto + "," + "viewReview=" + viewReview + "," + "viewYh=" + viewYh + "," + "viewTg=" + viewTg + "," + "viewAddress=" + viewAddress + "," + "viewYf=" + viewYf + "," + "share=" + share + "," + "addFavor=" + addFavor + "," + "yyyxAction=" + yyyxAction + "," + "call=" + call + "," + "chat=" + chat + "," + "yyOrder=" + yyOrder + "," + "orderPromo=" + orderPromo + "," + "orderTg=" + orderTg + "," + "offlineCnt=" + offlineCnt + "," + "yfCnt=" + yfCnt + "," + "orderSh=" + orderSh + "," + "payCnt=" + payCnt + "," + "reserveCnt=" + reserveCnt + "," + "viewStylist=" + viewStylist + "," + "clickCard=" + clickCard + "," + "addCheckin=" + addCheckin + "," + "cardCnt=" + cardCnt + "," + "viewInfo=" + viewInfo + "," + "viewStyle=" + viewStyle + "," + "yxAction=" + yxAction + "," + "orderKuanshi=" + orderKuanshi + "," + "scanpayCnt=" + scanpayCnt + "}";
    }
}
