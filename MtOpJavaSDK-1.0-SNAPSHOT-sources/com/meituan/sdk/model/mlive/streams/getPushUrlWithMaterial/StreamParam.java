package com.meituan.sdk.model.mlive.streams.getPushUrlWithMaterial;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-f85b6f13-7e09-4815-a45b-f8772fb6e2b2"><span style="color: rgb(51, 51, 51)">必传，直播推流相关参数</span></p>
* This file was automatically generated.
*/
public class StreamParam {
    /**
    * <p data-diff-id="ct-diff-id-9839d61a-f6ec-41e0-b84e-305ab2196d0e"><span style="color: rgb(51, 51, 51)">直播模组，0-正式直播，1-测试直播（美团直播助手创建测试直播，仅分享用户可见）</span></p><p data-diff-id="ct-diff-id-5d5e78af-5046-43e0-a65b-c19aaac3544c"><span style="color: rgb(51, 51, 51)">必传，建议传0</span></p>
    */
    @SerializedName("liveModel")
    private Long liveModel;
    /**
    * <p data-diff-id="ct-diff-id-c9a03678-5847-460f-8060-5b3e8c063480"><span style="color: rgb(51, 51, 51)">非必传，用户设备id</span></p>
    */
    @SerializedName("deviceId")
    private String deviceId;

    public Long getLiveModel() {
        return liveModel;
    }
    public void setLiveModel(Long liveModel) {
        this.liveModel = liveModel;
    }
    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }




    @Override
    public String toString() {
        return "StreamParam{" + "liveModel=" + liveModel + "," + "deviceId=" + deviceId + "}";
    }
}
