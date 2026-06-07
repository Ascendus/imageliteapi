package com.contratarural.imageliteapi.domain.service;

import com.contratarural.imageliteapi.domain.entity.Image;

import java.util.Optional;

public interface ImageService {

    Image save(Image image);

    Optional<Image> getById(String id);

}
