package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudDetectionDiagnosisResponse
 */
public class FraudDetectionDiagnosisResponse   {
  private String fraudDetectionOperatingSessionReference = null;

  private String fraudDetectionDiagnosisActivityReference = null;

  private String productProductionSessionReference = null;

  private Object fraudDetectionTransactionConsolidationRecord = null;

  private Object fraudDetectionAnalysisRecord = null;

  private Object fraudDetectionDiagnosisRecord = null;

  private Object fraudDetectionDiagnosisActivityRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the activity that handles the return of the fraud detection diagnosis/recommendation to the production service\" 
   * @return fraudDetectionDiagnosisActivityReference
  **/

  public String getFraudDetectionDiagnosisActivityReference() {
    return fraudDetectionDiagnosisActivityReference;
  }

  public void setFraudDetectionDiagnosisActivityReference(String fraudDetectionDiagnosisActivityReference) {
    this.fraudDetectionDiagnosisActivityReference = fraudDetectionDiagnosisActivityReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"the production transaction details used for fraud scanning - note this will be a real-time dataset\" 
   * @return fraudDetectionTransactionConsolidationRecord
  **/

  public Object getFraudDetectionTransactionConsolidationRecord() {
    return fraudDetectionTransactionConsolidationRecord;
  }

  public void setFraudDetectionTransactionConsolidationRecord(Object fraudDetectionTransactionConsolidationRecord) {
    this.fraudDetectionTransactionConsolidationRecord = fraudDetectionTransactionConsolidationRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"the production transaction analysis results, including reference to any potential fraud transactions - note this will be a real-time dataset\" 
   * @return fraudDetectionAnalysisRecord
  **/

  public Object getFraudDetectionAnalysisRecord() {
    return fraudDetectionAnalysisRecord;
  }

  public void setFraudDetectionAnalysisRecord(Object fraudDetectionAnalysisRecord) {
    this.fraudDetectionAnalysisRecord = fraudDetectionAnalysisRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"is the diagnosis record/recommendation returned to production - it is returned from Fraud Decisioning that processes the Fraud Detection Analysis Record\" 
   * @return fraudDetectionDiagnosisRecord
  **/

  public Object getFraudDetectionDiagnosisRecord() {
    return fraudDetectionDiagnosisRecord;
  }

  public void setFraudDetectionDiagnosisRecord(Object fraudDetectionDiagnosisRecord) {
    this.fraudDetectionDiagnosisRecord = fraudDetectionDiagnosisRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"product record for the fraud detection diagnosis activity\" 
   * @return fraudDetectionDiagnosisActivityRecord
  **/

  public Object getFraudDetectionDiagnosisActivityRecord() {
    return fraudDetectionDiagnosisActivityRecord;
  }

  public void setFraudDetectionDiagnosisActivityRecord(Object fraudDetectionDiagnosisActivityRecord) {
    this.fraudDetectionDiagnosisActivityRecord = fraudDetectionDiagnosisActivityRecord;
  }


}

