package com.lankin.lpr.service.Impl;

import com.lankin.lpr.exception.ResourceNotFoundException;
import com.lankin.lpr.model.Content;
import com.lankin.lpr.repository.ContentRepository;
import com.lankin.lpr.service.ContentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    private ContentRepository contentRepository;

    public ContentServiceImpl (ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public Content addContent(Content content) {
        return contentRepository.save(content);
    }

    @Override
    public List<Content> getAllContent() {
        return contentRepository.findAll();
    }

    @Override
    public Content getContentById(long id) {
        return contentRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Content", "Id", id));
    }

    @Override
    public Content updateContent(Content content, long id) {
        Content existingContent = contentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Content", "Id", id));

        existingContent.setTitle(content.getTitle());
        existingContent.setInfo(content.getInfo());
        existingContent.setLink(content.getLink());
        contentRepository.save(existingContent);
        return existingContent;
    }

    @Override
    public void deleteContent(long id) {
        contentRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Content", "Id", id));
        contentRepository.deleteById(id);
    }
}
