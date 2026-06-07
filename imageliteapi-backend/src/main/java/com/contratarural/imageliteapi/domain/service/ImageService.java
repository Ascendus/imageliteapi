package com.contratarural.imageliteapi.domain.service;

import com.contratarural.imageliteapi.domain.entity.Image;
import com.contratarural.imageliteapi.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {

    Image save(Image image);

    Optional<Image> getById(String id);

    List<Image> search(ImageExtension extension, String query);

}
