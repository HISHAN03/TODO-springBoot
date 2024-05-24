package org.example.todo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class todoServices {

    private final todoRepo repository;

    public todoServices(todoRepo repository) {
        this.repository = repository;
    }

    public List<todo> getAllTodos() {
        return repository.findAll();
    }

    public Optional<todo> getTodoById(Long id) {
        return repository.findById(id);
    }

    public todo createTodo(todo todo) {
        return repository.save(todo);
    }

    public void deleteTodoById(Long id) {
        repository.deleteById(id);
    }










}
