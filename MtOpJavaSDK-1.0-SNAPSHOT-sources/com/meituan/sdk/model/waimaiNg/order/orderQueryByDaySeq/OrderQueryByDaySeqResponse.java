package com.meituan.sdk.model.waimaiNg.order.orderQueryByDaySeq;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 根据流水号查询订单
* This file was automatically generated.
*/
public class OrderQueryByDaySeqResponse {
    @NotBlank(message = "backupRecipientPhone不能为空")
    @SerializedName("backupRecipientPhone")
    private String backupRecipientPhone;
    @NotNull(message = "cTime不能为空")
    @SerializedName("cTime")
    private Long cTime;
    @NotBlank(message = "caution不能为空")
    @SerializedName("caution")
    private String caution;
    @NotNull(message = "cityId不能为空")
    @SerializedName("cityId")
    private Long cityId;
    @NotBlank(message = "daySeq不能为空")
    @SerializedName("daySeq")
    private String daySeq;
    @NotNull(message = "deliveryTime不能为空")
    @SerializedName("deliveryTime")
    private Long deliveryTime;
    @NotBlank(message = "detail不能为空")
    @SerializedName("detail")
    private String detail;
    @NotNull(message = "dinnersNumber不能为空")
    @SerializedName("dinnersNumber")
    private Long dinnersNumber;
    @NotBlank(message = "ePoiId不能为空")
    @SerializedName("ePoiId")
    private String ePoiId;
    @NotBlank(message = "extras不能为空")
    @SerializedName("extras")
    private String extras;
    @NotNull(message = "hasInvoiced不能为空")
    @SerializedName("hasInvoiced")
    private Long hasInvoiced;
    @NotNull(message = "incmpCode不能为空")
    @SerializedName("incmpCode")
    private Long incmpCode;
    /**
    * 有降级的数据模块的集合
    */
    @NotEmpty(message = "incmpModules不能为空")
    @SerializedName("incmpModules")
    private List<Integer> incmpModules;
    @NotNull(message = "invMakeType不能为空")
    @SerializedName("invMakeType")
    private Long invMakeType;
    @NotBlank(message = "invoiceTitle不能为空")
    @SerializedName("invoiceTitle")
    private String invoiceTitle;
    @NotNull(message = "isFavorites不能为空")
    @SerializedName("isFavorites")
    private Boolean isFavorites;
    @NotNull(message = "isPoiFirstOrder不能为空")
    @SerializedName("isPoiFirstOrder")
    private Boolean isPoiFirstOrder;
    @NotNull(message = "isPre不能为空")
    @SerializedName("isPre")
    private Long isPre;
    @NotNull(message = "isThirdShipping不能为空")
    @SerializedName("isThirdShipping")
    private Long isThirdShipping;
    @NotNull(message = "latitude不能为空")
    @SerializedName("latitude")
    private Double latitude;
    @NotNull(message = "logisticsCancelTime不能为空")
    @SerializedName("logisticsCancelTime")
    private Long logisticsCancelTime;
    @NotBlank(message = "logisticsCode不能为空")
    @SerializedName("logisticsCode")
    private String logisticsCode;
    @NotNull(message = "logisticsCompletedTime不能为空")
    @SerializedName("logisticsCompletedTime")
    private Long logisticsCompletedTime;
    @NotNull(message = "logisticsConfirmTime不能为空")
    @SerializedName("logisticsConfirmTime")
    private Long logisticsConfirmTime;
    @NotBlank(message = "logisticsDispatcherMobile不能为空")
    @SerializedName("logisticsDispatcherMobile")
    private String logisticsDispatcherMobile;
    @NotBlank(message = "logisticsDispatcherName不能为空")
    @SerializedName("logisticsDispatcherName")
    private String logisticsDispatcherName;
    @NotNull(message = "logisticsFetchTime不能为空")
    @SerializedName("logisticsFetchTime")
    private Long logisticsFetchTime;
    @NotNull(message = "logisticsId不能为空")
    @SerializedName("logisticsId")
    private Long logisticsId;
    @NotBlank(message = "logisticsName不能为空")
    @SerializedName("logisticsName")
    private String logisticsName;
    @NotNull(message = "logisticsSendTime不能为空")
    @SerializedName("logisticsSendTime")
    private Long logisticsSendTime;
    @NotNull(message = "logisticsStatus不能为空")
    @SerializedName("logisticsStatus")
    private Long logisticsStatus;
    @NotNull(message = "longitude不能为空")
    @SerializedName("longitude")
    private Double longitude;
    @NotNull(message = "orderCompletedTime不能为空")
    @SerializedName("orderCompletedTime")
    private Long orderCompletedTime;
    @NotNull(message = "orderConfirmTime不能为空")
    @SerializedName("orderConfirmTime")
    private Long orderConfirmTime;
    @NotNull(message = "orderEntranceType不能为空")
    @SerializedName("orderEntranceType")
    private Long orderEntranceType;
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    @NotNull(message = "orderIdView不能为空")
    @SerializedName("orderIdView")
    private Long orderIdView;
    @NotNull(message = "orderSendTime不能为空")
    @SerializedName("orderSendTime")
    private Long orderSendTime;
    @NotBlank(message = "orderTagList不能为空")
    @SerializedName("orderTagList")
    private String orderTagList;
    @NotNull(message = "originalPrice不能为空")
    @SerializedName("originalPrice")
    private Double originalPrice;
    @NotNull(message = "payType不能为空")
    @SerializedName("payType")
    private Long payType;
    @NotNull(message = "pickType不能为空")
    @SerializedName("pickType")
    private Long pickType;
    @NotBlank(message = "poiAddress不能为空")
    @SerializedName("poiAddress")
    private String poiAddress;
    @NotNull(message = "poiId不能为空")
    @SerializedName("poiId")
    private Long poiId;
    @NotBlank(message = "poiName不能为空")
    @SerializedName("poiName")
    private String poiName;
    @NotBlank(message = "poiPhone不能为空")
    @SerializedName("poiPhone")
    private String poiPhone;
    @NotBlank(message = "poiReceiveDetail不能为空")
    @SerializedName("poiReceiveDetail")
    private String poiReceiveDetail;
    @NotBlank(message = "recipientAddress不能为空")
    @SerializedName("recipientAddress")
    private String recipientAddress;
    @NotBlank(message = "recipientAddressDesensitization不能为空")
    @SerializedName("recipientAddressDesensitization")
    private String recipientAddressDesensitization;
    @NotBlank(message = "recipientName不能为空")
    @SerializedName("recipientName")
    private String recipientName;
    @NotBlank(message = "recipientPhone不能为空")
    @SerializedName("recipientPhone")
    private String recipientPhone;
    @NotBlank(message = "shipperPhone不能为空")
    @SerializedName("shipperPhone")
    private String shipperPhone;
    @NotNull(message = "shippingFee不能为空")
    @SerializedName("shippingFee")
    private Double shippingFee;
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Long status;
    @NotBlank(message = "taxpayerId不能为空")
    @SerializedName("taxpayerId")
    private String taxpayerId;
    @NotNull(message = "total不能为空")
    @SerializedName("total")
    private Double total;
    @NotNull(message = "uTime不能为空")
    @SerializedName("uTime")
    private Long uTime;
    @SerializedName("estimateArrivalTime")
    private Long estimateArrivalTime;
    @SerializedName("orderCancelTime")
    private Long orderCancelTime;
    @SerializedName("phfOrderExtraData")
    private String phfOrderExtraData;
    @SerializedName("etaModify")
    private String etaModify;
    @SerializedName("addressOfReceivingAdministrative")
    private String addressOfReceivingAdministrative;
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

