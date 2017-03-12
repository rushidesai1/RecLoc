
package ds.frontend.domain.searchcategory.response;

import com.fasterxml.jackson.annotation.*;
import ds.frontend.domain.common.ErrorResponse;
import ds.frontend.domain.common.ResponseDetail;
import ds.frontend.domain.common.SuccessResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "responseDetail",
        "successResponse",
        "errorResponse"
})
public class SearchCategoryResponse implements Serializable {

    @JsonProperty("responseDetail")
    @Valid
    private ResponseDetail responseDetail;
    @JsonProperty("successResponse")
    @Valid
    private SuccessResponse successResponse;
    @JsonProperty("errorResponse")
    @Valid
    private ErrorResponse errorResponse;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3939608877900398403L;

    /**
     * No args constructor for use in serialization
     */
    public SearchCategoryResponse() {
    }

    /**
     * @param successResponse
     * @param errorResponse
     * @param responseDetail
     */
    public SearchCategoryResponse(ResponseDetail responseDetail, SuccessResponse successResponse, ErrorResponse errorResponse) {
        super();
        this.responseDetail = responseDetail;
        this.successResponse = successResponse;
        this.errorResponse = errorResponse;
    }

    @JsonProperty("responseDetail")
    public ResponseDetail getResponseDetail() {
        return responseDetail;
    }

    @JsonProperty("responseDetail")
    public void setResponseDetail(ResponseDetail responseDetail) {
        this.responseDetail = responseDetail;
    }

    public SearchCategoryResponse withResponseDetail(ResponseDetail responseDetail) {
        this.responseDetail = responseDetail;
        return this;
    }

    @JsonProperty("successResponse")
    public SuccessResponse getSuccessResponse() {
        return successResponse;
    }

    @JsonProperty("successResponse")
    public void setSuccessResponse(SuccessResponse successResponse) {
        this.successResponse = successResponse;
    }

    public SearchCategoryResponse withSuccessResponse(SuccessResponse successResponse) {
        this.successResponse = successResponse;
        return this;
    }

    @JsonProperty("errorResponse")
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    @JsonProperty("errorResponse")
    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public SearchCategoryResponse withErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public SearchCategoryResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responseDetail).append(successResponse).append(errorResponse).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchCategoryResponse) == false) {
            return false;
        }
        SearchCategoryResponse rhs = ((SearchCategoryResponse) other);
        return new EqualsBuilder().append(responseDetail, rhs.responseDetail).append(successResponse, rhs.successResponse).append(errorResponse, rhs.errorResponse).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
