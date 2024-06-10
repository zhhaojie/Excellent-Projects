package com.meituan.sdk.model.foodmop.sku.create;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-eea80d59-14f4-4a7c-be58-d1f41ecd6e10">商品配料属性组列表</p><p data-diff-id="ct-diff-id-55543c03-4d27-4191-85dc-5961bec9c5f1">若商品没有配料，则不填</p><p data-diff-id="ct-diff-id-dc641e66-7a15-4f87-b4b2-3887b45f785f">配料组中关联的售卖属性必须通过创建或更新配料属性前置同步至美团</p>
* This file was automatically generated.
*/
public class VendorSpuPremiumGroupDTO {
    /**
    * <p data-diff-id="ct-diff-id-8219d02d-1a6e-4809-bb7d-b7a1c83fa36b">配料组基本信息</p>
    */
    @NotNull(message = "spuPremiumGroupBasic不能为空")
    @SerializedName("spuPremiumGroupBasic")
    private SpuPremiumGroupBasicDTO spuPremiumGroupBasic;
    /**
    * <p data-diff-id="ct-diff-id-9daf16d9-3111-4566-96e3-fddf96691a88">配料组关联的配料</p><p data-diff-id="ct-diff-id-440e8b48-a756-40b5-b3e4-85f1496d2512"><span style="color: ">      Map&lt;Integer,String&gt;</span></p><ul data-diff-id="ct-diff-id-0e33f582-ed0d-4f8b-b197-5a115f6070b5"><li data-list-item-diff-id="ct-list-item-diff-id-010bef1b-3c51-4230-83ae-2335100df824"><p data-diff-id="ct-diff-id-f9f9004f-f1be-45f9-a550-ba1038ce531b">key：配料于组中的展示顺序</p></li><li data-list-item-diff-id="ct-list-item-diff-id-346ef496-3fd1-4208-86e3-f6b46dcb2495"><p data-diff-id="ct-diff-id-b8445ab7-1019-473e-b14f-93b9e3486b6e">value：配料 code</p></li></ul><p data-diff-id="ct-diff-id-878bd779-f59c-495e-beed-9d5de710485a">不为空，属性值 code 必须对应于配料属性编码，code 不能重复</p>
    */
    @NotNull(message = "vendorSpuPremiumCodeMap不能为空")
    @SerializedName("vendorSpuPremiumCodeMap")
    private Map vendorSpuPremiumCodeMap;
    /**
    * <p data-diff-id="ct-diff-id-88f248f8-b5c5-476b-915f-1abf1b70529d">若配料组之间具有父子层级，则需要配置配料组对应的父配料 code</p><p data-diff-id="ct-diff-id-f10da745-1a22-415e-8bcd-024af3f9863c">例如星巴克品牌中，配料「低因」下挂子配料性组【萃取方式】，那么【萃取方式】组的 parentPremiumCode 为「低因」的属性值编码</p><p data-diff-id="ct-diff-id-da947ea5-eb5e-4d18-b3e3-936f49b786d7">一般品牌不需要关注此字段，不填即可</p><p data-diff-id="ct-diff-id-173331c9-5a62-4eab-8312-c5a870ff86ef">属性值 code 必须对应于配料属性编码</p>
    */
    @SerializedName("parentPremiumCode")
    private String parentPremiumCode;

    public SpuPremiumGroupBasicDTO getSpuPremiumGroupBasic() {
        return spuPremiumGroupBasic;
    }
    public void setSpuPremiumGroupBasic(SpuPremiumGroupBasicDTO spuPremiumGroupBasic) {
        this.spuPremiumGroupBasic = spuPremiumGroupBasic;
    }
    public Map getVendorSpuPremiumCodeMap() {
        return vendorSpuPremiumCodeMap;
    }
    public void setVendorSpuPremiumCodeMap(Map vendorSpuPremiumCodeMap) {
        this.vendorSpuPremiumCodeMap = vendorSpuPremiumCodeMap;
    }
    public String getParentPremiumCode() {
        return parentPremiumCode;
    }
    public void setParentPremiumCode(String parentPremiumCode) {
        this.parentPremiumCode = parentPremiumCode;
    }




    @Override
    public String toString() {
        return "VendorSpuPremiumGroupDTO{" + "spuPremiumGroupBasic=" + spuPremiumGroupBasic + "," + "vendorSpuPremiumCodeMap=" + vendorSpuPremiumCodeMap + "," + "parentPremiumCode=" + parentPremiumCode + "}";
    }
}
