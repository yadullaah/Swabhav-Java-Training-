package com.fascadedvd.model;

public class SoundSystem implements ISystem {

	int volume;

	public SoundSystem(int volume) {
		super();
		this.volume = volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void start() {
		System.out.println("Sound system is started");
	}

	@Override
	public void stop() {
		System.out.println("Soud system is stopped");
	}

}
