package com.module4.minitest1.service.impl;

import com.module4.minitest1.model.Picture;
import com.module4.minitest1.service.IPictureService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PictureSeviceImpl implements IPictureService
{

    private static final Map<Long, Picture> pictures;

    static {

        pictures = new HashMap<>();
        pictures.put(1L, new Picture(1L,"15PT0325", 127, 87,"Wood","Beautiful picture", 5000000 ));
        pictures.put(2L, new Picture(2L,"15PT0370", 178, 85,"Wood","Beautiful picture", 7000000 ));
        pictures.put(3L, new Picture(3L,"15PT0329", 150, 70,"Wood","Beautiful picture", 2500000 ));
    }

    @Override
    public List<Picture> findAll() {
        return new ArrayList<>(pictures.values());
    }

    @Override
    public Picture findById(Long id)
    {
        return pictures.get(id);
    }

    @Override
    public void save(Picture picture)
    {
        picture.setId((long)pictures.size()+1);
        pictures.put(picture.getId(), picture);
    }
    @Override
    public void update(Long id, Picture picture)
    {
        pictures.put(id, picture);
    }

    @Override
    public void remove(Long id)
    {
      pictures.remove(id);
    }
}
