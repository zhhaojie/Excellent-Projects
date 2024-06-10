package com.meituan.sdk.model.peisong.order.mealCodeSave;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 取餐码信息下发
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/mealCode/saveMealCodeByPkgId",
    businessId = 19,
    apiVersion = "10016",
    apiName = "meal_code_save",
    needAuth = true
)
public class MealCodeSaveRequest implements MeituanRequest<Void> {
    /**
    * 美团配送内部订单id，最长不超过32个字符
    */
    @NotBlank(message = "mtPeisongId不能为空")
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * <p>取餐码业务详情信息，内容为JSON格式，示例如下：</p><p><font style="font-size:14px;line-height:22px" data-size="14">{ "type": 0, "cabinetNum": "xxxxxx", "cabinetDoor": "xxxxx,xxxxx", "cabinetCode": "xxxxxx" }</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">type：取餐类型，int类型，包含0（存餐及更新）、1（撤餐），必填且必须为0或1；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">cabinetNum：柜号，String类型，最长不超过100字符，非必填，同步撤餐状态时可为空，若存在多个时可以逗号隔开；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">cabinetDoor：门号（取餐柜的格口号），String类型，最长不超过100字符，必填，同步撤餐状态时可为空，若存在多个时可以逗号隔开；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">cabinetCode：取餐码，String类型，最长不超过12个字符，必填，同步撤餐状态时可为空，一个配送订单对应一个取餐码；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">取餐码信息会同步到骑手侧展示并将取餐码转换为二维码展示。</font></p>
    */
    @NotBlank(message = "infos不能为空")
    @SerializedName("infos")
    private String infos;

    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public String getInfos() {
        return infos;
    }
    public void setInfos(String infos) {
        this.infos = infos;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "MealCodeSaveRequest{" + "mtPeisongId=" + mtPeisongId + "," + "infos=" + infos + "}";
    }
}
