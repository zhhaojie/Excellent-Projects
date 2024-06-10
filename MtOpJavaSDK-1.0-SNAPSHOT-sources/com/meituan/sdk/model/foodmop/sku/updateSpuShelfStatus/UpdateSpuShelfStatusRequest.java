package com.meituan.sdk.model.foodmop.sku.updateSpuShelfStatus;

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
* 更新商品上下架状态（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/updateSpuShelfStatus",
    businessId = 51,
    apiVersion = "10013",
    apiName = "update_spu_shelf_status",
    needAuth = true
)
public class UpdateSpuShelfStatusRequest implements MeituanRequest<UpdateSpuShelfStatusResponse> {
    /**
    * <p data-diff-id="ct-diff-id-918cdcec-f145-4a06-9cc2-6ac6f616a228">更新范围</p><ul data-diff-id="ct-diff-id-ec28484c-0db4-490f-9b89-de008594697e"><li data-list-item-diff-id="ct-list-item-diff-id-ac58c951-afcd-4a0d-8bfb-bf5f8eeb9f75"><p data-diff-id="ct-diff-id-4668adaf-56c2-4d5a-ba58-6f6132b75362">0：全国</p></li><li data-list-item-diff-id="ct-list-item-diff-id-e95d09b0-29bc-4ae9-936c-2d12455ba4cd"><p data-diff-id="ct-diff-id-aea1dad1-2e6b-4654-bdfa-40aea74fdd13">1：门店</p></li></ul>
    */
    @NotNull(message = "scope不能为空")
    @SerializedName("scope")
    private Integer scope;
    /**
    * <p data-diff-id="ct-diff-id-2c499234-9b00-47bc-89e3-fb4166f0237c">门店 id 列表</p><ol data-diff-id="ct-diff-id-eedb9a66-fb4e-4499-ba5b-972dfd7f5266"><li data-list-item-diff-id="ct-list-item-diff-id-1a90037b-7808-43d5-b38c-b60f03328103"><p data-diff-id="ct-diff-id-a90691e2-c93e-4a6f-b181-223b59a8e505">spuScope == 1 时必传vendorShopIdList.get(0)是 门店商品对应门店</p></li><li data-list-item-diff-id="ct-list-item-diff-id-7a4c3f17-bcc5-4cdf-8686-8c95cefbb314"><p data-diff-id="ct-diff-id-6ae3f452-7806-43f0-8909-e7cfe63f84d7">spuScope == 0</p><ol data-diff-id="ct-diff-id-e513b599-7175-43f8-9f77-a771293a8281"><li data-list-item-diff-id="ct-list-item-diff-id-568cd598-1d1b-477a-ac6c-57667db12278"><p data-diff-id="ct-diff-id-74991b3a-75df-4df0-8a1c-cd7fcd2b5c73"><span style="color: ">scope == 1 时必传</span></p><p data-diff-id="ct-diff-id-6f3d1a5f-9d70-42af-a0d2-f06dc51cc494"><span style="color: ">最多 30 个，所有 vendorShopId 都在美团侧存在映射，若存在无映射 vendorShopId，失败并在错误信息中返回无映射 vendorShopId</span></p></li></ol></li></ol>
    */
    @SerializedName("vendorShopIdList")
    private List<String> vendorShopIdList;
    /**
    * <p data-diff-id="ct-diff-id-eccdea82-de87-4fb6-8b35-eff26889bab7">上下架状态</p><ul data-diff-id="ct-diff-id-f472e380-9b7f-405d-9686-da9801a16860"><li data-list-item-diff-id="ct-list-item-diff-id-4f1c84d4-1c83-43fb-a527-421e6704237b"><p data-diff-id="ct-diff-id-efabbd1e-9bdc-4f71-a217-4b954144a1d8">0：下架</p></li><li data-list-item-diff-id="ct-list-item-diff-id-61600eea-441b-4c8e-958b-253330aa05b6"><p data-diff-id="ct-diff-id-04ad3416-e9af-4bb9-8b2e-1dab8add3aa5">1：上架</p></li></ul>
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * <p data-diff-id="ct-diff-id-1a16d6de-00d2-43db-a6e3-7e7cb1e3b49d">商品 spuId 列表</p><p data-diff-id="ct-diff-id-cdc0e2ec-8ecc-47c2-8a4f-5b7144eda9a9"><span style="color: ">每次最多 50 个</span></p>
    */
    @NotEmpty(message = "vendorSpuIdList不能为空")
    @SerializedName("vendorSpuIdList")
    private List<String> vendorSpuIdList;
    /**
    * <p data-diff-id="ct-diff-id-31b07bbe-7058-4b82-bf2a-a1575e2b0057">商品类型</p><ul data-diff-id="ct-diff-id-99a4009c-6a4b-4c24-9b8a-2d0e26d03b27"><li data-list-item-diff-id="ct-list-item-diff-id-675f62f9-8261-4d6c-becc-d2b04b4e3832"><p data-diff-id="ct-diff-id-dac2a96f-44d9-4508-a5aa-deae25b7228e">0：品牌商品</p></li><li data-list-item-diff-id="ct-list-item-diff-id-86c4553b-58ab-42e9-b761-1db175f4aed8"><p data-diff-id="ct-diff-id-31952d44-c3a6-424d-89c3-1dbd2bf5f02a">1：门店商品</p></li></ul><p data-diff-id="ct-diff-id-be2d0379-46d8-44c7-bb34-68b225ea19a5">默认品牌纬度</p>
    */
    @SerializedName("spuScope")
    private Integer spuScope;

    public Integer getScope() {
        return scope;
    }
    public void setScope(Integer scope) {
        this.scope = scope;
    }
    public List<String> getVendorShopIdList() {
        return vendorShopIdList;
    }
    public void setVendorShopIdList(List<String> vendorShopIdList) {
        this.vendorShopIdList = vendorShopIdList;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public List<String> getVendorSpuIdList() {
        return vendorSpuIdList;
    }
    public void setVendorSpuIdList(List<String> vendorSpuIdList) {
        this.vendorSpuIdList = vendorSpuIdList;
    }
    public Integer getSpuScope() {
        return spuScope;
    }
    public void setSpuScope(Integer spuScope) {
        this.spuScope = spuScope;
    }


    @Override
    public MeituanResponse<UpdateSpuShelfStatusResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<UpdateSpuShelfStatusResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "UpdateSpuShelfStatusRequest{" + "scope=" + scope + "," + "vendorShopIdList=" + vendorShopIdList + "," + "shelfStatus=" + shelfStatus + "," + "vendorSpuIdList=" + vendorSpuIdList + "," + "spuScope=" + spuScope + "}";
    }
}
