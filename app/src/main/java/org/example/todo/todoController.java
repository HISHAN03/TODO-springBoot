package org.example.todo;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todo")

public class todoController {

    private final todoServices services;

    @Autowired
    public todoController(todoServices services){
        this.services=services;
    }

    @GetMapping
    public List<todo> GetAllTools() {
        return services.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<todo> getTodoByID(@PathVariable Long id){
        Optional<todo> todo = services.getTodoById(id);
        return todo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public todo createTodo(@RequestBody todo todo)
    {
        return services.createTodo(todo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable Long id) {
        services.deleteTodoById(id);
        return ResponseEntity.noContent().build();
    }




}
