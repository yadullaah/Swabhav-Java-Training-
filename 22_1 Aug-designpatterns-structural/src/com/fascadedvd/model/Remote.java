package com.fascadedvd.model;

public class Remote {

	DVDPlayer dvd = new DVDPlayer();
	Projector projector = new Projector();
	SoundSystem soundsystem = new SoundSystem(50);

	public void startMovie() {

		dvd.on();

		projector.on();

		soundsystem.start();

		dvd.start();

	}

	public void stopMovie() {

		dvd.off();

		projector.off();

		soundsystem.stop();

		dvd.stop();

	}

}
