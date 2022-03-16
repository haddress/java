package com.prod;

public class Car {
	// 모델, 현재속도, 최고속도, 가속(), 감속(), 현재속도() -> 괄호는 메소드
	private String model;
	private int speed;
	private int maxSpeed;
	
	
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void addSpeed() {
		if (this.speed + 10 > this.maxSpeed) {
			System.out.println("최고속도를 초과할 수 없습니다.");
			return; // continue처럼 밑의 메소드 실행 x
		}
		System.out.println("10km 가속합니다.");
		this.speed += 10;
	}
	
	public void breakSpeed() {
		if (this.speed <= 0) {
			System.out.println("더 이상 속도를 줄일 수 없습니다.");
			return;
		}
		System.out.println("10km 감속합니다.");
		this.speed -= 10;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	

}