    public String getBackupRecipientPhone() {
        return backupRecipientPhone;
    }
    public void setBackupRecipientPhone(String backupRecipientPhone) {
        this.backupRecipientPhone = backupRecipientPhone;
    }
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
    public String getDaySeq() {
        return daySeq;
    }
    public void setDaySeq(String daySeq) {
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
    public Long getDinnersNumber() {
        return dinnersNumber;
    }
    public void setDinnersNumber(Long dinnersNumber) {
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
    public Long getHasInvoiced() {
        return hasInvoiced;
    }
    public void setHasInvoiced(Long hasInvoiced) {
        this.hasInvoiced = hasInvoiced;
    }
    public Long getIncmpCode() {
        return incmpCode;
    }
    public void setIncmpCode(Long incmpCode) {
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
    public Long getIsThirdShipping() {
        return isThirdShipping;
    }
    public void setIsThirdShipping(Long isThirdShipping) {
        this.isThirdShipping = isThirdShipping;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Long getLogisticsCancelTime() {
        return logisticsCancelTime;
    }
    public void setLogisticsCancelTime(Long logisticsCancelTime) {
        this.logisticsCancelTime = logisticsCancelTime;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
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
    public Long getLogisticsId() {
        return logisticsId;
    }
    public void setLogisticsId(Long logisticsId) {
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
    public Long getLogisticsStatus() {
        return logisticsStatus;
    }
    public void setLogisticsStatus(Long logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Long getOrderCompletedTime() {
        return orderCompletedTime;
    }
    public void setOrderCompletedTime(Long orderCompletedTime) {
        this.orderCompletedTime = orderCompletedTime;
    }
    public Long getOrderConfirmTime() {
        return orderConfirmTime;
    }
    public void setOrderConfirmTime(Long orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }
    public Long getOrderEntranceType() {
        return orderEntranceType;
    }
    public void setOrderEntranceType(Long orderEntranceType) {
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
    public Double getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }
    public Long getPayType() {
        return payType;
    }
    public void setPayType(Long payType) {
        this.payType = payType;
    }
    public Long getPickType() {
        return pickType;
    }
    public void setPickType(Long pickType) {
        this.pickType = pickType;
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
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }
    public Long getStatus() {
        return status;
    }
    public void setStatus(Long status) {
        this.status = status;
    }
    public String getTaxpayerId() {
        return taxpayerId;
    }
    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Long getUTime() {
        return uTime;
    }
    public void setUTime(Long uTime) {
        this.uTime = uTime;
    }
    public Long getEstimateArrivalTime() {
        return estimateArrivalTime;
    }
    public void setEstimateArrivalTime(Long estimateArrivalTime) {
        this.estimateArrivalTime = estimateArrivalTime;
    }
    public Long getOrderCancelTime() {
        return orderCancelTime;
    }
    public void setOrderCancelTime(Long orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }
    public String getPhfOrderExtraData() {
        return phfOrderExtraData;
    }
    public void setPhfOrderExtraData(String phfOrderExtraData) {
        this.phfOrderExtraData = phfOrderExtraData;
    }
    public String getEtaModify() {
        return etaModify;
    }
    public void setEtaModify(String etaModify) {
        this.etaModify = etaModify;
    }
    public String getAddressOfReceivingAdministrative() {
        return addressOfReceivingAdministrative;
    }
    public void setAddressOfReceivingAdministrative(String addressOfReceivingAdministrative) {
        this.addressOfReceivingAdministrative = addressOfReceivingAdministrative;
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




    @Override
    public String toString() {
        return "OrderQueryByDaySeqResponse{" + "backupRecipientPhone=" + backupRecipientPhone + "," + "cTime=" + cTime + "," + "caution=" + caution + "," + "cityId=" + cityId + "," + "daySeq=" + daySeq + "," + "deliveryTime=" + deliveryTime + "," + "detail=" + detail + "," + "dinnersNumber=" + dinnersNumber + "," + "ePoiId=" + ePoiId + "," + "extras=" + extras + "," + "hasInvoiced=" + hasInvoiced + "," + "incmpCode=" + incmpCode + "," + "incmpModules=" + incmpModules + "," + "invMakeType=" + invMakeType + "," + "invoiceTitle=" + invoiceTitle + "," + "isFavorites=" + isFavorites + "," + "isPoiFirstOrder=" + isPoiFirstOrder + "," + "isPre=" + isPre + "," + "isThirdShipping=" + isThirdShipping + "," + "latitude=" + latitude + "," + "logisticsCancelTime=" + logisticsCancelTime + "," + "logisticsCode=" + logisticsCode + "," + "logisticsCompletedTime=" + logisticsCompletedTime + "," + "logisticsConfirmTime=" + logisticsConfirmTime + "," + "logisticsDispatcherMobile=" + logisticsDispatcherMobile + "," + "logisticsDispatcherName=" + logisticsDispatcherName + "," + "logisticsFetchTime=" + logisticsFetchTime + "," + "logisticsId=" + logisticsId + "," + "logisticsName=" + logisticsName + "," + "logisticsSendTime=" + logisticsSendTime + "," + "logisticsStatus=" + logisticsStatus + "," + "longitude=" + longitude + "," + "orderCompletedTime=" + orderCompletedTime + "," + "orderConfirmTime=" + orderConfirmTime + "," + "orderEntranceType=" + orderEntranceType + "," + "orderId=" + orderId + "," + "orderIdView=" + orderIdView + "," + "orderSendTime=" + orderSendTime + "," + "orderTagList=" + orderTagList + "," + "originalPrice=" + originalPrice + "," + "payType=" + payType + "," + "pickType=" + pickType + "," + "poiAddress=" + poiAddress + "," + "poiId=" + poiId + "," + "poiName=" + poiName + "," + "poiPhone=" + poiPhone + "," + "poiReceiveDetail=" + poiReceiveDetail + "," + "recipientAddress=" + recipientAddress + "," + "recipientAddressDesensitization=" + recipientAddressDesensitization + "," + "recipientName=" + recipientName + "," + "recipientPhone=" + recipientPhone + "," + "shipperPhone=" + shipperPhone + "," + "shippingFee=" + shippingFee + "," + "status=" + status + "," + "taxpayerId=" + taxpayerId + "," + "total=" + total + "," + "uTime=" + uTime + "," + "estimateArrivalTime=" + estimateArrivalTime + "," + "orderCancelTime=" + orderCancelTime + "," + "phfOrderExtraData=" + phfOrderExtraData + "," + "etaModify=" + etaModify + "," + "addressOfReceivingAdministrative=" + addressOfReceivingAdministrative + "," + "packageBagFeeInfo=" + packageBagFeeInfo + "," + "poiMealAssessmentTime=" + poiMealAssessmentTime + "," + "sqtOrder=" + sqtOrder + "," + "needSqtInvoice=" + needSqtInvoice + "," + "giftInfo=" + giftInfo + "," + "wmPoiReceiveCent=" + wmPoiReceiveCent + "}";
    }
}
