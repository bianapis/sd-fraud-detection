package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudDetectionNotificationRequest
 */
public class FraudDetectionNotificationRequest   {
  private Object notificationRequestRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: Details the type of report and reporting conditions for notification  
   * @return notificationRequestRecord
  **/

  public Object getNotificationRequestRecord() {
    return notificationRequestRecord;
  }

  public void setNotificationRequestRecord(Object notificationRequestRecord) {
    this.notificationRequestRecord = notificationRequestRecord;
  }


}

