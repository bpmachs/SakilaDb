package sakila.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import sakila.model.ImageData;
import sakila.repository.StorageRepository;
import sakila.utils.ImageUtils;

@Service
public class FilmStorageServiceImpl implements FilmStorageService{

	@Autowired
	private StorageRepository storageRepo;
	
	
	@Override
	public String uploadFile(MultipartFile file) throws IOException {
		
		ImageData imageData = storageRepo.save(ImageData.builder()
				.name(file.getName())
				.type(file.getContentType())
				.imageData(ImageUtils.compressImage(file.getBytes()))
				.build())
				;
		if(imageData != null) {
			return "file uploaded successfully : " + file.getOriginalFilename();
		}
		return null;
		
	}

	
	public byte[] downloadFile(String fileName){
        Optional<ImageData> dbImageData = storageRepo.findByName(fileName);
        byte[] images=ImageUtils.decompressImage(dbImageData.get().getImageData());
        return images;
    }

//	@Override
//	public void listAllFiles() {
//		// TODO Auto-generated method stub
//		
//	}

}
