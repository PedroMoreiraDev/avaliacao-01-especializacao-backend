package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogImpl implements ICatalog {
    @Autowired
    private ConfigFeign configFeign;

    @Override
    public List<Object> getMovie(String genre) {
        return configFeign.findMovie(genre);
    }
}
