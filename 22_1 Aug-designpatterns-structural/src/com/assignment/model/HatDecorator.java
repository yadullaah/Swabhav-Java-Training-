package com.assignment.model;

public abstract class HatDecorator implements IHat{
IHat hat;

public HatDecorator(IHat hat) {
	super();
	this.hat = hat;
}

}
