package com.meituan.sdk.model.foodmop.sku.updatePremiumShelfStatus;

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
* 更新配料属性上下架状态（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/shelf/premium/update",
    businessId = 51,
    apiVersion = "10013",
    apiName = "update_premium_shelf_status",
    needAuth = true
)
public class UpdatePremiumShelfStatusRequest implements MeituanRequest<UpdatePremiumShelfStatusResponse> {
    /**
    * <p data-diff-id="ct-diff-id-f39c7e69-9bf5-4134-a802-5247d2973ebe">更新范围</p><ul data-diff-id="ct-diff-id-5cb07128-33ea-49a5-a7ec-474b726e19af"><li data-list-item-diff-id="ct-list-item-diff-id-16f9794a-4eb0-407c-be12-36c7cc56c21a"><p data-diff-id="ct-diff-id-3dd23648-0d51-4a71-8cbb-2c61c1d2f225">0：全国</p></li><li data-list-item-diff-id="ct-list-item-diff-id-96e2ece7-1b31-40eb-a4e2-3f6abbae8144"><p data-diff-id="ct-diff-id-9310d9a5-7516-43a5-b88c-ccb728e9acc6">1：门店</p></li></ul>
    */
    @NotNull(message = "scope不能为空")
    @SerializedName("scope")
    private Integer scope;
    /**
    * <p data-diff-id="ct-diff-id-69a7f7d1-4f17-4d82-9b91-8c97f1a018aa">门店 id 列表</p><ol data-diff-id="ct-diff-id-0a3ef139-3a5c-4c17-a094-344b5208d78c"><li data-list-item-diff-id="ct-list-item-diff-id-1a90037b-7808-43d5-b38c-b60f03328103"><p data-diff-id="ct-diff-id-2fd314ff-a074-4c07-88f1-2c19b7519901">premiumScope == 1 时必传vendorShopIdList.get(0)是 门店配料对应门店</p></li><li data-list-item-diff-id="ct-list-item-diff-id-7a4c3f17-bcc5-4cdf-8686-8c95cefbb314"><p data-diff-id="ct-diff-id-306957d6-0fc8-4f6b-86cb-4bf048168863">premiumScope == 0</p><ol data-diff-id="ct-diff-id-3c34ef11-5a83-4b92-8c2e-9a28dddfcd9a"><li data-list-item-diff-id="ct-list-item-diff-id-568cd598-1d1b-477a-ac6c-57667db12278"><p data-diff-id="ct-diff-id-d8315ca6-9ca4-42e5-90f7-124a743aff91"><span style="color: ">scope == 1 时必传</span></p><p data-diff-id="ct-diff-id-5a99576e-02d4-4026-9c00-832e8088eadf"><span style="color: ">最多 15 个，所有 vendorShopId 都在美团侧存在映射，若存在无映射 vendorShopId，失败并在错误信息中返回无映射 vendorShopId</span></p></li></ol></li></ol>
    */
    @SerializedName("vendorShopIdList")
    private List<String> vendorShopIdList;
    /**
    * <p data-diff-id="ct-diff-id-da17fa03-95de-426a-a208-66ab41ed040c">配料 code 列表</p><p data-diff-id="ct-diff-id-dcfacf6f-8654-436f-b0da-639dc2ebdf05">最多 50 个</p>
    */
    @NotEmpty(message = "premiumCodeList不能为空")
    @SerializedName("premiumCodeList")
    private List<String> premiumCodeList;
    /**
    * <p data-diff-id="ct-diff-id-0e8a9913-9a10-45cc-8b0f-63cf725f1943">上下架状态</p><ul data-diff-id="ct-diff-id-478c579e-0523-44cc-94d7-12352e50f5b9"><li data-list-item-diff-id="ct-list-item-diff-id-79995440-d393-49d5-b2d2-aea0f104b899"><p data-diff-id="ct-diff-id-2e65c48b-a3df-4dfa-8367-89d2a5143cc9">0：下架</p></li><li data-list-item-diff-id="ct-list-item-diff-id-11123e67-bdbc-4b45-bfb6-55ec2b15352b"><p data-diff-id="ct-diff-id-2c6caea8-e45f-4567-a986-d22d66d4a168">1：上架</p></li></ul>
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * <p data-diff-id="ct-diff-id-a01a4aa1-3373-4802-bb01-4eafe9910531">0：品牌配料</p><p data-diff-id="ct-diff-id-17ea80c5-a567-4768-a4ec-de1be75df27c">1：门店配料</p><p data-diff-id="ct-diff-id-3318b357-5320-43ba-bfc2-4a7b73d0f6e4">默认品牌配料</p>
    */
    @SerializedName("premiumScope")
    private Integer premiumScope;

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
    public List<String> getPremiumCodeList() {
        return premiumCodeList;
    }
    public void setPremiumCodeList(List<String> premiumCodeList) {
        this.premiumCodeList = premiumCodeList;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public Integer getPremiumScope() {
        return premiumScope;
    }
    public void setPremiumScope(Integer premiumScope) {
        this.premiumScope = premiumScope;
    }


    @Override
    public MeituanResponse<UpdatePremiumShelfStatusResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<UpdatePremiumShelfStatusResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "UpdatePremiumShelfStatusRequest{" + "scope=" + scope + "," + "vendorShopIdList=" + vendorShopIdList + "," + "premiumCodeList=" + premiumCodeList + "," + "shelfStatus=" + shelfStatus + "," + "premiumScope=" + premiumScope + "}";
    }
}
