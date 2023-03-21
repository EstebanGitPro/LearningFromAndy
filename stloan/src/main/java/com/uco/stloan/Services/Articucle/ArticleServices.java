package com.uco.stloan.Services.Articucle;

import com.uco.stloan.dto.ArticleDTO;
import com.uco.stloan.exception.NotFoundEx;
import com.uco.stloan.model.Article;

import javax.validation.Valid;
import java.util.List;

public interface ArticleServices {

    public List<Article> findAll();
    public Article findById(Long id);
    public Article save(Article article);

    public void deleteById(Long id);

    public boolean partialUpdate( long id, String key, String value) throws NotFoundEx;

}
