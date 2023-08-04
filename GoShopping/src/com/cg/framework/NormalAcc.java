package com.cg.framework;

public abstract class NormalAcc extends ShopAcc {
	

	protected final float deliveryCharge;
	

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}
	
	public void NormalAcc(int accNo, String accNm, float charges, float deliveryCharge2) {
		// TODO Auto-generated constructor stub
	}

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("delivery charges are: "+ deliveryCharge);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}