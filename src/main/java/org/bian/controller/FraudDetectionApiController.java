/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class FraudDetectionApiController {

	@Autowired
	FraudDetectionApiService service;
	
	@Operate.ExecutePost
	public BianResponse<FraudDetectionResponse> executePost(@RequestBody BianRequest<FraudDetectionRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Operate.ExecutePut
	public BianResponse<FraudDetectionResponse> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudDetectionRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}

	@BQ("notification")
	@Operate.Notify
	public BianResponse<FraudDetectionNotificationResponse> notify(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudDetectionNotificationRequest> bianRequest) {
		return BianResponse.forSuccess(service.notify(crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<FraudDetectionRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudDetectionRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}

	@Operate.RequestPost
	public BianResponse<FraudDetectionResponse> requestPost(@RequestBody BianRequest<FraudDetectionRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Operate.RequestPut
	public BianResponse<FraudDetectionResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudDetectionRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<FraudDetectionResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("analisys")
	@Operate.Retrieve
	public BianResponse<FraudDetectionAnalisysResponse> retrieveAnalisys(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAnalisys(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("consolidations")
	@Operate.Retrieve
	public BianResponse<FraudDetectionConsolidationResponse> retrieveConsolidations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidations(crReferenceId, bqReferenceId));
	}
	
	@BQ("diagnosis")
	@Operate.Retrieve
	public BianResponse<FraudDetectionDiagnosisResponse> retrieveDiagnosis(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDiagnosis(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
