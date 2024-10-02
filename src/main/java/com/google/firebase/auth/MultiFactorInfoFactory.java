package com.google.firebase.auth;

import com.google.firebase.auth.internal.GetAccountInfoResponse;

public class MultiFactorInfoFactory {


	public MultiFactorInfo create(GetAccountInfoResponse.MultiFactorInfo multiFactorInfo) {
		if (multiFactorInfo.getPhoneInfo().isEmpty()){
			return new TotpMultiFactorInfo(multiFactorInfo);
		}
		return new PhoneMultiFactorInfo(multiFactorInfo);
	}
}
