package com.lankin.lpr.controller;

import com.lankin.lpr.model.Content;
import com.lankin.lpr.service.ContentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private ContentService contentService;

    public ContentController (ContentService contentService) {
        this.contentService = contentService;
    }

    @PostMapping
    public ResponseEntity<Content> addContent(@RequestBody Content content){
        return new ResponseEntity<Content>(contentService.addContent(content), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Content> getAllContent(){
        return contentService.getAllContent();
    }

    @GetMapping("{id}")
    public ResponseEntity<Content> getContentById(@PathVariable("id") long contentId){
        return new ResponseEntity<Content>(contentService.getContentById(contentId), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Content> updateContent(@PathVariable("id") long id
            ,@RequestBody Content content){
        return new ResponseEntity<Content>(contentService.updateContent(content, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteContent(@PathVariable("id") long id){
        contentService.deleteContent(id);
        return new ResponseEntity<String>("Content deleted successfully!", HttpStatus.OK);
    }
}
