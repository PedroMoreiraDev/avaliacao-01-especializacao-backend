package Controller;

import Service.ICatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/catalog")
public class CatalogController {
    @Autowired
    private ICatalog iCatalog;

    @GetMapping("/{genre}")
    public List<Object> findMovie(@PathVariable String genre){
        return iCatalog.getMovie(genre);
    }
}
