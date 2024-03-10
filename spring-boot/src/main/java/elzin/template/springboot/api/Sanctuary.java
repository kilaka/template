package elzin.template.springboot.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/sanctuary")
public class Sanctuary {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final List<Object> beings = new LinkedList<>();

    @SneakyThrows
    @PostMapping
    public void enter(@RequestBody Object being) {
        System.out.println("Entered a living being: " +
                objectMapper.writeValueAsString(being));
        beings.add(being);
    }

    @GetMapping
    public List<?> listAll() {
        return beings;
    }
}
