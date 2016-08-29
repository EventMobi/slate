/**
 * eventmobi
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: api-v2
 * Contact: support@cloud-elements.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ObjectsMetadataFields
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-26T15:51:37.800-04:00")
public class ObjectsMetadataFields   {
  @SerializedName("mask")
  private String mask = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("vendorDisplayName")
  private String vendorDisplayName = null;

  @SerializedName("vendorPath")
  private String vendorPath = null;

  @SerializedName("vendorReadOnly")
  private Boolean vendorReadOnly = null;

  @SerializedName("vendorRequired")
  private Boolean vendorRequired = null;

  public ObjectsMetadataFields mask(String mask) {
    this.mask = mask;
    return this;
  }

   /**
   * Get mask
   * @return mask
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMask() {
    return mask;
  }

  public void setMask(String mask) {
    this.mask = mask;
  }

  public ObjectsMetadataFields type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ObjectsMetadataFields vendorDisplayName(String vendorDisplayName) {
    this.vendorDisplayName = vendorDisplayName;
    return this;
  }

   /**
   * Get vendorDisplayName
   * @return vendorDisplayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVendorDisplayName() {
    return vendorDisplayName;
  }

  public void setVendorDisplayName(String vendorDisplayName) {
    this.vendorDisplayName = vendorDisplayName;
  }

  public ObjectsMetadataFields vendorPath(String vendorPath) {
    this.vendorPath = vendorPath;
    return this;
  }

   /**
   * Get vendorPath
   * @return vendorPath
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVendorPath() {
    return vendorPath;
  }

  public void setVendorPath(String vendorPath) {
    this.vendorPath = vendorPath;
  }

  public ObjectsMetadataFields vendorReadOnly(Boolean vendorReadOnly) {
    this.vendorReadOnly = vendorReadOnly;
    return this;
  }

   /**
   * Get vendorReadOnly
   * @return vendorReadOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVendorReadOnly() {
    return vendorReadOnly;
  }

  public void setVendorReadOnly(Boolean vendorReadOnly) {
    this.vendorReadOnly = vendorReadOnly;
  }

  public ObjectsMetadataFields vendorRequired(Boolean vendorRequired) {
    this.vendorRequired = vendorRequired;
    return this;
  }

   /**
   * Get vendorRequired
   * @return vendorRequired
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVendorRequired() {
    return vendorRequired;
  }

  public void setVendorRequired(Boolean vendorRequired) {
    this.vendorRequired = vendorRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectsMetadataFields objectsMetadataFields = (ObjectsMetadataFields) o;
    return Objects.equals(this.mask, objectsMetadataFields.mask) &&
        Objects.equals(this.type, objectsMetadataFields.type) &&
        Objects.equals(this.vendorDisplayName, objectsMetadataFields.vendorDisplayName) &&
        Objects.equals(this.vendorPath, objectsMetadataFields.vendorPath) &&
        Objects.equals(this.vendorReadOnly, objectsMetadataFields.vendorReadOnly) &&
        Objects.equals(this.vendorRequired, objectsMetadataFields.vendorRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mask, type, vendorDisplayName, vendorPath, vendorReadOnly, vendorRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectsMetadataFields {\n");
    
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vendorDisplayName: ").append(toIndentedString(vendorDisplayName)).append("\n");
    sb.append("    vendorPath: ").append(toIndentedString(vendorPath)).append("\n");
    sb.append("    vendorReadOnly: ").append(toIndentedString(vendorReadOnly)).append("\n");
    sb.append("    vendorRequired: ").append(toIndentedString(vendorRequired)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

