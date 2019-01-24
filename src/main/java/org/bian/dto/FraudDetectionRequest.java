package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudDetectionRequest
 */
public class FraudDetectionRequest   {
  private String fraudDetectionOperatingSessionConfiguration = null;

  private String fraudDetectionOperatingSessionDateTime = null;

  private String productProductionSessionReference = null;

  private String fraudModelReference = null;

  private Object fraudDetectionOperatingSessionRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"defines the configuration settings for the active operating session\" 
   * @return fraudDetectionOperatingSessionConfiguration
  **/

  public String getFraudDetectionOperatingSessionConfiguration() {
    return fraudDetectionOperatingSessionConfiguration;
  }

  public void setFraudDetectionOperatingSessionConfiguration(String fraudDetectionOperatingSessionConfiguration) {
    this.fraudDetectionOperatingSessionConfiguration = fraudDetectionOperatingSessionConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return fraudDetectionOperatingSessionDateTime
  **/

  public String getFraudDetectionOperatingSessionDateTime() {
    return fraudDetectionOperatingSessionDateTime;
  }

  public void setFraudDetectionOperatingSessionDateTime(String fraudDetectionOperatingSessionDateTime) {
    this.fraudDetectionOperatingSessionDateTime = fraudDetectionOperatingSessionDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the product fulfillment production session for which on-line fraud scanning is performed\" 
   * @return productProductionSessionReference
  **/

  public String getProductProductionSessionReference() {
    return productProductionSessionReference;
  }

  public void setProductProductionSessionReference(String productProductionSessionReference) {
    this.productProductionSessionReference = productProductionSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to a specific fraud detection algorithm that is during this operating session\" 
   * @return fraudModelReference
  **/

  public String getFraudModelReference() {
    return fraudModelReference;
  }

  public void setFraudModelReference(String fraudModelReference) {
    this.fraudModelReference = fraudModelReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"production record/log of the fraud detection operating session\" 
   * @return fraudDetectionOperatingSessionRecord
  **/

  public Object getFraudDetectionOperatingSessionRecord() {
    return fraudDetectionOperatingSessionRecord;
  }

  public void setFraudDetectionOperatingSessionRecord(Object fraudDetectionOperatingSessionRecord) {
    this.fraudDetectionOperatingSessionRecord = fraudDetectionOperatingSessionRecord;
  }


}

