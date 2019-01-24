package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudDetectionConsolidationResponse
 */
public class FraudDetectionConsolidationResponse   {
  private String fraudDetectionOperatingSessionReference = null;

  private String fraudDetectionTransactionConsolidationActivityReference = null;

  private String productProductionSessionReference = null;

  private Object fraudDetectionTransactionConsolidationRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to an active fraud detection operational session\" 
   * @return fraudDetectionOperatingSessionReference
  **/

  public String getFraudDetectionOperatingSessionReference() {
    return fraudDetectionOperatingSessionReference;
  }

  public void setFraudDetectionOperatingSessionReference(String fraudDetectionOperatingSessionReference) {
    this.fraudDetectionOperatingSessionReference = fraudDetectionOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the activity that extracts transactions for fraud scanning\"     
   * @return fraudDetectionTransactionConsolidationActivityReference
  **/

  public String getFraudDetectionTransactionConsolidationActivityReference() {
    return fraudDetectionTransactionConsolidationActivityReference;
  }

  public void setFraudDetectionTransactionConsolidationActivityReference(String fraudDetectionTransactionConsolidationActivityReference) {
    this.fraudDetectionTransactionConsolidationActivityReference = fraudDetectionTransactionConsolidationActivityReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"contains the production transaction details that are submitted for fraud scanning - note this will be a real-time dataset\" 
   * @return fraudDetectionTransactionConsolidationRecord
  **/

  public Object getFraudDetectionTransactionConsolidationRecord() {
    return fraudDetectionTransactionConsolidationRecord;
  }

  public void setFraudDetectionTransactionConsolidationRecord(Object fraudDetectionTransactionConsolidationRecord) {
    this.fraudDetectionTransactionConsolidationRecord = fraudDetectionTransactionConsolidationRecord;
  }


}

