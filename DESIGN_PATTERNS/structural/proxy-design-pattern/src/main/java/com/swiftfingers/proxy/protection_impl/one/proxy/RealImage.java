package com.swiftfingers.proxy.protection_impl.one.proxy;

public class RealImage implements Image {

	protected String fileNameWithPath;

	public RealImage(String fileNameWithPath) {
		this.fileNameWithPath = fileNameWithPath;
		load(); //does early loading -- i.e loads the image as the class is created
	}

	@Override
	public void load() {
		System.out.println("RealImage: Loading image: " + fileNameWithPath);
	}

	@Override
	public void show() {
		System.out.println("RealImage: Showing image: " + fileNameWithPath);
	}

	@Override
	public void showSummary() {
		System.out.println("RealImage: Showing Summary of image: " + fileNameWithPath);
	}

	@Override
	public void resize() {
		System.out.println("RealImage: Resizing image: " + fileNameWithPath);
	}

	@Override
	public void remove() {
		System.out.println("RealImage: Removing image: " + fileNameWithPath);
	}
	
	@Override
	public void close() {
		System.out.println("RealImage: Closing image: " + fileNameWithPath);
	}

	public String getFileNameWithPath() {
		return fileNameWithPath;
	}

	public void setFileNameWithPath(String fileNameWithPath) {
		this.fileNameWithPath = fileNameWithPath;
	}

}
