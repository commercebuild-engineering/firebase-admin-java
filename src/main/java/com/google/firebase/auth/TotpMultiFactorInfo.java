package com.google.firebase.auth;

import com.google.firebase.auth.internal.GetAccountInfoResponse;

public class TotpMultiFactorInfo extends MultiFactorInfo {


	public TotpMultiFactorInfo(GetAccountInfoResponse.MultiFactorInfo response) {
		super(response);
	}

	public MfaType getMfaType() {
		return MfaType.TOTP;
	}


}
