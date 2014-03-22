package com.rezwan.service;

import java.util.List;
import com.rezwan.model.Album;

public interface AlbumService {
	public void saveAlbum(Album album); 
	public void updateAlbum(Album album); 
	public void deleteAlbum(String id); 
	public List<Album> getAllAlbums(); 
}
