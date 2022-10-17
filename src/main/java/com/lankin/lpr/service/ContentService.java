package com.lankin.lpr.service;

import com.lankin.lpr.model.Content;

import java.util.List;

public interface ContentService {
    Content addContent(Content content);
    List<Content> getAllContent();
    Content getContentById(long id);
    Content updateContent(Content content, long id);
    void deleteContent(long id);
}
