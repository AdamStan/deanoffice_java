package deanoffice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import deanoffice.model.info.Article;

@RestController
@RequestMapping(path = "/all")
public class OpenAccessController {
    @GetMapping(path = "/news")
    public @ResponseBody List<Article> getTheNewestArticles() {
        return Arrays.asList(new Article("art1"), new Article("art2"));
    }
}
