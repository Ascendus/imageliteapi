package com.contratarural.imageliteapi.infra.repository;

import com.contratarural.imageliteapi.domain.entity.Image;
import com.contratarural.imageliteapi.domain.enums.ImageExtension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, String>, JpaSpecificationExecutor<Image> {

    default List<Image> findByExtensionAndNameOrTagsLike(ImageExtension extension, String query) {
        return findAll();
    }

}
