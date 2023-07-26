package global.govstack.example.bb.emulator.repository;

import global.govstack.example.bb.emulator.model.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, String> {}
