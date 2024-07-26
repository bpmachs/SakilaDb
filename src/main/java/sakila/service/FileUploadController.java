package sakila.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v6")
public class FileUploadController {

	@Autowired
	private  FilmStorageServiceImpl storageService;
	
	
	@PostMapping("/img")
	public ResponseEntity<?> uploadImage(@RequestParam("/img")MultipartFile file) throws IOException{
		String uploadFile = storageService.uploadFile(file);
		return ResponseEntity.status(HttpStatus.OK)
				.body(uploadFile);
	}
	
	@GetMapping("/get/{fileName}")
	public ResponseEntity<?> downloadImage(@PathVariable String fileName){
		byte[] imageData = storageService.downloadFile(fileName);
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.valueOf("image/png"))
				.body(imageData);
	}
}
