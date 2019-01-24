package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudDetectionAnalisysResponse
 */
public class FraudDetectionAnalisysResponse   {
  private String fraudDetectionOperatingSessionReference = null;

  private String fraudDetectionTransactionAnalysisActivityReference = null;

  private String productProductionSessionReference = null;

  private Object fraudDetectionTransactionConsolidationRecord = null;

  private String fraudModelModelUsageGuidelines = null;

  private Object fraudDetectionProductionAnomalyRecord = null;

  private String fraudDetectionProductionAnomalyProductionTransactionReference = null;

  private Object fraudDetectionAnalysisRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the activity that applies fraud detection algorithms to th eproduction records\" 
   * @return fraudDetectionTransactionAnalysisActivityReference
  **/

  public String getFraudDetectionTransactionAnalysisActivityReference() {
    return fraudDetectionTransactionAnalysisActivityReference;
  }

  public void setFraudDetectionTransactionAnalysisActivityReference(String fraudDetectionTransactionAnalysisActivityReference) {
    this.fraudDetectionTransactionAnalysisActivityReference = fraudDetectionTransactionAnalysisActivityReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"contains the production transaction details captured by the consolidation task that are submitted for fraud scanning - note this will be a real-time dataset\" 
   * @return fraudDetectionTransactionConsolidationRecord
  **/

  public Object getFraudDetectionTransactionConsolidationRecord() {
    return fraudDetectionTransactionConsolidationRecord;
  }

  public void setFraudDetectionTransactionConsolidationRecord(Object fraudDetectionTransactionConsolidationRecord) {
    this.fraudDetectionTransactionConsolidationRecord = fraudDetectionTransactionConsolidationRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"guidance on usage and result interpretation\" 
   * @return fraudModelModelUsageGuidelines
  **/

  public String getFraudModelModelUsageGuidelines() {
    return fraudModelModelUsageGuidelines;
  }

  public void setFraudModelModelUsageGuidelines(String fraudModelModelUsageGuidelines) {
    this.fraudModelModelUsageGuidelines = fraudModelModelUsageGuidelines;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"details of detected out of pattern production activity that could be fraud\" 
   * @return fraudDetectionProductionAnomalyRecord
  **/

  public Object getFraudDetectionProductionAnomalyRecord() {
    return fraudDetectionProductionAnomalyRecord;
  }

  public void setFraudDetectionProductionAnomalyRecord(Object fraudDetectionProductionAnomalyRecord) {
    this.fraudDetectionProductionAnomalyRecord = fraudDetectionProductionAnomalyRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the one or more production transactions isolated by the fraud scanner\" 
   * @return fraudDetectionProductionAnomalyProductionTransactionReference
  **/

  public String getFraudDetectionProductionAnomalyProductionTransactionReference() {
    return fraudDetectionProductionAnomalyProductionTransactionReference;
  }

  public void setFraudDetectionProductionAnomalyProductionTransactionReference(String fraudDetectionProductionAnomalyProductionTransactionReference) {
    this.fraudDetectionProductionAnomalyProductionTransactionReference = fraudDetectionProductionAnomalyProductionTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"contains the production transaction analysis results, including reference to any potential fraud transactions - note this will be a real-time dataset\" 
   * @return fraudDetectionAnalysisRecord
  **/

  public Object getFraudDetectionAnalysisRecord() {
    return fraudDetectionAnalysisRecord;
  }

  public void setFraudDetectionAnalysisRecord(Object fraudDetectionAnalysisRecord) {
    this.fraudDetectionAnalysisRecord = fraudDetectionAnalysisRecord;
  }


}

