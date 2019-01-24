/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FraudDetectionApiServiceImpl implements FraudDetectionApiService {

	public FraudDetectionResponse executePost(FraudDetectionRequest request){
		return JsonReader.read("executePost-FraudDetectionResponse.json",new TypeReference<FraudDetectionResponse>(){});
	}
	
	public FraudDetectionResponse executePut(String crReferenceId, FraudDetectionRequest request){
		return JsonReader.read("executePut-FraudDetectionResponse.json",new TypeReference<FraudDetectionResponse>(){});
	}
	
	public FraudDetectionNotificationResponse notify(String crReferenceId, FraudDetectionNotificationRequest request){
		return JsonReader.read("notify-FraudDetectionNotificationResponse.json",new TypeReference<FraudDetectionNotificationResponse>(){});
	}
	
	public FraudDetectionRecordResponse record(String crReferenceId, FraudDetectionRecordRequest request){
		return JsonReader.read("record-FraudDetectionRecordResponse.json",new TypeReference<FraudDetectionRecordResponse>(){});
	}
	
	public FraudDetectionResponse requestPost(FraudDetectionRequest request){
		return JsonReader.read("requestPost-FraudDetectionResponse.json",new TypeReference<FraudDetectionResponse>(){});
	}
	
	public FraudDetectionResponse requestPut(String crReferenceId, FraudDetectionRequest request){
		return JsonReader.read("requestPut-FraudDetectionResponse.json",new TypeReference<FraudDetectionResponse>(){});
	}
	
	public FraudDetectionResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-FraudDetectionResponse.json",new TypeReference<FraudDetectionResponse>(){});
	}
	
	public FraudDetectionAnalisysResponse retrieveAnalisys(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudDetectionAnalisysResponse.json",new TypeReference<FraudDetectionAnalisysResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public FraudDetectionConsolidationResponse retrieveConsolidations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudDetectionConsolidationResponse.json",new TypeReference<FraudDetectionConsolidationResponse>(){});
	}
	
	public FraudDetectionDiagnosisResponse retrieveDiagnosis(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudDetectionDiagnosisResponse.json",new TypeReference<FraudDetectionDiagnosisResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
