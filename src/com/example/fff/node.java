package com.example.fff;

public class node {
	private String name;
	private double cost;
	private double benefit;
	private double take;
	private double status = 0;
	private double bandb;

	public double getBandb() {
		return bandb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getBenefit() {
		return benefit;
	}

	public void setBenefit(double benefit) {
		this.benefit = benefit;
	}

	public double isTake() {
		return take;
	}

	public void setTake(double take) {
		this.take = take;
	}

	public double getStatus() {
		return status;
	}

	public void setStatus(double status) {
		this.status = status;
	}

	public node(String name, double cost, double benefit) {
		this.name = name;
		this.cost = cost;
		this.benefit = benefit;
		setBandb();
	}

	public void setBandb() {
		this.bandb = benefit / cost;

	}
}
