package pl.venustus.ExSpringApi.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ComputerApi {

    List<Computer> computers = new ArrayList<>();

    public ComputerApi() {
        Computer computer1 = new Computer(1, "dd1", 1000, 10);
        Computer computer2 = new Computer(2, "dd2", 9000, 10);
        computers.add(computer1);
        computers.add(computer2);
    }

    @PostMapping("api/computers/add")
    public void addComputer(@RequestBody Computer computer) {
        computers.add(computer);
    }

    @GetMapping("/api/computers/get")
    public List<Computer> getComputer() {
        return computers;
    }

    @DeleteMapping("/api/computers/remove")
    public boolean removeCompurer(@RequestParam long id) {
        Optional<Computer> first = computers.stream().filter(x -> x.getId() == id).findFirst();
        if (first.isPresent()) {
            return computers.remove(first.get());
        }
        return false;
    }

}
