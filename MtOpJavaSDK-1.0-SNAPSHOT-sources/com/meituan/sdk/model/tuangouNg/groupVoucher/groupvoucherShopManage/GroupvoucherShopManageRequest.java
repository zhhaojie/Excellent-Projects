package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherShopManage;

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
* 开通/关闭代金券买单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/ng/group_voucher/shop/manage",
    businessId = 1,
    apiVersion = "10003",
    apiName = "groupvoucher_shop_manage",
    needAuth = true
)
public class GroupvoucherShopManageRequest implements MeituanRequest<GroupvoucherShopManageResponse> {
    /**
    * <p data-diff-id="ct-diff-id-f7872e63-eee5-44f9-8593-1348328f5411">开通状态:1开通2关闭</p>
    */
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Integer status;
    /**
    * <p data-diff-id="ct-diff-id-e0490528-44cb-459d-9ff9-ec9aae105894">厂商管理员账号id</p>
    */
    @NotBlank(message = "vendorShopAdminId不能为空")
    @SerializedName("vendorShopAdminId")
    private String vendorShopAdminId;

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getVendorShopAdminId() {
        return vendorShopAdminId;
    }
    public void setVendorShopAdminId(String vendorShopAdminId) {
        this.vendorShopAdminId = vendorShopAdminId;
    }


    @Override
    public MeituanResponse<GroupvoucherShopManageResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupvoucherShopManageResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupvoucherShopManageRequest{" + "status=" + status + "," + "vendorShopAdminId=" + vendorShopAdminId + "}";
    }
}
