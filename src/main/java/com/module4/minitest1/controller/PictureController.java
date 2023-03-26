package com.module4.minitest1.controller;

import com.module4.minitest1.model.Picture;
import com.module4.minitest1.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/pictures")
public class PictureController
{
    @Autowired
    IPictureService pictureService;

    @GetMapping("/")
    public String index(Model model) {

        List<Picture> pictureList = pictureService.findAll();
        model.addAttribute("pictures", pictureList);
        return "/home";
    }
    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable("id") Long id)
    {
        Picture picture = pictureService.findById(id);
        ModelAndView model = new ModelAndView();
        model.addObject("status", 1);
        model.addObject("picture", picture);
        model.setViewName("/edit");
        return model;
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Long id, Model model) {
        model.addAttribute("picture", pictureService.findById(id));
        return "/view";
    }
    @GetMapping("/{id}/delete")
    public String remove(@PathVariable("id") Long id)
    {
        pictureService.remove(id);
        return "redirect:/pictures/";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("picture", new Picture());
        model.addAttribute("status", 0);
        return "/edit";
    }
    @PostMapping("/updatePicture")
    public String update(@ModelAttribute("picture") Picture picture)
    {
        Picture updatePicture = pictureService.findById(picture.getId());

        if (updatePicture == null)
        {
            updatePicture = picture;
            pictureService.save(updatePicture);
        }
        else
        {
            updatePicture.setPictureCode(picture.getPictureCode());
            updatePicture.setPictureDescribe(picture.getPictureDescribe());
            updatePicture.setPictureMaterial(picture.getPictureMaterial());
            updatePicture.setPictureHeight(picture.getPictureHeight());
            updatePicture.setPicturePrice(picture.getPicturePrice());
            pictureService.update(updatePicture.getId(), updatePicture);
        }
        return "redirect:/pictures/";
    }
}
