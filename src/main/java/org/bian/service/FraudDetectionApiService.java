/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FraudDetectionApiService {

	FraudDetectionResponse executePost(FraudDetectionRequest request);
	
	FraudDetectionResponse executePut(String crReferenceId, FraudDetectionRequest request);
	
	FraudDetectionNotificationResponse notify(String crReferenceId, FraudDetectionNotificationRequest request);
	
	FraudDetectionRecordResponse record(String crReferenceId, FraudDetectionRecordRequest request);
	
	FraudDetectionResponse requestPost(FraudDetectionRequest request);
	
	FraudDetectionResponse requestPut(String crReferenceId, FraudDetectionRequest request);
	
	FraudDetectionResponse retrieve(String crReferenceId);
	
	FraudDetectionAnalisysResponse retrieveAnalisys(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	FraudDetectionConsolidationResponse retrieveConsolidations(String crReferenceId, String bqReferenceId);
	
	FraudDetectionDiagnosisResponse retrieveDiagnosis(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
}
