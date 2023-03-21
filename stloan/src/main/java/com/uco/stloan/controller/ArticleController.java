package com.uco.stloan.controller;



import com.uco.stloan.Services.Articucle.ArticleServices;

import com.uco.stloan.dto.ArticleDTO;
import com.uco.stloan.dto.PatchDTO;
import com.uco.stloan.exception.NotFoundEx;
import com.uco.stloan.exception.NotYetImplementedEx;
import com.uco.stloan.exception.ResourceBadRequest;
import com.uco.stloan.model.Article;
import com.uco.stloan.web.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rest/articles")
public class ArticleController {

    @Autowired
    private ArticleServices articleService;

    @GetMapping
    public ResponseEntity<Response> listArticles() {
        return Response.createResponse(HttpStatus.OK, articleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> articleById( @PathVariable Long id ) {
        return Response.createResponse(HttpStatus.OK, articleService.findById(id) );
    }

    @PostMapping
    public ResponseEntity<Response> create(@Valid @RequestBody ArticleDTO article, BindingResult result) {
        if(result.hasErrors()){
            throw new ResourceBadRequest("Article bad request",result);
        }

        Article newArticle = new Article(article.getRef(),article.getName(),article.getQuantity(),
                                        article.getStatus());
        return Response.createResponse(HttpStatus.CREATED,articleService.save(newArticle));
    }

    @DeleteMapping
    public void delete ( @RequestParam(required = true) Long id ){
        articleService.deleteById (id);
    }

    @PutMapping
    public ResponseEntity<Response> edit(@Valid @RequestBody ArticleDTO article,
                                        BindingResult result,
                                        @RequestParam(required = true) Long id ){

        Article articleDB = null;
        Article articleCurrent;

        articleDB = articleService.findById(id);
        if(articleDB == null){
            throw new ResourceBadRequest("Article bad request", result);
        }

        articleCurrent = new Article(article.getRef(),article.getName(),article.getQuantity(),article.getStatus());

        articleDB.setRef(articleCurrent.getRef());
        articleDB.setName(articleCurrent.getName());
        articleDB.setQuantity(articleCurrent.getQuantity());
        articleDB.setStatus(articleCurrent.getStatus());

        return Response.createResponse(HttpStatus.CREATED,articleService.save(articleDB));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Boolean> updatePartially(@PathVariable(name = "id") int id,
                                                   @RequestBody PatchDTO dto) throws NotYetImplementedEx, NotFoundEx {
        // skipping validations for brevity
        if (dto.getOp().equalsIgnoreCase("update")) {
            boolean result = articleService.partialUpdate(id, dto.getKey(), dto.getValue());
            return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
        } else {
            throw new NotYetImplementedEx("NOT_YET_IMPLEMENTED");
        }
    }



}
