package com.meituan.sdk.model.dcps.print.updatePrinterStatus;

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
* 4.1.1.三方云打印机状态（绑定解绑）回传
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/print/printer/status/update",
    businessId = 46,
    apiVersion = "10000",
    apiName = "update_printer_status",
    needAuth = true
)
public class UpdatePrinterStatusRequest implements MeituanRequest<UpdatePrinterStatusResponse> {
    /**
    * <p data-diff-id="ct-diff-id-33ec9344-9d25-4afe-81ec-d7f79b870365"><span style="color: rgb(106, 135, 89)">加密门店id</span></p>
    */
    @NotBlank(message = "opBizCode不能为空")
    @SerializedName("opBizCode")
    private String opBizCode;
    /**
    * <p data-diff-id="ct-diff-id-7e99b0a8-3120-4516-a05d-251e30a7adc9"><span style="color: rgb(106, 135, 89)">设备号（sn码）</span></p>
    */
    @NotBlank(message = "deviceNumber不能为空")
    @SerializedName("deviceNumber")
    private String deviceNumber;
    /**
    * <p data-diff-id="ct-diff-id-61b9da51-5c66-47a0-82f3-6caef8de9693"><span style="color: rgb(106, 135, 89)">绑定状态。0解绑；1绑定</span></p>
    */
    @NotNull(message = "bindStatus不能为空")
    @SerializedName("bindStatus")
    private Integer bindStatus;
    /**
    * <p data-diff-id="ct-diff-id-9b56e430-655a-45c0-8bb3-49203e97ce6a"><span style="color: rgb(106, 135, 89)">打印机备注名称</span></p>
    */
    @NotBlank(message = "note不能为空")
    @SerializedName("note")
    private String note;
    /**
    * <p data-diff-id="ct-diff-id-3eefd7e2-8cab-431c-89cf-ff771b146ab9"><span style="color: rgb(106, 135, 89)">打印机服务商类型</span></p>
    */
    @NotNull(message = "printerMerchantType不能为空")
    @SerializedName("printerMerchantType")
    private Integer printerMerchantType;
    /**
    * <p data-diff-id="ct-diff-id-cd719797-a155-494e-b560-479ce0282853"><span style="color: rgb(106, 135, 89)">打印机型号</span></p>
    */
    @NotBlank(message = "model不能为空")
    @SerializedName("model")
    private String model;
    /**
    * <p data-diff-id="ct-diff-id-2bc62a59-4e3d-4fc6-9525-4b19fa257785"><span style="color: rgb(106, 135, 89)">更新时间戳</span></p>
    */
    @NotNull(message = "updateTime不能为空")
    @SerializedName("updateTime")
    private Long updateTime;

    public String getOpBizCode() {
        return opBizCode;
    }
    public void setOpBizCode(String opBizCode) {
        this.opBizCode = opBizCode;
    }
    public String getDeviceNumber() {
        return deviceNumber;
    }
    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }
    public Integer getBindStatus() {
        return bindStatus;
    }
    public void setBindStatus(Integer bindStatus) {
        this.bindStatus = bindStatus;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public Integer getPrinterMerchantType() {
        return printerMerchantType;
    }
    public void setPrinterMerchantType(Integer printerMerchantType) {
        this.printerMerchantType = printerMerchantType;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Long getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public MeituanResponse<UpdatePrinterStatusResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<UpdatePrinterStatusResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "UpdatePrinterStatusRequest{" + "opBizCode=" + opBizCode + "," + "deviceNumber=" + deviceNumber + "," + "bindStatus=" + bindStatus + "," + "note=" + note + "," + "printerMerchantType=" + printerMerchantType + "," + "model=" + model + "," + "updateTime=" + updateTime + "}";
    }
}
