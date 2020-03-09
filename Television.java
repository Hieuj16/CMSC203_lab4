package lab4_HieuTran;

/**
 * 
 *The purpose of this class is to model a television
 *Hieu Tran
 *March 08,2020	
 *
 */


public class Television {
	private final String MANUFACTURER; // the brand name
	private final int SCREEN_SIZE; // the screen size
	private boolean powerOn; // true/false condition
	private int channel; // the channel's value
	private int volume; // the volume's value
	
	public Television(String brand,int size) {
		this.MANUFACTURER=brand; // hold brand name
		this.SCREEN_SIZE=size; // hold the size of the television screen
		powerOn=false; // true if the power's on; otherwise, power's off if false
		volume=20; // hold the number value representing the loudness
		channel=2; // hold the value of the station
	}
	/**
	 * getVolume method
	 * @return the value of volume
	 */
	int getVolume(){
		return volume;
	}
	/**
	 * getChannel method
	 * @return the value of the station
	 */
	int getChannel(){
		return channel;
	}
	/**
	 * getManufacturer method
	 * @return the brand name
	 */
	String getManufacturer(){
		return MANUFACTURER;
	}
	/**
	 * getScreenSize method
	 * @return the value of screen size
	 */
	int getScreenSize(){
		return SCREEN_SIZE;
	}
	/**
	 * setChnnel method
	 * @param station the value being stored in the channel
	 */
	void setChannel(int station) {
		this.channel=station;
	}
	/**
	 * power method
	 * true or false statement that changes power on or off
	 */
	void power() {
	if(!powerOn) 
		powerOn=!powerOn;
	}
	/**
	 * increseVolume method
	 * the volume will be increased by 1
	 */
	void increaseVolume() {
		volume+=1;
	}
	/**
	 * decreaseVolume method
	 * the volume will be decreased by 1
	 */
	void decreaseVolume() {
		volume-=1;
	}
	
}
