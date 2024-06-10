package com.meituan.sdk.model.foodmop.sku.updateSaleAttributeShelfStatus;

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
* 更新售卖属性上下架状态（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/diancannew/shelf/saleattr/update",
    businessId = 51,
    apiVersion = "10013",
    apiName = "update_sale_attribute_shelf_status",
    needAuth = true
)
public class UpdateSaleAttributeShelfStatusRequest implements MeituanRequest<UpdateSaleAttributeShelfStatusResponse> {
    /**
    * <p data-diff-id="ct-diff-id-933940c2-4a01-4a67-a590-a51bac9eadc5">更新范围</p><ul data-diff-id="ct-diff-id-6034d2bf-450a-4ab0-a186-816cb52a83d6"><li data-list-item-diff-id="ct-list-item-diff-id-a1204a01-dcf5-4e7c-8d37-1f85306827e3"><p data-diff-id="ct-diff-id-0956c892-655b-433e-9fa0-ae807da74a0d">0：全国</p></li><li data-list-item-diff-id="ct-list-item-diff-id-252a6e7b-abb2-47fa-bb18-c795e43f2c97"><p data-diff-id="ct-diff-id-229f4758-9949-4a38-9004-64eecc9009a9">1：门店</p></li></ul>
    */
    @NotNull(message = "scope不能为空")
    @SerializedName("scope")
    private Integer scope;
    /**
    * <p data-diff-id="ct-diff-id-1760324e-280a-4ed1-a879-ca2c01c9dc7b">门店 id 列表</p><ol data-diff-id="ct-diff-id-685055bf-03d0-45de-a7b8-fa66e4e65208"><li data-list-item-diff-id="ct-list-item-diff-id-390c1d7a-9df5-4a8b-b655-1f238030f63f"><p data-diff-id="ct-diff-id-45a90d74-4a03-45e5-97ea-fc57ea95a9c0">saleAttributeScope == 1 时必传vendorShopIdList.get(0)是 门店售卖属性对应门店</p></li><li data-list-item-diff-id="ct-list-item-diff-id-6a33e814-05f8-4771-9d72-5c540cacfe87"><p data-diff-id="ct-diff-id-7fbb7516-666d-447a-9671-7f98fb73886a">saleAttributeScope == 0</p><p data-diff-id="ct-diff-id-008c8dd1-ca8d-4b63-a514-7052044d2c47">scope == 1 时必传</p><p data-diff-id="ct-diff-id-521d2490-107e-4041-98b4-a463ff7af073">最多 15 个，所有 vendorShopId 都在美团侧存在映射，若存在无映射 vendorShopId，失败并在错误信息中返回无映射 vendorShopI</p></li></ol><p data-diff-id="ct-diff-id-4204bf44-5fd3-4495-b37c-458ed1cf726c"></p>
    */
    @SerializedName("vendorShopIdList")
    private List<String> vendorShopIdList;
    /**
    * <p data-diff-id="ct-diff-id-1b388f06-5e08-47f1-ab8b-53f4cca56f15">售卖属性 code 列表</p><p data-diff-id="ct-diff-id-a5ddbcd2-0be8-4bba-81c0-6c86b219891b"><span style="color: ">最多 50 个</span></p>
    */
    @NotEmpty(message = "saleAttributeCodeList不能为空")
    @SerializedName("saleAttributeCodeList")
    private List<String> saleAttributeCodeList;
    /**
    * <p data-diff-id="ct-diff-id-f02a4e8a-d2e5-4da2-92d1-d2f7c23555c4">上下架状态</p><ul data-diff-id="ct-diff-id-ac244e7a-742f-4eb1-be7b-b04ba8c5df9a"><li data-list-item-diff-id="ct-list-item-diff-id-75109f52-2df8-48e3-8fc0-dd0df34ab8f7"><p data-diff-id="ct-diff-id-4794f140-ea9f-481e-96ee-6e4d29e35c0c">0：下架</p></li><li data-list-item-diff-id="ct-list-item-diff-id-cbaef8e0-e49b-4b97-9ebc-13deaba21793"><p data-diff-id="ct-diff-id-9f2c14c3-5f65-4c57-aa6e-765a58867209">1：上架</p></li></ul>
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * <p data-diff-id="ct-diff-id-307bdacf-e058-4390-a03c-fe95ee5b176d">0：品牌售卖属性</p><p data-diff-id="ct-diff-id-d3167006-a816-47fd-b3aa-5c565225c0db">1：门店售卖属性</p><p data-diff-id="ct-diff-id-10dfe1b1-2ba4-4aa0-b65e-1e401a55baf4">默认品牌配料。</p>
    */
    @SerializedName("saleAttributeScope")
    private Integer saleAttributeScope;

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
    public List<String> getSaleAttributeCodeList() {
        return saleAttributeCodeList;
    }
    public void setSaleAttributeCodeList(List<String> saleAttributeCodeList) {
        this.saleAttributeCodeList = saleAttributeCodeList;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public Integer getSaleAttributeScope() {
        return saleAttributeScope;
    }
    public void setSaleAttributeScope(Integer saleAttributeScope) {
        this.saleAttributeScope = saleAttributeScope;
    }


    @Override
    public MeituanResponse<UpdateSaleAttributeShelfStatusResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<UpdateSaleAttributeShelfStatusResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "UpdateSaleAttributeShelfStatusRequest{" + "scope=" + scope + "," + "vendorShopIdList=" + vendorShopIdList + "," + "saleAttributeCodeList=" + saleAttributeCodeList + "," + "shelfStatus=" + shelfStatus + "," + "saleAttributeScope=" + saleAttributeScope + "}";
    }
}
