package com.by.purchase.fragments.gamecard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.by.purchase.R;
import com.by.purchase.fragments.FragmentCardBase;
import com.by.purchase.manager.BYPMgr;
import com.by.purchase.manager.Constants;

public class FragmentCardShengda extends FragmentCardBase {
	
	@Override
	public View getCurrentView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		_fragmentBtnId = R.id.card_shengda;
		return inflater.inflate(R.layout.by_pay_chongzhi_content_shengda,
				container, false);
	}

	@Override
	public void payNow() {
		BYPMgr.PURCHASE_CARD_CHANNEL = Constants.CardChannel.SHENGDA;
		super.payNow();
	}

}