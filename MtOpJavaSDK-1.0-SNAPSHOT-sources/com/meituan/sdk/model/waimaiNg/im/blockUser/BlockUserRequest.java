package com.meituan.sdk.model.waimaiNg.im.blockUser;

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
* 商家屏蔽顾客
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/blockUser",
    businessId = 2,
    apiVersion = "10020",
    apiName = "block_user",
    needAuth = true
)
public class BlockUserRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">用户id</font></span></p>
    */
    @NotBlank(message = "openUserId不能为空")
    @SerializedName("open_user_id")
    private String openUserId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">屏蔽类型，1：骚扰、辱骂我，言辞恶劣，2：让我加微信又不下单，疑似诈骗，3：其他</font></span></p>
    */
    @NotNull(message = "blockCode不能为空")
    @SerializedName("block_code")
    private Long blockCode;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">屏蔽原因，当屏蔽类型为「其他」时该值必填</font></span></p>
    */
    @SerializedName("block_reason_desc")
    private String blockReasonDesc;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">照片id，以，分割，最少1张，最多9张，通过图片上传接口获取图片id</font></span></p>
    */
    @NotBlank(message = "voucherPicIds不能为空")
    @SerializedName("voucher_pic_ids")
    private String voucherPicIds;

    public String getOpenUserId() {
        return openUserId;
    }
    public void setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
    }
    public Long getBlockCode() {
        return blockCode;
    }
    public void setBlockCode(Long blockCode) {
        this.blockCode = blockCode;
    }
    public String getBlockReasonDesc() {
        return blockReasonDesc;
    }
    public void setBlockReasonDesc(String blockReasonDesc) {
        this.blockReasonDesc = blockReasonDesc;
    }
    public String getVoucherPicIds() {
        return voucherPicIds;
    }
    public void setVoucherPicIds(String voucherPicIds) {
        this.voucherPicIds = voucherPicIds;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BlockUserRequest{" + "openUserId=" + openUserId + "," + "blockCode=" + blockCode + "," + "blockReasonDesc=" + blockReasonDesc + "," + "voucherPicIds=" + voucherPicIds + "}";
    }
}
