package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderRelate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 代金券买单信息与厂商收银订单（或者收银键位）关联
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/ng/group_voucher/order/relate",
    businessId = 1,
    apiVersion = "10005",
    apiName = "groupvoucher_order_relate",
    needAuth = true
)
public class GroupvoucherOrderRelateRequest implements MeituanRequest<GroupvoucherOrderRelateResponse> {
    /**
    * <p data-diff-id="ct-diff-id-72e4ba12-6668-4823-ad52-f61008cc1de8">是否关联厂商订单,true关联false不关联</p>
    */
    @NotNull(message = "isRelate不能为空")
    @SerializedName("isRelate")
    private Boolean isRelate;
    /**
    * <p data-diff-id="ct-diff-id-f60c616d-4fa3-4d06-9556-f7be62584cce">用户或开店宝展示的订单ID</p>
    */
    @NotBlank(message = "serialNumber不能为空")
    @SerializedName("serialNumber")
    private String serialNumber;
    /**
    * <p data-diff-id="ct-diff-id-1e42ee4c-325f-4afc-acd3-1c9237291169">订单ID</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p data-diff-id="ct-diff-id-6a89a925-f992-4b18-a66f-70780a158c19">厂商管理员账号id</p>
    */
    @NotBlank(message = "vendorShopAdminId不能为空")
    @SerializedName("vendorShopAdminId")
    private String vendorShopAdminId;
    /**
    * <p data-diff-id="ct-diff-id-afd3a5cd-9d7e-45ec-ab74-c0570b44ec3e">厂商桌台号</p>
    */
    @NotBlank(message = "tableNo不能为空")
    @SerializedName("tableNo")
    private String tableNo;
    /**
    * <p data-diff-id="ct-diff-id-69e84034-d8ea-47a3-bdc4-bbfdfd014e1b">厂商订单号</p>
    */
    @NotBlank(message = "vendorOrderId不能为空")
    @SerializedName("vendorOrderId")
    private String vendorOrderId;

    public Boolean getIsRelate() {
        return isRelate;
    }
    public void setIsRelate(Boolean isRelate) {
        this.isRelate = isRelate;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getVendorShopAdminId() {
        return vendorShopAdminId;
    }
    public void setVendorShopAdminId(String vendorShopAdminId) {
        this.vendorShopAdminId = vendorShopAdminId;
    }
    public String getTableNo() {
        return tableNo;
    }
    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }
    public String getVendorOrderId() {
        return vendorOrderId;
    }
    public void setVendorOrderId(String vendorOrderId) {
        this.vendorOrderId = vendorOrderId;
    }


    @Override
    public MeituanResponse<GroupvoucherOrderRelateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupvoucherOrderRelateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupvoucherOrderRelateRequest{" + "isRelate=" + isRelate + "," + "serialNumber=" + serialNumber + "," + "orderId=" + orderId + "," + "vendorShopAdminId=" + vendorShopAdminId + "," + "tableNo=" + tableNo + "," + "vendorOrderId=" + vendorOrderId + "}";
    }
}
