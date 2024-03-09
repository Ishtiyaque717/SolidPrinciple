package com.solidprinciple;

public class SingleResponsibilityPrinciple {

}

// Example Of voilating SingleResponsibility Principle

class Mobile {
	void charge() {
		System.out.println("Mobile is Charging Succesfull");
	}
	void videoPlay() {
		System.out.println("Video Is Playing ");
	}
}

// Example OF Single Responsibility Principle
class MobileCharging{
	void charge() {
		System.out.println("Mobile is Charging Succesfull");
	}
}
class MobileVideoPlay{
	void videoPlay() {
		System.out.println("Video Is Playing ");
	}
}

// Each class should serve the only one Functionality
// to increase the readability