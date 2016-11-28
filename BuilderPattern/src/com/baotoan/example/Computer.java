package com.baotoan.example;

public class Computer {
	// Required
	private String HDD;
	private String RAM;
	// Optional
	private boolean isGraphicCardEnable;
	private boolean isBluetoothEnable;

	private Computer(ComputerBuilder computerBuilder) {
		this.HDD = computerBuilder.HDD;
		this.RAM = computerBuilder.RAM;
		this.isGraphicCardEnable = computerBuilder.isGraphicCardEnable;
		this.isBluetoothEnable = computerBuilder.isBluetoothEnable;
	}

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicCardEnable() {
		return isGraphicCardEnable;
	}

	public boolean isBluetoothEnable() {
		return isBluetoothEnable;
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicCardEnable=" + isGraphicCardEnable
				+ ", isBluetoothEnable=" + isBluetoothEnable + "]";
	}

	public static class ComputerBuilder {
		// Required
		private String HDD;
		private String RAM;
		// Optional
		private boolean isGraphicCardEnable;
		private boolean isBluetoothEnable;

		public ComputerBuilder(String hDD, String rAM) {
			super();
			HDD = hDD;
			RAM = rAM;
		}

		public ComputerBuilder setGraphicCardEnable(boolean isGraphicCardEnable) {
			this.isGraphicCardEnable = isGraphicCardEnable;
			return this;
		}

		public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
