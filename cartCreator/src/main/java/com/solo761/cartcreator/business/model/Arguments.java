package com.solo761.cartcreator.business.model;

public class Arguments {
	
	private String inputFile;
	private CartTypes cartType;
	private String outputFile;
	private String crtExtension = ".crt";
	private String binExtension = ".bin";
	private boolean makeCRT;
	private boolean makeBin;
	private boolean help;
	private String errors;
	
	public String getInputFile() {
		return inputFile;
	}
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	public CartTypes getCartType() {
		return cartType;
	}
	public void setCartType(CartTypes cartType) {
		this.cartType = cartType;
	}
	public String getOutputFile() {
		return outputFile;
	}
	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}
	public String getCrtExtension() {
		return crtExtension;
	}
	public void setCrtExtension(String crtExtension) {
		this.crtExtension = crtExtension;
	}
	public String getBinExtension() {
		return binExtension;
	}
	public void setBinExtension(String binExtension) {
		this.binExtension = binExtension;
	}
	public boolean isMakeCRT() {
		return makeCRT;
	}
	public void setMakeCRT(boolean makeCRT) {
		this.makeCRT = makeCRT;
	}
	public boolean isMakeBin() {
		return makeBin;
	}
	public void setMakeBin(boolean makeBin) {
		this.makeBin = makeBin;
	}
	public boolean isHelp() {
		return help;
	}
	public void setHelp(boolean help) {
		this.help = help;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	
}
