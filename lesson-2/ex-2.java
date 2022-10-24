


class MP3Player {
	private String song;
	private int volume;
	private int playbackSpeed;
	public MP3Player(String song, int volume){
	this.song = song;
	this.volume = volume;
	this.playbackSpeed = 1;
	}

	public void setVolume(int volume){
	this.volume = volume;
	}

	public void setSong(String song){
	this.song = song;
	}

	public int getVolume(){
	return this.volume;
	}
	

	public String getSong(){
	return this.song;
	}

	public void setPlaybackSeed(int playbackSpeed){
		this.playbackSpeed = playbackSpeed;
	}

	public int getPlaybackSpeed(int playbackSpeed){

		return this.playbackSpeed;
	}


	


}
