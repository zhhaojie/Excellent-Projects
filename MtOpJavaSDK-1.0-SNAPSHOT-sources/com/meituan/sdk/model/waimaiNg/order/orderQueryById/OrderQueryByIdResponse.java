package com.meituan.sdk.model.waimaiNg.order.orderQueryById;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 根据订单Id查询订单
* This file was automatically generated.
*/
public class OrderQueryByIdResponse {
    /**
    * 订单创建时间 整性数据，单位是秒
    */
    @SerializedName("cTime")
    private Long cTime;
    /**
    * caution字段为用户下单时的备注 ，具体表现：有备注且开通隐私号功能，格式内容为'备注内容+收餐人隐私号+脱敏的真实号' ；有备注未开通隐私号功能，格式内容为“备注内容”；无备注但开通隐私号功能，格式内容为'收餐人隐私号13141047707_6179,手机号186****9921' ；无备注未开通隐私号功能，不显示；用户选择到店自取，备注内容显示”到店自取”。
    */
    @SerializedName("caution")
    private String caution;
    /**
    * 城市Id
    */
    @SerializedName("cityId")
    private Long cityId;
    /**
    * 门店当天的订单流水号 每天流水号从1开始
    */
    @SerializedName("daySeq")
    private Integer daySeq;
    /**
    * 用户预计送达时间，“立即送达”时为0 整性数据，单位是秒, 如取餐类型为到店自取，则该时间为用户自选的到店自取时间。
    */
    @SerializedName("deliveryTime")
    private Long deliveryTime;
    /**
    * 订单菜品详情 参照 detail 指的是订单中都有哪些菜品
    */
    @SerializedName("detail")
    private String detail;
    /**
    * 就餐人数 用餐人数（0：用户没有选择用餐人数；1-10：用户选择的用餐人数；-10：10人以上用餐；88：用户需要餐具；99：用户不需要餐具），该信息默认不推送，如有需求可在开发者中心订阅
    */
    @SerializedName("dinnersNumber")
    private Integer dinnersNumber;
    /**
    * ERP方门店id 指的是三方系统中的门店Id
    */
    @SerializedName("ePoiId")
    private String ePoiId;
    /**
    * 订单扩展信息 参考 extras 指的是订单所参加的优惠等信息
    */
    @SerializedName("extras")
    private String extras;
    /**
    * 是否需要发票 1-需要发票；0-不需要
    */
    @SerializedName("hasInvoiced")
    private Integer hasInvoiced;
    /**
    * 订单数据状态标记。当订单中部分字段的数据因内部交互异常或网络等原因延迟生成（超时），导致开发者当前获取的订单数据不完整，此时平台对订单数据缺失情况进行标记。如不完整，建议尝试重新查询。注意，平台仅对部分模块的数据完整性进行监察标记（参考incmp_modules字段）。参考值： -1：有数据降级 0：无数据降级
    */
    @SerializedName("incmpCode")
    private Integer incmpCode;
    /**
    * 有降级的数据模块的集合
    */
    @NotEmpty(message = "incmpModules不能为空")
    @SerializedName("incmpModules")
    private List<Integer> incmpModules;
    @NotNull(message = "invMakeType不能为空")
    @SerializedName("invMakeType")
    private Long invMakeType;
    /**
    * 发票抬头 如果用户选择需要发票，此字段是用户填写的发票抬头
    */
    @SerializedName("invoiceTitle")
    private String invoiceTitle;
    /**
    * 用户是否收藏此门店 该信息默认不展示，如有需求可联系开放平台工作人员开通
    */
    @SerializedName("isFavorites")
    private Boolean isFavorites;
    /**
    * 用户是否第一次在此门店点餐 该信息默认不展示，如有需求可联系开放平台工作人员开通
    */
    @SerializedName("isPoiFirstOrder")
    private Boolean isPoiFirstOrder;
    @NotNull(message = "isPre不能为空")
    @SerializedName("isPre")
    private Long isPre;
    /**
    * 是否第三方配送 0：否；1：是 目前基本上不支持第三方配送
    */
    @SerializedName("isThirdShipping")
    private Integer isThirdShipping;
    /**
    * 实际送餐地址纬度 美团使用的是高德坐标系
    */
    @SerializedName("latitude")
    private Double latitude;
    /**
    * 配送类型码 参考附录配送类型码
    */
    @SerializedName("logisticsCode")
    private String logisticsCode;
    /**
    * 实际送餐地址经度 美团使用的是高德坐标系
    */
    @SerializedName("longitude")
    private Double longitude;
    /**
    * 标识订单是否为团餐定制菜单  1：团餐定制菜单。0或空：外卖菜单
    */
    @SerializedName("orderEntranceType")
    private Integer orderEntranceType;
    /**
    * 订单Id
    */
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 订单展示Id 指的是C端用户在外卖App上看到的订单号
    */
    @SerializedName("orderIdView")
    private Long orderIdView;
    /**
    * 用户下单时间 整性数据，单位是秒
    */
    @SerializedName("orderSendTime")
    private Long orderSendTime;
    /**
    * 订单业务打标枚举，即业务身份 json字符串格式的数组，例：'[16]'
    */
    @SerializedName("orderTagList")
    private String orderTagList;
    /**
    * 订单原价
    */
    @SerializedName("originalPrice")
    private Float originalPrice;
    /**
    * 订单支付类型 （1：货到付款；2：在线支付）
    */
    @SerializedName("payType")
    private Integer payType;
    /**
    * 门店地址
    */
    @SerializedName("poiAddress")
    private String poiAddress;
    /**
    * 门店Id 指的是外卖中的门店Id
    */
    @SerializedName("poiId")
    private Long poiId;
    /**
    * 门店名称
    */
    @SerializedName("poiName")
    private String poiName;
    /**
    * 门店服务电话
    */
    @SerializedName("poiPhone")
    private String poiPhone;
    /**
    * 商家对账信息 参考poiReceiveDetail
    */
    @SerializedName("poiReceiveDetail")
    private String poiReceiveDetail;
    /**
    * 脱敏收货人地址。订单完成3小时后展示“为保护顾客隐私，地址已隐藏”。实际的地址 @#后是经纬度反查的地址，是用户订餐时定位的地址
    */
    @SerializedName("recipientAddress")
    private String recipientAddress;
    /**
    * 脱敏收货人地址。订单完成3小时后展示“为保护顾客隐私，地址已隐藏”
    */
    @SerializedName("recipientAddressDesensitization")
    private String recipientAddressDesensitization;
    /**
    * 收货人名称
    */
    @SerializedName("recipientName")
    private String recipientName;
    /**
    * 收货人电话 C端启用号码保护时该字段展示隐私号，如15696424612_7472。C端未启用号码保护或隐私号降级时，该字段为真实手机号，如12345678901
    */
    @SerializedName("recipientPhone")
    private String recipientPhone;
    /**
    * 骑手电话 跟logisticsDispatcherMobile值相同，以此字段为准
    */
    @SerializedName("shipperPhone")
    private String shipperPhone;
    /**
    * 配送费用
    */
    @SerializedName("shippingFee")
    private Float shippingFee;
    /**
    * 订单状态 查看备注信息
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 发票税号
    */
    @SerializedName("taxpayerId")
    private String taxpayerId;
    /**
    * 总价 用户实际支付金额
    */
    @SerializedName("total")
    private Float total;
    /**
    * 订单更新时间
    */
    @SerializedName("uTime")
    private Long uTime;
    /**
    * 备份隐私号 具体为json格式的字符串数组  1、当recipientPhone字段为隐私号时，该字段作为其备份，目前为1个号码，将来为可能为多个，用英文逗号隔开“,”。 2、有至少2个可用的隐私号时，该字段返回备用的隐私号；如果只有1个隐私号可用或所有隐私号均不可用时，该字段返回内容为空。 3、recipientPhone和backupRecipientPhone的隐私号间没有优劣之分，任何一个隐私号故障时，请尝试用其他隐私号联系用户。当所有隐私号都故障且美团触发降级时，重新获取的recipientPhone字段才会展示真实号。
    */
    @SerializedName("backupRecipientPhone")
    private String backupRecipientPhone;
    @SerializedName("logisticsCancelTime")
    private Long logisticsCancelTime;
    /**
    * 配送完成时间
    */
    @SerializedName("logisticsCompletedTime")
    private Long logisticsCompletedTime;
    /**
    * 配送单确认时间，骑手接单时间
    */
    @SerializedName("logisticsConfirmTime")
    private Long logisticsConfirmTime;
    /**
    * 骑手电话
    */
    @SerializedName("logisticsDispatcherMobile")
    private String logisticsDispatcherMobile;
    /**
    * 骑手姓名
    */
    @SerializedName("logisticsDispatcherName")
    private String logisticsDispatcherName;
    /**
    * 骑手取单时间
    */
    @SerializedName("logisticsFetchTime")
    private Long logisticsFetchTime;
    /**
    * 配送方ID
    */
    @SerializedName("logisticsId")
    private Integer logisticsId;
    /**
    * 配送方名称
    */
    @SerializedName("logisticsName")
    private String logisticsName;
    /**
    * 配送单下单时间
    */
    @SerializedName("logisticsSendTime")
    private Long logisticsSendTime;
    /**
    * 配送订单状态code 参考《补充相关字段说明》
    */
    @SerializedName("logisticsStatus")
    private Integer logisticsStatus;
    /**
    * 商家确认时间
    */
    @SerializedName("orderConfirmTime")
    private Long orderConfirmTime;
    /**
    * 取餐类型 0：普通取餐；1：到店取餐 该信息默认不展示，如有需求可联系开放平台工作人员开通
    */
    @SerializedName("pickType")
    private Integer pickType;
    /**
    * 订单完成时间
    */
    @SerializedName("orderCompletedTime")
    private Long orderCompletedTime;
    @SerializedName("etaModify")
    private EtaModifyVO etaModify;
    /**
    * 打包费模块
    */
    @SerializedName("packageBagFeeInfo")
    private PackageBagFeeInfo packageBagFeeInfo;
    /**
    * 出餐考核时间
    */
    @SerializedName("poiMealAssessmentTime")
    private Long poiMealAssessmentTime;
    /**
    * 是否是商企通订单 1是商企通订单 2非商企通 0降级
    */
    @SerializedName("sqtOrder")
    private Integer sqtOrder;
    /**
    * 是否需要开发票 1需要开发票 2无需开发票 0降级
    */
    @SerializedName("needSqtInvoice")
    private Integer needSqtInvoice;
    /**
    * 赠品信息
    */
    @SerializedName("giftInfo")
    private String giftInfo;
    /**
    * 商家应收款（分）
    */
    @SerializedName("wmPoiReceiveCent")
    private Long wmPoiReceiveCent;
    /**
    * 预计送达时间
    */
    @SerializedName("estimateArrivalTime")
    private Long estimateArrivalTime;

