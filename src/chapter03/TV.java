package chapter03;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void status() {
		System.out.println(
			"TV[channel=" + channel + 
			", volume="   + volume  +
			", power="    + (power ? "on" : "off") + "]" );
	}

	public void power(boolean on) {
		power = on;
	}

	public void volume(int volume) {
		if(!power) {
			return;
		}
		
		if(volume < 0) {
			volume = 255;
		} else if(volume > 255) {
			volume = 0;
		}
		
		this.volume = volume;
	}

	public void volume(boolean up) {
		volume(volume + (up ? 1 :-1));
	}

	public void channel(int channel) {
		if(!power) {
			return;
		}
		
		if(channel < 0) {
			channel = 100;
		} else if(channel > 100) {
			channel = 0;
		}
		
		this.channel = channel;
	}

	public void channel(boolean up) {
		channel(channel + ( up ? 1 : -1));
	}
}
