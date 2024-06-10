package com.meituan.sdk.model.waimaiNg.decoration.productsQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台商品查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/decoration/productsQuery",
    businessId = 2,
    apiVersion = "10001",
    apiName = "products_query",
    needAuth = false
)
public class ProductsQueryRequest implements MeituanRequest<ProductsQueryResponse> {
    /**
    * <p>场景类型： 1.海报 2.老板推荐</p>
    */
    @NotNull(message = "scene不能为空")
    @SerializedName("scene")
    private Integer scene;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">页码,默认-1</font></span></p>
    */
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * <p>每页展示数</p>
    */
    @SerializedName("pageSize")
    private Integer pageSize;

    public Integer getScene() {
        return scene;
    }
    public void setScene(Integer scene) {
        this.scene = scene;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public MeituanResponse<ProductsQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ProductsQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ProductsQueryRequest{" + "scene=" + scene + "," + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "}";
    }
}
