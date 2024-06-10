package com.meituan.sdk.model.ad.launch.batchCreateCpcLaunchs;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 新建推广
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchCreateCpcLaunchs",
    businessId = 22,
    apiVersion = "10030",
    apiName = "batch_create_cpc_launchs",
    needAuth = false
)
public class BatchCreateCpcLaunchsRequest implements MeituanRequest<BatchCreateCpcLaunchsResponse> {
    /**
    * 门店列表，一个门店对应一个推广,单次最多支持50个
    */
    @NotEmpty(message = "shopList不能为空")
    @SerializedName("shopList")
    private List<Long> shopList;
    /**
    * 1点评，2美团
    */
    @SerializedName("shopType")
    private Integer shopType;
    /**
    * 日预算
    */
    @NotNull(message = "budgetBasic不能为空")
    @SerializedName("budgetBasic")
    private Integer budgetBasic;
    /**
    * 高峰日上浮比例
    */
    @NotNull(message = "budgetFloatRatio不能为空")
    @SerializedName("budgetFloatRatio")
    private Integer budgetFloatRatio;
    /**
    * 是否支持匀速投放  0 不支持 1 支持   默认支持
    */
    @SerializedName("deliverySpeed")
    private Integer deliverySpeed;
    /**
    * 点评侧出价（单位分）
    */
    @NotNull(message = "dpPrice不能为空")
    @SerializedName("dpPrice")
    private Integer dpPrice;
    /**
    * 美团侧出价(单位分)
    */
    @NotNull(message = "mtPrice不能为空")
    @SerializedName("mtPrice")
    private Integer mtPrice;
    /**
    * 7*24小时定向选择  默认7*24
    */
    @SerializedName("timeList")
    private List<Long> timeList;
    /**
    * <p data-diff-id="ct-diff-id-bfd9b406-8934-4f68-aa31-0dd4ceb119a3">1 默认，2是终使用门店头图，3开启系统优选</p>
    */
    @NotNull(message = "smartPic不能为空")
    @SerializedName("smartPic")
    private Integer smartPic;
    @SerializedName("sonAdaccountId")
    private Integer sonAdaccountId;
    /**
    * <p data-diff-id="ct-diff-id-eb46707b-a1f2-43d2-8fbe-c1efeb2b2412">shopId：创建投放用到的门店</p><p data-diff-id="ct-diff-id-30431770-5374-4bf8-bb5c-6d38bb4e162a">keywordPremiums：关键词定向jsonArray</p><p data-diff-id="ct-diff-id-efba1ebc-58fc-4d85-9540-204a7f0eaac9">                                  premiumName：溢价关键词定向名</p><p style="text-align: center;" data-diff-id="ct-diff-id-ca9d5176-0251-4594-bc69-4f3d8d7803a8">keywords：词包列表，用于新增品类词包，地址词</p><p style="text-align: center;" data-diff-id="ct-diff-id-0bd6b66d-c8f3-4129-bb67-8cd26ff4ac7b">words:用于新增推荐词</p><p style="text-align: center;" data-diff-id="ct-diff-id-217d6b03-e99e-4277-a4b8-1aa91c9d3b7e">itemTypes：只在选择门店热搜词的情况下传固定值3</p><p style="text-align: center;" data-diff-id="ct-diff-id-5aae5687-d3e8-48f1-9f77-da71e2ef57a7">dpBidPrice：点评出价（单位分）</p><p style="text-align: center;" data-diff-id="ct-diff-id-1907fcc8-d916-4783-b57f-c5b5dc1b6dd8">mtBidPrice：美团出价（单位分）</p>
    */
    @SerializedName("shopKeywordPremiumListMap")
    private String shopKeywordPremiumListMap;
    @SerializedName("needEcpc")
    private Integer needEcpc;

    public List<Long> getShopList() {
        return shopList;
    }
    public void setShopList(List<Long> shopList) {
        this.shopList = shopList;
    }
    public Integer getShopType() {
        return shopType;
    }
    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }
    public Integer getBudgetBasic() {
        return budgetBasic;
    }
    public void setBudgetBasic(Integer budgetBasic) {
        this.budgetBasic = budgetBasic;
    }
    public Integer getBudgetFloatRatio() {
        return budgetFloatRatio;
    }
    public void setBudgetFloatRatio(Integer budgetFloatRatio) {
        this.budgetFloatRatio = budgetFloatRatio;
    }
    public Integer getDeliverySpeed() {
        return deliverySpeed;
    }
    public void setDeliverySpeed(Integer deliverySpeed) {
        this.deliverySpeed = deliverySpeed;
    }
    public Integer getDpPrice() {
        return dpPrice;
    }
    public void setDpPrice(Integer dpPrice) {
        this.dpPrice = dpPrice;
    }
    public Integer getMtPrice() {
        return mtPrice;
    }
    public void setMtPrice(Integer mtPrice) {
        this.mtPrice = mtPrice;
    }
    public List<Long> getTimeList() {
        return timeList;
    }
    public void setTimeList(List<Long> timeList) {
        this.timeList = timeList;
    }
    public Integer getSmartPic() {
        return smartPic;
    }
    public void setSmartPic(Integer smartPic) {
        this.smartPic = smartPic;
    }
    public Integer getSonAdaccountId() {
        return sonAdaccountId;
    }
    public void setSonAdaccountId(Integer sonAdaccountId) {
        this.sonAdaccountId = sonAdaccountId;
    }
    public String getShopKeywordPremiumListMap() {
        return shopKeywordPremiumListMap;
    }
    public void setShopKeywordPremiumListMap(String shopKeywordPremiumListMap) {
        this.shopKeywordPremiumListMap = shopKeywordPremiumListMap;
    }
    public Integer getNeedEcpc() {
        return needEcpc;
    }
    public void setNeedEcpc(Integer needEcpc) {
        this.needEcpc = needEcpc;
    }


    @Override
    public MeituanResponse<BatchCreateCpcLaunchsResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchCreateCpcLaunchsResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchCreateCpcLaunchsRequest{" + "shopList=" + shopList + "," + "shopType=" + shopType + "," + "budgetBasic=" + budgetBasic + "," + "budgetFloatRatio=" + budgetFloatRatio + "," + "deliverySpeed=" + deliverySpeed + "," + "dpPrice=" + dpPrice + "," + "mtPrice=" + mtPrice + "," + "timeList=" + timeList + "," + "smartPic=" + smartPic + "," + "sonAdaccountId=" + sonAdaccountId + "," + "shopKeywordPremiumListMap=" + shopKeywordPremiumListMap + "," + "needEcpc=" + needEcpc + "}";
    }
}
