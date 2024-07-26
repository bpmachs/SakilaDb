package sakila.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FilmStorageService {
	
	String uploadFile(MultipartFile file) throws IOException;
	
	//void downloadFile();
	
	 //void listAllFiles();

	byte[] downloadFile(String fileName);
	
	
}
