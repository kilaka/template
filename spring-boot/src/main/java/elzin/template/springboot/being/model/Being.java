package elzin.template.springboot.being.model;

import org.springframework.data.annotation.Id;

public class Being {

    @Id
    private String id;

    public String name;
}
