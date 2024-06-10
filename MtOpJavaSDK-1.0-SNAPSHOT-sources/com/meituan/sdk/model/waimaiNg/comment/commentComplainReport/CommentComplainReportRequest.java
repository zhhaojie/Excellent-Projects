package com.meituan.sdk.model.waimaiNg.comment.commentComplainReport;

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
* 评价申诉接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/comment/complain/report",
    businessId = 2,
    apiVersion = "10008",
    apiName = "comment_complain_report",
    needAuth = true
)
public class CommentComplainReportRequest implements MeituanRequest<String> {
    /**
    * <p>评价Id</p>
    */
    @NotBlank(message = "commentId不能为空")
    @SerializedName("commentId")
    private String commentId;
    /**
    * <p>申述类型</p><table class="ct-table" data-borderwidth="1"><tbody><tr><th data-colwidth="86" width="86"><p>ID</p></th><th data-colwidth="297" width="297"><p>code</p></th><th data-colwidth="247" width="247"><p>name</p></th><th data-colwidth="242" width="242"><p>类别</p></th></tr><tr><td data-colwidth="86" width="86"><p>31</p></td><td data-colwidth="297" width="297"><p>WM_RIDER_TIMEOUT</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">骑手配送超时</span></strong></p></td><td rowspan="2" data-colwidth="242" width="242"><p><strong><span style="color: rgb(11, 117, 0)">配送原因导致差评</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>32</p></td><td data-colwidth="297" width="297"><p>WM_RIDER_SERVICE</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">骑手服务问题</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>34</p></td><td data-colwidth="297" width="297"><p>WM_CHOOSES_WRONG_SCORE</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">用户选错评分</span></strong></p></td><td rowspan="4" data-colwidth="242" width="242"><p><strong><span style="color: rgb(11, 117, 0)">用户操作错误导致差评</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>35</p></td><td data-colwidth="297" width="297"><p>WM_ENVIRONMENTAL</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">用户选择环保单</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>36</p></td><td data-colwidth="297" width="297"><p>WM_NOT_THE_ORDER</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">评价与订单不符</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>37</p></td><td data-colwidth="297" width="297"><p>WM_NOT_RECEIVED</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">用户未收餐</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>39</p></td><td data-colwidth="297" width="297"><p>WM_NO_REMARKS</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">用户未备注产生差评</span></strong></p></td><td rowspan="3" data-colwidth="242" width="242"><p><strong><span style="color: rgb(11, 117, 0)">用户提出额外要求导致差评</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>40</p></td><td data-colwidth="297" width="297"><p>WM_UNREASONABLE_REQUEST</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">用户提出不合理要求</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>41</p></td><td data-colwidth="297" width="297"><p>WM_USER_THREATEN</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">用户以差评威胁商家</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>43</p></td><td data-colwidth="297" width="297"><p>WM_ACCOMPANY_BAD_REVIEW</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">同行或特殊身份给差评</span></strong></p></td><td rowspan="2" data-colwidth="242" width="242"><p><strong><span style="color: rgb(11, 117, 0)">同行或特殊身份给差评</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>44</p></td><td data-colwidth="297" width="297"><p>WM_MULTIPLE_BAD_REVIEW</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">多次差评</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>46</p></td><td data-colwidth="297" width="297"><p>WM_ADVERT</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">不文明用语，泄露隐私，广告信息</span></strong></p></td><td rowspan="2" data-colwidth="242" width="242"><p><strong><span style="color: rgb(11, 117, 0)">广告或无意义评价</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>47</p></td><td data-colwidth="297" width="297"><p>WM_NO_MEAN</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">内容无意义评价</span></strong></p></td></tr><tr><td data-colwidth="86" width="86"><p>48</p></td><td data-colwidth="297" width="297"><p>WM_OTHER_CONTENT</p></td><td data-colwidth="247" width="247"><p><strong><span style="color: rgb(11, 117, 0)">其他</span></strong></p></td><td data-colwidth="242" width="242"><p><strong><span style="color: rgb(11, 117, 0)">其他</span></strong></p></td></tr></tbody></table><p></p>
    */
    @NotNull(message = "reportTypeCode不能为空")
    @SerializedName("reportTypeCode")
    private Integer reportTypeCode;
    /**
    * <p>申诉内容</p>
    */
    @NotBlank(message = "reportContent不能为空")
    @SerializedName("reportContent")
    private String reportContent;
    /**
    * <p>差评申述图片</p><p>逗号分隔图片id</p>
    */
    @SerializedName("picIds")
    private String picIds;

    public String getCommentId() {
        return commentId;
    }
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }
    public Integer getReportTypeCode() {
        return reportTypeCode;
    }
    public void setReportTypeCode(Integer reportTypeCode) {
        this.reportTypeCode = reportTypeCode;
    }
    public String getReportContent() {
        return reportContent;
    }
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
    public String getPicIds() {
        return picIds;
    }
    public void setPicIds(String picIds) {
        this.picIds = picIds;
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
        return "CommentComplainReportRequest{" + "commentId=" + commentId + "," + "reportTypeCode=" + reportTypeCode + "," + "reportContent=" + reportContent + "," + "picIds=" + picIds + "}";
    }
}
