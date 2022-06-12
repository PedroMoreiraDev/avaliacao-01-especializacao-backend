package Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("MOVIE")
public interface ConfigFeign {

    @RequestMapping(method = RequestMethod.GET, value = "movies/{genre}")
    List<Object> findMovie(@PathVariable String genre);
}
