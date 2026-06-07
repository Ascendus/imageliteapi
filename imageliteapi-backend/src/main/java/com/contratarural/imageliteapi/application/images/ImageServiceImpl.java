package com.contratarural.imageliteapi.application.images;

import com.contratarural.imageliteapi.domain.entity.Image;
import com.contratarural.imageliteapi.domain.service.ImageService;
import com.contratarural.imageliteapi.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    @Transactional
    public Image save(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Optional<Image> getById(String id) {
        return imageRepository.findById(id);
    }

}
