package com.meituan.sdk.model.foodmop.shop.serveStatusUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-607d31a3-cf50-4700-89b2-5dacb2fd2ea8">厂商配置列表，单次请求批量限制20</p>
* This file was automatically generated.
*/
public class VendorServiceConfigRequest {
    /**
    * <p data-diff-id="ct-diff-id-b2e0661f-a356-4eea-8abb-dedf674b5b6a">厂商门店ID</p>
    */
    @NotBlank(message = "vendorShopId不能为空")
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-20e669d8-209c-4b7e-8adc-a249ecfacffc">线上点营业时间，需要提前约定好同步模式，支持天模式/周模式：</p><p data-diff-id="ct-diff-id-bbeda6b1-86eb-4536-b261-cb6e797f5628">天模式（key值为具体时间，仅支持更新未来7天内的营业时间）</p><p data-diff-id="ct-diff-id-bd9e0469-2761-42bc-945e-36f27102cafa">未来7天的营业时间</p><p data-diff-id="ct-diff-id-5701c3fb-8f36-4c2b-8f51-13e7b3be9e30"></p><p data-diff-id="ct-diff-id-f347531d-5ac0-40b6-ae47-f904c4fee313">{</p><p data-diff-id="ct-diff-id-9ffc0d3e-c738-4d8d-a1ff-7363090a0672"></p><p data-diff-id="ct-diff-id-d6dd8f1d-8b8f-4197-9015-2cade4321d79">"2021-12-01"://</p><p data-diff-id="ct-diff-id-9fb1eba6-bb92-41f9-b564-f814e24b37a4"></p><p data-diff-id="ct-diff-id-032a2e0a-26c4-4fae-af99-e50a84c6cecc">[{</p><p data-diff-id="ct-diff-id-ce8cb8e6-49ef-4ad0-9d64-3a21cf8f45fd"></p><p data-diff-id="ct-diff-id-ef008fe5-0c53-429a-ae94-ca7a47b97508">"startTime":"08:00", //Time</p><p data-diff-id="ct-diff-id-9d9a7488-1f23-4844-a4c4-c1a105fd32e9"></p><p data-diff-id="ct-diff-id-4b69f770-e10c-4fa5-966e-f4cf72e8aa2d">"endTime":"12:00"</p><p data-diff-id="ct-diff-id-3b80cd93-9f6a-46dc-b985-0546f5357b74"></p><p data-diff-id="ct-diff-id-f6acb8ac-5f9e-4e72-8154-adf87e452528">}],</p><p data-diff-id="ct-diff-id-eaf35fa5-1a4c-4b97-b877-2a6fe96d2b3c"></p><p data-diff-id="ct-diff-id-69d15444-cdd0-4f36-9a59-0e8aaa4e930c">"2021-12-02":[{</p><p data-diff-id="ct-diff-id-59c9b2c7-6423-4219-9ba6-1ce2772d36d5"></p><p data-diff-id="ct-diff-id-855d647d-a180-4aaa-be50-04ac88b53672">"startTime":"08:00",</p><p data-diff-id="ct-diff-id-1203e67e-e035-479f-8fc1-3dc06768f71a"></p><p data-diff-id="ct-diff-id-062f1bcc-7e1c-4591-98f5-cbbe3e6a503a">"endTime":"18:00"</p><p data-diff-id="ct-diff-id-23979404-d8c6-4d73-99bc-a65928c8fb5e"></p><p data-diff-id="ct-diff-id-cdcb4828-4fac-4c06-a7be-7e38be2fcc2f">}]</p><p data-diff-id="ct-diff-id-a3e068e2-5214-4d6a-8238-eec46a98e494"></p><p data-diff-id="ct-diff-id-99eb1c17-b74a-4d86-9bad-212ef4990b26">}</p><p data-diff-id="ct-diff-id-28df9544-23f8-4fdc-9c19-b243be5102f7"></p><p data-diff-id="ct-diff-id-a62ab8e0-2908-4e56-bc97-e2d0e66f0591">周模式（key值为星期几）</p><p data-diff-id="ct-diff-id-718ea58f-c8ed-4a69-960f-f017482fae85"></p><p data-diff-id="ct-diff-id-3df869b4-54be-430a-b22e-0efaac468b8a">{</p><p data-diff-id="ct-diff-id-5374c3d4-58f1-4a74-a007-515c0b88f077"></p><p data-diff-id="ct-diff-id-b816aa1f-e418-4f42-a700-adbbf1d217ee">"1"://</p><p data-diff-id="ct-diff-id-283886e1-680d-4908-b92a-f15229ac7e81"></p><p data-diff-id="ct-diff-id-9c60b237-f194-47e2-89b8-60263f2edda9">[{</p><p data-diff-id="ct-diff-id-4c79451e-12e1-41a4-811f-1c03b79d6791"></p><p data-diff-id="ct-diff-id-fbfbb1c0-420c-4421-88af-9a0eee5c1522">"startTime":"08:00", //Time</p><p data-diff-id="ct-diff-id-531c739e-abae-4124-bbea-f32c4dfe61ea"></p><p data-diff-id="ct-diff-id-c42f8366-9937-49e4-a4bb-42303abff0a3">"endTime":"12:00"</p><p data-diff-id="ct-diff-id-cd5b433f-19e9-4969-afe8-ac38ef92a6cd"></p><p data-diff-id="ct-diff-id-1af41394-d738-4370-a191-f20329e369c9">}],</p><p data-diff-id="ct-diff-id-945f7109-a7e1-4005-a560-b93c1dda5fc3"></p><p data-diff-id="ct-diff-id-4f0334ac-eb88-44d2-b248-21b37b84eed6">"2":[{</p><p data-diff-id="ct-diff-id-f10f050f-3fd9-441d-934f-a51b9c7ded27"></p><p data-diff-id="ct-diff-id-e4f6ae8d-4a45-4d02-bf6b-ccddf12f97f8">"startTime":"08:00",</p><p data-diff-id="ct-diff-id-43bd3dd4-ebbc-4ba1-a853-86a4b1f8886d"></p><p data-diff-id="ct-diff-id-ed1d0658-34ed-43a9-a270-1d5791c69ce3">"endTime":"18:00"</p><p data-diff-id="ct-diff-id-bcda1567-bccd-4c1e-a613-e9901ed9372d"></p><p data-diff-id="ct-diff-id-c3a14685-f829-481d-9354-a48970c7be89">}]</p><p data-diff-id="ct-diff-id-98cad85e-2a88-41e4-8043-599e818aa48e"></p><p data-diff-id="ct-diff-id-a68c395a-3d40-4110-8ffc-fdfd137324a7">...</p><p data-diff-id="ct-diff-id-a4b0fd37-b69f-40bb-85d2-9390f00210f5"></p><p data-diff-id="ct-diff-id-41f176ef-d187-4567-80fb-b3ed12dfd2a2">}</p>
    */
    @NotNull(message = "mopBusinessHour不能为空")
    @SerializedName("mopBusinessHour")
    private MopBusinessHour mopBusinessHour;
    /**
    * <p data-diff-id="ct-diff-id-f02680a3-7b37-450a-9657-7ce0202cac80">线上点服务开关，控制线上点菜单是否能用</p><p data-diff-id="ct-diff-id-01f199d9-dfc2-4922-a281-b35ff2f46b1a">10: 营业</p><p data-diff-id="ct-diff-id-19463e72-fb07-4e96-b650-16a2538235d6">20：歇业</p>
    */
    @NotNull(message = "vendorServiceOpen不能为空")
    @SerializedName("vendorServiceOpen")
    private Integer vendorServiceOpen;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public MopBusinessHour getMopBusinessHour() {
        return mopBusinessHour;
    }
    public void setMopBusinessHour(MopBusinessHour mopBusinessHour) {
        this.mopBusinessHour = mopBusinessHour;
    }
    public Integer getVendorServiceOpen() {
        return vendorServiceOpen;
    }
    public void setVendorServiceOpen(Integer vendorServiceOpen) {
        this.vendorServiceOpen = vendorServiceOpen;
    }




    @Override
    public String toString() {
        return "VendorServiceConfigRequest{" + "vendorShopId=" + vendorShopId + "," + "mopBusinessHour=" + mopBusinessHour + "," + "vendorServiceOpen=" + vendorServiceOpen + "}";
    }
}
