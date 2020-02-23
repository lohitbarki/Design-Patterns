package com.bridge.core;

import com.bridge.abstrmodel.DebitCard;
import com.bridge.abstrmodel.NetBanking;
import com.bridge.abstrmodel.Payment;
import com.bridge.implmodel.HDFCBank;
import com.bridge.implmodel.SBIBank;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class StartPayment {

	public static void main(String[] args) {
		
		Payment debitCradPayment = new DebitCard();
		debitCradPayment.paymentSystem = new HDFCBank();
		debitCradPayment.makePayment();
		
		Payment netBankingPayment = new NetBanking();
		netBankingPayment.paymentSystem = new SBIBank();
		netBankingPayment.makePayment();
	}
}
