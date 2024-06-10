package com.meituan.sdk.model.mlive.streams.getPushUrlWithMaterial;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-4be1b55d-2931-41b2-a7f1-078aff38bdb6"><span style="color: rgb(51, 51, 51)">直播物料。</span></p><p data-diff-id="ct-diff-id-7f03ba5b-4477-469b-813a-40cea03b82e2"><span style="color: rgb(51, 51, 51)">同一个liveid首次必传，重复获取推流地址时，非必传</span></p>
* This file was automatically generated.
*/
public class LiveMateria {
    /**
    * <p data-diff-id="ct-diff-id-369061f5-038d-4c34-9348-183debf80f51">必传，生成类型，枚举如下：</p><p data-diff-id="ct-diff-id-891fce00-bb3e-49a8-83ab-5c7bf50a8117">1-模板，表示直播评论回复、口播等都是预先设置的，不能与用户交互；<br>2-开放式，表示都是实时生成的<br>3-表示枚举1、2的情况都有</p>
    */
    @SerializedName("generateType")
    private Long generateType;
    /**
    * <p data-diff-id="ct-diff-id-f5a14be7-088c-4e5e-9d13-6ad5aae2ec4b"><span style="color: ">非必传，数字人声音id</span><span style="color: rgba(0, 0, 0, 0.65)">（废弃字段，强烈建议改为使用voiceIds字段）</span></p>
    */
    @SerializedName("voiceId")
    private String voiceId;
    /**
    * <p data-diff-id="ct-diff-id-d4c763f5-6414-49d3-a972-e22bf5ae9e36">必传，与观众互动的方式，枚举如下：</p><p data-diff-id="ct-diff-id-3b537446-0950-4a06-906e-4e2a9edd41a5">1-语音交互，仅口播回复</p><p data-diff-id="ct-diff-id-54282805-a2e0-4b20-8595-7c3600af4bef">2-评论交互，仅评论回复</p><p data-diff-id="ct-diff-id-3fd75086-f8c2-470f-8daa-8bd12d7596e1">3-表示枚举1、2的情况都有</p>
    */
    @SerializedName("interactType")
    private Long interactType;
    /**
    * <p data-diff-id="ct-diff-id-a350ede7-e000-409c-95f8-c9a2edcd7031">必传，交互类型，表示是否与用户有互动，枚举如下：</p><p data-diff-id="ct-diff-id-49d399a9-bff9-4112-aae4-c142f9720e70">1-交互式，有交互</p><p data-diff-id="ct-diff-id-17e9cbe5-5d62-422b-a890-c17450784379">2-非交互，无交互</p>
    */
    @SerializedName("liveType")
    private Long liveType;
    /**
    * <p data-diff-id="ct-diff-id-eb5c79f1-a210-4f1a-8d31-11b40a6f8356">必传，预览图url，合成的数字人预览封面（包括形象、背景等配置），一般size=1</p><p data-diff-id="ct-diff-id-7a59bbbb-435b-4c26-92c3-86344bfaa492">非内网域名线下提前周知</p>
    */
    @SerializedName("previewLayouts")
    private List<String> previewLayouts;
    /**
    * <p data-diff-id="ct-diff-id-06288ae2-86ff-4cb2-9297-8c559a736b30">必传，预览视频url，合成的数字人1分钟预览视频，一般size=1</p><p data-diff-id="ct-diff-id-26dc42c0-e425-4d3f-9692-8a10808b792c">要求mp4格式</p><p data-diff-id="ct-diff-id-553b735c-16ab-4753-9653-23d38c230d3d">非内网域名线下提前周知</p>
    */
    @SerializedName("previewVideos")
    private List<String> previewVideos;
    /**
    * <p data-diff-id="ct-diff-id-4f631e9a-567a-475a-8f03-b03bad4976ac"><span style="color: rgb(51, 51, 51)">必传，商品列表</span></p>
    */
    @SerializedName("products")
    private List<ProductsSub> products;
    /**
    * <p data-diff-id="ct-diff-id-007dd70c-e341-4ab4-b7d0-c1dfd8f0b7c8"><span style="color: rgba(0, 0, 0, 0.65)">非必传，数字人形象id（废弃字段，强烈建议改为使用characterIds字段）</span></p>
    */
    @SerializedName("characterId")
    private String characterId;
    /**
    * <p data-diff-id="ct-diff-id-611efaab-a8fa-4f3c-bcda-ca32203248c5"><span style="color: rgba(0, 0, 0, 0.65)">必传，数字人形象id列表，单场直播使用的1~n个数字人形象</span></p>
    */
    @SerializedName("characterIds")
    private List<String> characterIds;
    /**
    * <p data-diff-id="ct-diff-id-596fcc3d-1f86-4049-8833-d6b220a7fb44"><span style="color: rgba(0, 0, 0, 0.65)">必传，数字人声音id列表，单场直播使用的1~n个数字人声音</span></p>
    */
    @SerializedName("voiceIds")
    private List<String> voiceIds;

    public Long getGenerateType() {
        return generateType;
    }
    public void setGenerateType(Long generateType) {
        this.generateType = generateType;
    }
    public String getVoiceId() {
        return voiceId;
    }
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }
    public Long getInteractType() {
        return interactType;
    }
    public void setInteractType(Long interactType) {
        this.interactType = interactType;
    }
    public Long getLiveType() {
        return liveType;
    }
    public void setLiveType(Long liveType) {
        this.liveType = liveType;
    }
    public List<String> getPreviewLayouts() {
        return previewLayouts;
    }
    public void setPreviewLayouts(List<String> previewLayouts) {
        this.previewLayouts = previewLayouts;
    }
    public List<String> getPreviewVideos() {
        return previewVideos;
    }
    public void setPreviewVideos(List<String> previewVideos) {
        this.previewVideos = previewVideos;
    }
    public List<ProductsSub> getProducts() {
        return products;
    }
    public void setProducts(List<ProductsSub> products) {
        this.products = products;
    }
    public String getCharacterId() {
        return characterId;
    }
    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }
    public List<String> getCharacterIds() {
        return characterIds;
    }
    public void setCharacterIds(List<String> characterIds) {
        this.characterIds = characterIds;
    }
    public List<String> getVoiceIds() {
        return voiceIds;
    }
    public void setVoiceIds(List<String> voiceIds) {
        this.voiceIds = voiceIds;
    }




    @Override
    public String toString() {
        return "LiveMateria{" + "generateType=" + generateType + "," + "voiceId=" + voiceId + "," + "interactType=" + interactType + "," + "liveType=" + liveType + "," + "previewLayouts=" + previewLayouts + "," + "previewVideos=" + previewVideos + "," + "products=" + products + "," + "characterId=" + characterId + "," + "characterIds=" + characterIds + "," + "voiceIds=" + voiceIds + "}";
    }
}
