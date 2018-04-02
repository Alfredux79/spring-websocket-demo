package io.alfredux.websocket.model;

public class OutputMessage extends Message {

	private String time;
	
	public OutputMessage(String from, String text, String time) {
		setFrom(from);
		setText(text);
		this.setTime(time);
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
