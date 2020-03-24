package iterator;

public class Channel {
	private double frequency;
	private ChannelType channelType;

	public Channel(double freq, ChannelType type) {
		this.frequency = freq;
		this.channelType = type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelType getChannelType() {
		return channelType;
	}

	@Override
	public String toString() {
		return "Frequency=" + this.frequency + ", Type=" + this.channelType;
	}

}
