package com.module4.minitest1.service;


import com.module4.minitest1.model.Picture;

import java.util.List;

public interface IPictureService
{

    List<Picture> findAll();

    Picture findById(Long id);

    void save(Picture picture);

    void update(Long id, Picture picture);

    void remove(Long id);


}
