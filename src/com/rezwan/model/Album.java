package com.rezwan.model;

import java.io.Serializable;

public class Album implements Serializable {
	
	private long albumId;
	private long artistId;
	private long albumTypeId; 
	private String name;
	private int firstReleased; 
	private int countryId; 
	
	public long getAlbumId() {
		return albumId;
	}
	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}
	public long getArtistId() {
		return artistId;
	}
	public void setArtistId(long artistId) {
		this.artistId = artistId;
	}
	public long getAlbumTypeId() {
		return albumTypeId;
	}
	public void setAlbumTypeId(long albumTypeId) {
		this.albumTypeId = albumTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstReleased() {
		return firstReleased;
	}
	public void setFirstReleased(int firstReleased) {
		this.firstReleased = firstReleased;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	
}
