package com.meituan.sdk.model.foodmop.pay.tuangouTradeQueryByPage;

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
* 对账分页查询账单信息（非必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/pay/tuangou/trade/queryByPage",
    businessId = 51,
    apiVersion = "10004",
    apiName = "tuangou_trade_query_by_page",
    needAuth = true
)
public class TuangouTradeQueryByPageRequest implements MeituanRequest<TuangouTradeQueryByPageResponse> {
    /**
    * <p data-diff-id="ct-diff-id-6c6577cf-05a3-465e-92b8-0893dc1b765e">收益日期，即触发收益结算的日期<br>格式为"yyyy-MM-dd"<br>注：<br>结算信息完备的正常情况下，收益日期即核销日期，举例：团购券在5月1日核销，正常情况下5月1日触发收益计算，商家在5月2日收到打款，此时“收益日期”字段为5月1日<br>若结算信息不全，会导致延期结算，收益日期为商家收款日期-1，举例：团购券在5月1日核销，6月1日才触发收益计算，商家在6月2日收到打款，此时“收益日期”字段为6月1日</p>
    */
    @NotBlank(message = "clearDate不能为空")
    @SerializedName("clearDate")
    private String clearDate;
    /**
    * <p data-diff-id="ct-diff-id-2a75ba63-d69b-43a1-9ce6-406a3f65f341">查询条数（最大不超过1000）<br></p><p data-diff-id="ct-diff-id-37fb46aa-78f5-4b61-a4ac-95f331d8c54b">举例：<br>查询900条明细，需调用1次，limit=900；<br>查询1200条明细，需调用2次，第1次<br>limit=1000，第2次limit=200；<br>查询2300条明细；需调用3次，第1次<br>limit=1000，第2次limit=1000，第3次<br>limit=300；<br>依此类推</p>
    */
    @NotNull(message = "limit不能为空")
    @SerializedName("limit")
    private Integer limit;
    /**
    * <p data-diff-id="ct-diff-id-7eebfeac-275c-4ff0-91c5-b3c413becba6">查询起始位置(从0开始，根据实际数据量依次增大)<br><br></p><p data-diff-id="ct-diff-id-f8a184a5-e989-4bc4-8129-db5dceb5b430">举例：<br>查询900条明细，需调用1次，offset=0；<br>查询1200条明细，需调用2次，第1次<br>offset=0，第2次offset=1000；<br>查询2300条明细；需调用3次，第1次<br>offset=0，第2次offset=1000，第3次<br>offset=2000；<br>依此类推</p>
    */
    @NotNull(message = "offset不能为空")
    @SerializedName("offset")
    private Integer offset;
    /**
    * <p data-diff-id="ct-diff-id-a88da78d-590b-4da4-903d-8bb5f60fd1f9">业务类型<br>10： 团 购<br>20： 买 单</p><p data-diff-id="ct-diff-id-a19728bc-f194-4b0d-8239-ee3f9aded2ac">40：点餐</p>
    */
    @NotNull(message = "bizType不能为空")
    @SerializedName("bizType")
    private Integer bizType;

    public String getClearDate() {
        return clearDate;
    }
    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getBizType() {
        return bizType;
    }
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }


    @Override
    public MeituanResponse<TuangouTradeQueryByPageResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<TuangouTradeQueryByPageResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TuangouTradeQueryByPageRequest{" + "clearDate=" + clearDate + "," + "limit=" + limit + "," + "offset=" + offset + "," + "bizType=" + bizType + "}";
    }
}