    public Long getCTime() {
        return cTime;
    }
    public void setCTime(Long cTime) {
        this.cTime = cTime;
    }
    public String getCaution() {
        return caution;
    }
    public void setCaution(String caution) {
        this.caution = caution;
    }
    public Long getCityId() {
        return cityId;
    }
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
    public Integer getDaySeq() {
        return daySeq;
    }
    public void setDaySeq(Integer daySeq) {
        this.daySeq = daySeq;
    }
    public Long getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public Integer getDinnersNumber() {
        return dinnersNumber;
    }
    public void setDinnersNumber(Integer dinnersNumber) {
        this.dinnersNumber = dinnersNumber;
    }
    public String getEPoiId() {
        return ePoiId;
    }
    public void setEPoiId(String ePoiId) {
        this.ePoiId = ePoiId;
    }
    public String getExtras() {
        return extras;
    }
    public void setExtras(String extras) {
        this.extras = extras;
    }
    public Integer getHasInvoiced() {
        return hasInvoiced;
    }
    public void setHasInvoiced(Integer hasInvoiced) {
        this.hasInvoiced = hasInvoiced;
    }
    public Integer getIncmpCode() {
        return incmpCode;
    }
    public void setIncmpCode(Integer incmpCode) {
        this.incmpCode = incmpCode;
    }
    public List<Integer> getIncmpModules() {
        return incmpModules;
    }
    public void setIncmpModules(List<Integer> incmpModules) {
        this.incmpModules = incmpModules;
    }
    public Long getInvMakeType() {
        return invMakeType;
    }
    public void setInvMakeType(Long invMakeType) {
        this.invMakeType = invMakeType;
    }
    public String getInvoiceTitle() {
        return invoiceTitle;
    }
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }
    public Boolean getIsFavorites() {
        return isFavorites;
    }
    public void setIsFavorites(Boolean isFavorites) {
        this.isFavorites = isFavorites;
    }
    public Boolean getIsPoiFirstOrder() {
        return isPoiFirstOrder;
    }
    public void setIsPoiFirstOrder(Boolean isPoiFirstOrder) {
        this.isPoiFirstOrder = isPoiFirstOrder;
    }
    public Long getIsPre() {
        return isPre;
    }
    public void setIsPre(Long isPre) {
        this.isPre = isPre;
    }
    public Integer getIsThirdShipping() {
        return isThirdShipping;
    }
    public void setIsThirdShipping(Integer isThirdShipping) {
        this.isThirdShipping = isThirdShipping;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Integer getOrderEntranceType() {
        return orderEntranceType;
    }
    public void setOrderEntranceType(Integer orderEntranceType) {
        this.orderEntranceType = orderEntranceType;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getOrderIdView() {
        return orderIdView;
    }
    public void setOrderIdView(Long orderIdView) {
        this.orderIdView = orderIdView;
    }
    public Long getOrderSendTime() {
        return orderSendTime;
    }
    public void setOrderSendTime(Long orderSendTime) {
        this.orderSendTime = orderSendTime;
    }
    public String getOrderTagList() {
        return orderTagList;
    }
    public void setOrderTagList(String orderTagList) {
        this.orderTagList = orderTagList;
    }
    public Float getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }
    public Integer getPayType() {
        return payType;
    }
    public void setPayType(Integer payType) {
        this.payType = payType;
    }
    public String getPoiAddress() {
        return poiAddress;
    }
    public void setPoiAddress(String poiAddress) {
        this.poiAddress = poiAddress;
    }
    public Long getPoiId() {
        return poiId;
    }
    public void setPoiId(Long poiId) {
        this.poiId = poiId;
    }
    public String getPoiName() {
        return poiName;
    }
    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }
    public String getPoiPhone() {
        return poiPhone;
    }
    public void setPoiPhone(String poiPhone) {
        this.poiPhone = poiPhone;
    }
    public String getPoiReceiveDetail() {
        return poiReceiveDetail;
    }
    public void setPoiReceiveDetail(String poiReceiveDetail) {
        this.poiReceiveDetail = poiReceiveDetail;
    }
    public String getRecipientAddress() {
        return recipientAddress;
    }
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }
    public String getRecipientAddressDesensitization() {
        return recipientAddressDesensitization;
    }
    public void setRecipientAddressDesensitization(String recipientAddressDesensitization) {
        this.recipientAddressDesensitization = recipientAddressDesensitization;
    }
    public String getRecipientName() {
        return recipientName;
    }
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }
    public String getRecipientPhone() {
        return recipientPhone;
    }
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }
    public String getShipperPhone() {
        return shipperPhone;
    }
    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone;
    }
    public Float getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Float shippingFee) {
        this.shippingFee = shippingFee;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getTaxpayerId() {
        return taxpayerId;
    }
    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }
    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }
    public Long getUTime() {
        return uTime;
    }
    public void setUTime(Long uTime) {
        this.uTime = uTime;
    }
    public String getBackupRecipientPhone() {
        return backupRecipientPhone;
    }
    public void setBackupRecipientPhone(String backupRecipientPhone) {
        this.backupRecipientPhone = backupRecipientPhone;
    }
    public Long getLogisticsCancelTime() {
        return logisticsCancelTime;
    }
    public void setLogisticsCancelTime(Long logisticsCancelTime) {
        this.logisticsCancelTime = logisticsCancelTime;
    }
    public Long getLogisticsCompletedTime() {
        return logisticsCompletedTime;
    }
    public void setLogisticsCompletedTime(Long logisticsCompletedTime) {
        this.logisticsCompletedTime = logisticsCompletedTime;
    }
    public Long getLogisticsConfirmTime() {
        return logisticsConfirmTime;
    }
    public void setLogisticsConfirmTime(Long logisticsConfirmTime) {
        this.logisticsConfirmTime = logisticsConfirmTime;
    }
    public String getLogisticsDispatcherMobile() {
        return logisticsDispatcherMobile;
    }
    public void setLogisticsDispatcherMobile(String logisticsDispatcherMobile) {
        this.logisticsDispatcherMobile = logisticsDispatcherMobile;
    }
    public String getLogisticsDispatcherName() {
        return logisticsDispatcherName;
    }
    public void setLogisticsDispatcherName(String logisticsDispatcherName) {
        this.logisticsDispatcherName = logisticsDispatcherName;
    }
    public Long getLogisticsFetchTime() {
        return logisticsFetchTime;
    }
    public void setLogisticsFetchTime(Long logisticsFetchTime) {
        this.logisticsFetchTime = logisticsFetchTime;
    }
    public Integer getLogisticsId() {
        return logisticsId;
    }
    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }
    public String getLogisticsName() {
        return logisticsName;
    }
    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }
    public Long getLogisticsSendTime() {
        return logisticsSendTime;
    }
    public void setLogisticsSendTime(Long logisticsSendTime) {
        this.logisticsSendTime = logisticsSendTime;
    }
    public Integer getLogisticsStatus() {
        return logisticsStatus;
    }
    public void setLogisticsStatus(Integer logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }
    public Long getOrderConfirmTime() {
        return orderConfirmTime;
    }
    public void setOrderConfirmTime(Long orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }
    public Integer getPickType() {
        return pickType;
    }
    public void setPickType(Integer pickType) {
        this.pickType = pickType;
    }
    public Long getOrderCompletedTime() {
        return orderCompletedTime;
    }
    public void setOrderCompletedTime(Long orderCompletedTime) {
        this.orderCompletedTime = orderCompletedTime;
    }
    public EtaModifyVO getEtaModify() {
        return etaModify;
    }
    public void setEtaModify(EtaModifyVO etaModify) {
        this.etaModify = etaModify;
    }
    public PackageBagFeeInfo getPackageBagFeeInfo() {
        return packageBagFeeInfo;
    }
    public void setPackageBagFeeInfo(PackageBagFeeInfo packageBagFeeInfo) {
        this.packageBagFeeInfo = packageBagFeeInfo;
    }
    public Long getPoiMealAssessmentTime() {
        return poiMealAssessmentTime;
    }
    public void setPoiMealAssessmentTime(Long poiMealAssessmentTime) {
        this.poiMealAssessmentTime = poiMealAssessmentTime;
    }
    public Integer getSqtOrder() {
        return sqtOrder;
    }
    public void setSqtOrder(Integer sqtOrder) {
        this.sqtOrder = sqtOrder;
    }
    public Integer getNeedSqtInvoice() {
        return needSqtInvoice;
    }
    public void setNeedSqtInvoice(Integer needSqtInvoice) {
        this.needSqtInvoice = needSqtInvoice;
    }
    public String getGiftInfo() {
        return giftInfo;
    }
    public void setGiftInfo(String giftInfo) {
        this.giftInfo = giftInfo;
    }
    public Long getWmPoiReceiveCent() {
        return wmPoiReceiveCent;
    }
    public void setWmPoiReceiveCent(Long wmPoiReceiveCent) {
        this.wmPoiReceiveCent = wmPoiReceiveCent;
    }
    public Long getEstimateArrivalTime() {
        return estimateArrivalTime;
    }
    public void setEstimateArrivalTime(Long estimateArrivalTime) {
        this.estimateArrivalTime = estimateArrivalTime;
    }




    @Override
    public String toString() {
        return "OrderQueryByIdResponse{" + "cTime=" + cTime + "," + "caution=" + caution + "," + "cityId=" + cityId + "," + "daySeq=" + daySeq + "," + "deliveryTime=" + deliveryTime + "," + "detail=" + detail + "," + "dinnersNumber=" + dinnersNumber + "," + "ePoiId=" + ePoiId + "," + "extras=" + extras + "," + "hasInvoiced=" + hasInvoiced + "," + "incmpCode=" + incmpCode + "," + "incmpModules=" + incmpModules + "," + "invMakeType=" + invMakeType + "," + "invoiceTitle=" + invoiceTitle + "," + "isFavorites=" + isFavorites + "," + "isPoiFirstOrder=" + isPoiFirstOrder + "," + "isPre=" + isPre + "," + "isThirdShipping=" + isThirdShipping + "," + "latitude=" + latitude + "," + "logisticsCode=" + logisticsCode + "," + "longitude=" + longitude + "," + "orderEntranceType=" + orderEntranceType + "," + "orderId=" + orderId + "," + "orderIdView=" + orderIdView + "," + "orderSendTime=" + orderSendTime + "," + "orderTagList=" + orderTagList + "," + "originalPrice=" + originalPrice + "," + "payType=" + payType + "," + "poiAddress=" + poiAddress + "," + "poiId=" + poiId + "," + "poiName=" + poiName + "," + "poiPhone=" + poiPhone + "," + "poiReceiveDetail=" + poiReceiveDetail + "," + "recipientAddress=" + recipientAddress + "," + "recipientAddressDesensitization=" + recipientAddressDesensitization + "," + "recipientName=" + recipientName + "," + "recipientPhone=" + recipientPhone + "," + "shipperPhone=" + shipperPhone + "," + "shippingFee=" + shippingFee + "," + "status=" + status + "," + "taxpayerId=" + taxpayerId + "," + "total=" + total + "," + "uTime=" + uTime + "," + "backupRecipientPhone=" + backupRecipientPhone + "," + "logisticsCancelTime=" + logisticsCancelTime + "," + "logisticsCompletedTime=" + logisticsCompletedTime + "," + "logisticsConfirmTime=" + logisticsConfirmTime + "," + "logisticsDispatcherMobile=" + logisticsDispatcherMobile + "," + "logisticsDispatcherName=" + logisticsDispatcherName + "," + "logisticsFetchTime=" + logisticsFetchTime + "," + "logisticsId=" + logisticsId + "," + "logisticsName=" + logisticsName + "," + "logisticsSendTime=" + logisticsSendTime + "," + "logisticsStatus=" + logisticsStatus + "," + "orderConfirmTime=" + orderConfirmTime + "," + "pickType=" + pickType + "," + "orderCompletedTime=" + orderCompletedTime + "," + "etaModify=" + etaModify + "," + "packageBagFeeInfo=" + packageBagFeeInfo + "," + "poiMealAssessmentTime=" + poiMealAssessmentTime + "," + "sqtOrder=" + sqtOrder + "," + "needSqtInvoice=" + needSqtInvoice + "," + "giftInfo=" + giftInfo + "," + "wmPoiReceiveCent=" + wmPoiReceiveCent + "," + "estimateArrivalTime=" + estimateArrivalTime + "}";
    }
}
