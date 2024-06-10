package com.meituan.sdk.model.foodmop.shop.reserveConfigUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-d223544c-7456-4739-aa18-3cb341b28afb">厂商配置列表，批量限制20</p>
* This file was automatically generated.
*/
public class VendorReserveConfigRequest {
    /**
    * <p data-diff-id="ct-diff-id-e6c75bf9-eda9-4ce7-aa53-878941fd0e3b">厂商门店ID</p>
    */
    @NotBlank(message = "vendorShopId不能为空")
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-adcf23ee-4f6e-4dd5-b24e-3685a71009c4">是否支持预约：</p><p data-diff-id="ct-diff-id-cd6c0f86-d5f1-44dd-9042-a6f1945ae903">TRUE- 支持预约</p><p data-diff-id="ct-diff-id-fd1825fc-f999-469f-89d0-7be2798e954d">FALSE- 不支持预约</p>
    */
    @SerializedName("mopReserveOpen")
    private Boolean mopReserveOpen;
    /**
    * <p data-diff-id="ct-diff-id-3711116a-c94d-4f48-9fb4-d9b9e41d399d">mopReserveOpen为true时必填<br>mopReserveOpen为true时必填</p><p data-diff-id="ct-diff-id-d8c47b5a-7011-4c89-82b4-15c769ebef36">线上点可预约时间</p><p data-diff-id="ct-diff-id-a200d9ea-19d3-4eb2-91d2-998317d4c89e">{</p><p data-diff-id="ct-diff-id-408963d2-57f6-454b-977b-75d784db1745">"1"://周一,DayofWeek</p><p data-diff-id="ct-diff-id-9e2eee48-3e80-4f29-9544-9e4c175afca5">[{</p><p data-diff-id="ct-diff-id-093718e1-662e-4bac-a7eb-101d0a3ae0c8">"startTime":"08:00", //Time</p><p data-diff-id="ct-diff-id-b71a23a5-9277-4de2-ade2-d7ab2b404a4a">"endTime":"12:00"</p><p data-diff-id="ct-diff-id-b67d65f2-4347-47e2-8f02-6b2ac658a3b5">}],</p><p data-diff-id="ct-diff-id-a9e53c6a-87a5-46b7-a2d9-0d76bedfc1e6">"2"://周二</p><p data-diff-id="ct-diff-id-4868156d-9543-440f-be90-2894c3c0d5d9">[{</p><p data-diff-id="ct-diff-id-03dc963e-5270-4014-88ea-290e5c8e3092">"startTime":"08:00",</p><p data-diff-id="ct-diff-id-8bfd42a9-d4ac-4151-a8bf-57b8fa0a9033">"endTime":"18:00"</p><p data-diff-id="ct-diff-id-d959aa8d-a493-48a8-983e-452091bf9bc4">}]</p><p data-diff-id="ct-diff-id-5e0352b6-5199-4e7c-80ed-12cb76007eb0">}</p>
    */
    @SerializedName("mopReserveHour")
    private MopReserveHour mopReserveHour;
    /**
    * <p data-diff-id="ct-diff-id-b9f831ef-ea19-4f11-9dd7-02090940d238">mopReserveOpen为true时必填</p><p data-diff-id="ct-diff-id-a50abf63-a107-4f64-a4f8-17c37f91c79f">预约周期（单位分钟），用户预约选择时间的间隔</p><p data-diff-id="ct-diff-id-e644af0c-27b5-4de9-9e47-5246a56c5126">eg：配置5min，则每小时的0,5,10, ...</p><p data-diff-id="ct-diff-id-30f08f84-310c-47a3-907b-dfc622217d20">eg：配置7min，则每小时的0,7,14,...</p>
    */
    @SerializedName("mopReservePeriod")
    private Integer mopReservePeriod;
    /**
    * <p data-diff-id="ct-diff-id-b511944d-1f01-4e82-96be-1fe910517116">mopReserveOpen为true时必填</p><p data-diff-id="ct-diff-id-0681284e-afb2-461a-8a8e-d39dbb464aef">距离现在的最早可预约时间分钟数（单位分钟）</p>
    */
    @SerializedName("earliesReserveTimeFromNowByMinutes")
    private Integer earliesReserveTimeFromNowByMinutes;
    /**
    * <p data-diff-id="ct-diff-id-023821e3-071c-4471-87d0-b27d99477047">距离现在的最晚可预约时间分钟数（单位分钟）</p>
    */
    @SerializedName("latestReserveTimeFromNowByMinutes")
    private Integer latestReserveTimeFromNowByMinutes;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public Boolean getMopReserveOpen() {
        return mopReserveOpen;
    }
    public void setMopReserveOpen(Boolean mopReserveOpen) {
        this.mopReserveOpen = mopReserveOpen;
    }
    public MopReserveHour getMopReserveHour() {
        return mopReserveHour;
    }
    public void setMopReserveHour(MopReserveHour mopReserveHour) {
        this.mopReserveHour = mopReserveHour;
    }
    public Integer getMopReservePeriod() {
        return mopReservePeriod;
    }
    public void setMopReservePeriod(Integer mopReservePeriod) {
        this.mopReservePeriod = mopReservePeriod;
    }
    public Integer getEarliesReserveTimeFromNowByMinutes() {
        return earliesReserveTimeFromNowByMinutes;
    }
    public void setEarliesReserveTimeFromNowByMinutes(Integer earliesReserveTimeFromNowByMinutes) {
        this.earliesReserveTimeFromNowByMinutes = earliesReserveTimeFromNowByMinutes;
    }
    public Integer getLatestReserveTimeFromNowByMinutes() {
        return latestReserveTimeFromNowByMinutes;
    }
    public void setLatestReserveTimeFromNowByMinutes(Integer latestReserveTimeFromNowByMinutes) {
        this.latestReserveTimeFromNowByMinutes = latestReserveTimeFromNowByMinutes;
    }




    @Override
    public String toString() {
        return "VendorReserveConfigRequest{" + "vendorShopId=" + vendorShopId + "," + "mopReserveOpen=" + mopReserveOpen + "," + "mopReserveHour=" + mopReserveHour + "," + "mopReservePeriod=" + mopReservePeriod + "," + "earliesReserveTimeFromNowByMinutes=" + earliesReserveTimeFromNowByMinutes + "," + "latestReserveTimeFromNowByMinutes=" + latestReserveTimeFromNowByMinutes + "}";
    }
}
