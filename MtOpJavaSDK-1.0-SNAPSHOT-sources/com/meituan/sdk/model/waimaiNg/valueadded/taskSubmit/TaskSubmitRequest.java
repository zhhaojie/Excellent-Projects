package com.meituan.sdk.model.waimaiNg.valueadded.taskSubmit;

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
* 任务提交
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/valueadded/async/taskSubmit",
    businessId = 2,
    apiVersion = "10013",
    apiName = "task_submit",
    needAuth = true
)
public class TaskSubmitRequest implements MeituanRequest<Long> {
    /**
    * <p></p><p style="text-align: start;">业务请求参数 json格式，具体参数说明如下</p><p style="text-align: start;">对于外卖商家端来说，此接口的封装逻辑是：</p><ol><li><p><font style="font-size:14px;line-height:22px" data-size="14">商家端通过通过用户中心提供的手机号换取用户id（<a class="ct-link" href="https://docs.sankuai.com/mt/us/user_doc/master/interface/retrieve/" data-auto_update="0"><font style="font-size:14px;line-height:22px" data-size="14">getUserByMobileWithMsg</font></a>）。</font></p></li><li><p><font style="font-size:14px;line-height:22px" data-size="14">然后调用通过用户id发券接口发券（<a class="ct-link" href="https://km.sankuai.com/page/489543241#id-%E5%88%B6%E5%88%B8%E3%80%81%E5%8F%91%E5%88%B8%E6%8E%A5%E5%8F%A3" data-auto_update="0"><font style="font-size:14px;line-height:22px" data-size="14">thrift接口sendFullDiscountCoupon</font></a>）。</font></p><p></p></li></ol><p style="text-align: start;">1 根据系统标签获取用户列表,json</p><p style="text-align: start;">{"labelId":xx}</p><p style="text-align: start;">2 根据自定义标签获取用户列表，json</p><p style="text-align: start;">如：</p><p style="text-align: start;">{</p><p style="text-align: start;">"useType":1,// 用户类型</p><p style="text-align: start;">"sex":"1",//性别</p><p style="text-align: start;">"orderNum":[2,3],// 频次</p><p style="text-align: start;">"timeStart":"2020-10-31",</p><p style="text-align: start;">"timeEnd":"2020-11-01",</p><p style="text-align: start;">"commentContext":"1,2,3,4"</p><p style="text-align: start;">}</p><p style="text-align: start;"></p><p style="text-align: start;">3.建券并发券，json</p><p style="text-align: start;">具体属性如下：</p><p style="text-align: start;"></p><table class="ct-table" data-bordercolor="#cccccc"><tbody><tr><th data-colwidth="117" width="117" style="background-color: rgb(246, 246, 246);vertical-align:top;text-align:left;"><p><font style="font-size:14px;line-height:22px" data-size="14">参数名</font></p></th><th data-colwidth="79" width="79" style="background-color: rgb(246, 246, 246);vertical-align:top;text-align:left;"><p><font style="font-size:14px;line-height:22px" data-size="14">类型</font></p></th><th data-colwidth="79" width="79" style="background-color: rgb(246, 246, 246);vertical-align:top;text-align:left;"><p><font style="font-size:14px;line-height:22px" data-size="14">是否必须</font></p></th><th data-colwidth="109" width="109" style="background-color: rgb(246, 246, 246);vertical-align:top;text-align:left;"><p><font style="font-size:14px;line-height:22px" data-size="14">示例值</font></p></th><th data-colwidth="162" width="162" style="background-color: rgb(246, 246, 246);vertical-align:top;text-align:left;"><p><font style="font-size:14px;line-height:22px" data-size="14">描述</font></p></th></tr><tr><td data-colwidth="117" width="117" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">wmPoiId</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">String</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">否</font></p></td><td data-colwidth="109" width="109" style="background-color: rgb(255, 255, 255);color: rgba(0, 0, 0, 0.65);vertical-align:middle;"><p><font style="font-size:14px;line-height:22px" data-size="14">12233</font></p></td><td data-colwidth="162" width="162" style="background-color: rgb(255, 255, 255);color: rgba(0, 0, 0, 0.65);vertical-align:middle;"><p><font style="font-size:14px;line-height:22px" data-size="14">APP方门店ID</font></p></td></tr><tr><td data-colwidth="117" width="117" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">appId</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">int</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">否</font></p></td><td data-colwidth="109" width="109" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">123</font></p></td><td data-colwidth="162" width="162" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">三方ID</font></p></td></tr><tr><td data-colwidth="117" width="117" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">couponName</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">String</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">是</font></p></td><td data-colwidth="109" width="109" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">优惠券</font></p></td><td data-colwidth="162" width="162" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">优惠券名称</font></p></td></tr><tr><td data-colwidth="117" width="117" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">price</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">int</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">是</font></p></td><td data-colwidth="109" width="109" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">2</font></p></td><td data-colwidth="162" width="162" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">优惠券金额单位元</font></p></td></tr><tr><td data-colwidth="117" width="117" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">limitPrice</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">int</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">是</font></p></td><td data-colwidth="109" width="109" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">6</font></p></td><td data-colwidth="162" width="162" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">优惠券门槛金额单位元</font></p></td></tr><tr><td data-colwidth="117" width="117" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">validTime</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">long</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">是</font></p></td><td data-colwidth="109" width="109" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">3600</font></p></td><td data-colwidth="162" width="162" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">有效期，单位秒</font></p></td></tr><tr><td data-colwidth="117" width="117" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">comment</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">String</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">是</font></p></td><td data-colwidth="109" width="109" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">备注</font></p></td><td data-colwidth="162" width="162" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">备注</font></p></td></tr><tr><td data-colwidth="117" width="117" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">tel</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">String</font></p></td><td data-colwidth="79" width="79" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">task_type=5时，必传。</font></p></td><td data-colwidth="109" width="109" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">13000000000</font></p></td><td data-colwidth="162" width="162" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">支持11位大陆手机号和港澳台手机号。</font></p><p style="text-align: start;"><font style="font-size:14px;line-height:22px" data-size="14">手机号格式为{地区码}_{手机号}；如果是大陆手机号（86），手机号格式为{手机号}。</font></p><p style="text-align: start;"><strong><font style="font-size:14px;line-height:22px" data-size="14">备注：即将废弃的手机号发券接口已新增</font></strong></p></td></tr></tbody></table><p style="text-align: start;">注意：</p><p style="text-align: start;">1.<span style="color: rgb(245, 35, 45)"><font style="font-size:14px;line-height:22px" data-size="14">手机号需要校验大陆手机号和港澳台手机号。</font></span><br>2.<span style="color: rgb(245, 35, 45)"><font style="font-size:14px;line-height:22px" data-size="14">对于服务商侧接口来说，</font></span><font style="font-size:14px;line-height:22px" data-size="14">appId应该改成developerId，wmPoiId应该改成epoiid，但从外卖底层接口能力来说，即便输入的参数，也会按请求参数中的公共参数为准，所以，对于研发侧来说，透传字段；对于文档展示来说，将隐藏着两个字段的展示。</font></p><p></p>
    */
    @NotBlank(message = "taskParam不能为空")
    @SerializedName("taskParam")
    private String taskParam;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">任务名字</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">当task_type=5时，task_name 与 OpenFullDiscountCouponSendReq 的 couponName 字段值一致。</font></span></p>
    */
    @NotBlank(message = "taskName不能为空")
    @SerializedName("taskName")
    private String taskName;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">任务备注</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">当task_type=5时，task_comment 与OpenFullDiscountCouponSendReq 的 comment 字段值一致。</font></span></p>
    */
    @NotBlank(message = "taskComment不能为空")
    @SerializedName("taskComment")
    private String taskComment;
    /**
    * <p>枚举:</p><p style="text-align: start;">2-根据系统标签获取用户列表</p><p style="text-align: start;">3-根据自定以标签获取用户列表</p><p style="text-align: start;">4-建券并发券</p><p style="text-align: start;"><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">5-手机号发券</font></span></p>
    */
    @NotNull(message = "taskType不能为空")
    @SerializedName("taskType")
    private Integer taskType;

    public String getTaskParam() {
        return taskParam;
    }
    public void setTaskParam(String taskParam) {
        this.taskParam = taskParam;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskComment() {
        return taskComment;
    }
    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }
    public Integer getTaskType() {
        return taskType;
    }
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }


    @Override
    public MeituanResponse<Long> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Long>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TaskSubmitRequest{" + "taskParam=" + taskParam + "," + "taskName=" + taskName + "," + "taskComment=" + taskComment + "," + "taskType=" + taskType + "}";
    }
}
