package pl.venustus.ExSpringApi.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ComputerApi {

    List<Computer> computers;

    public ComputerApi() {
        Computer computer1 = new Computer("dd1", 1000, 10);
        Computer computer2 = new Computer("dd2", 9000, 10);
        computers = Arrays.asList(computer1, computer2);
    }

    @PostMapping("api/computer/add")
    public void addComputer(@RequestBody Computer computer) {

    }

    @GetMapping("/api/computer/get")
    public List<Computer> getComputer() {
        return computers;
    }


}
