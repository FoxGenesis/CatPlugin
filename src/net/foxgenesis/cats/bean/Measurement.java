package net.foxgenesis.cats.bean;

public class Measurement {

	private String imperial;
	private String metric;

	public String getImperial() {
		return imperial;
	}

	public void setImperial(String imperial) {
		this.imperial = imperial;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	@Override
	public String toString() {
		return "Measurement [" + (imperial != null ? "imperial=" + imperial + ", " : "")
				+ (metric != null ? "metric=" + metric : "") + "]";
	}
}
