package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudDetectionNotificationResponse
 */
public class FraudDetectionNotificationResponse   {
  private String fraudDetectionNotificationActivityReference = null;

  private String fraudDetectionOperatingSessionReference = null;

  private String productProductionSessionReference = null;

  private Object fraudDetectionDiagnosisRecord = null;

  private Object fraudDetectionNotificationActivityRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Refers to the notification request that provides alerts/notification of detected fraud to interested parties          
   * @return fraudDetectionNotificationActivityReference
  **/

  public String getFraudDetectionNotificationActivityReference() {
    return fraudDetectionNotificationActivityReference;
  }

  public void setFraudDetectionNotificationActivityReference(String fraudDetectionNotificationActivityReference) {
    this.fraudDetectionNotificationActivityReference = fraudDetectionNotificationActivityReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Refers to a specific fraud detection operating session           
   * @return fraudDetectionOperatingSessionReference
  **/

  public String getFraudDetectionOperatingSessionReference() {
    return fraudDetectionOperatingSessionReference;
  }

  public void setFraudDetectionOperatingSessionReference(String fraudDetectionOperatingSessionReference) {
    this.fraudDetectionOperatingSessionReference = fraudDetectionOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Refers to the product fulfillment production session for which on-line fraud scanning is performed 
   * @return productProductionSessionReference
  **/

  public String getProductProductionSessionReference() {
    return productProductionSessionReference;
  }

  public void setProductProductionSessionReference(String productProductionSessionReference) {
    this.productProductionSessionReference = productProductionSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: Diagnosis record/recommendation returned to production and provided to other interested parties in this notification 
   * @return fraudDetectionDiagnosisRecord
  **/

  public Object getFraudDetectionDiagnosisRecord() {
    return fraudDetectionDiagnosisRecord;
  }

  public void setFraudDetectionDiagnosisRecord(Object fraudDetectionDiagnosisRecord) {
    this.fraudDetectionDiagnosisRecord = fraudDetectionDiagnosisRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: Processing record for the fraud detection notification activity 
   * @return fraudDetectionNotificationActivityRecord
  **/

  public Object getFraudDetectionNotificationActivityRecord() {
    return fraudDetectionNotificationActivityRecord;
  }

  public void setFraudDetectionNotificationActivityRecord(Object fraudDetectionNotificationActivityRecord) {
    this.fraudDetectionNotificationActivityRecord = fraudDetectionNotificationActivityRecord;
  }


}

