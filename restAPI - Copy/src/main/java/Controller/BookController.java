package Controller;

import Entity.Book;
import com.example.restAPI.model.dto.BookRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/book")
public class BookController {
    private ConcurrentHashMap<String, Book> books;

    public BookController(){
        books = new ConcurrentHashMap<>();
        books.put("0x-91", new Book("0x-91","NTA","Anti",2010));
        books.put("01x-91", new Book("01x-91","NTA","Anti",2010));
    }
    @GetMapping("")
    public List<Book> getBooks(){
        return books.values().stream().toList();
    }
    @PostMapping
    public Book createBook(@RequestBody BookRequest request){
        String uuid = UUID.randomUUID().toString();
        Book newbooks = new Book(uuid, request.title(),request.author(),request.year());
        books.put(uuid,newbooks);
        return newbooks;
    }
    @GetMapping(value = "/{id}")
    public Book getBookById(@PathVariable("id") String id){
        return books.get(id);
    }
    @PutMapping(value = "/{id}")
    public Book UpdateBookById(@PathVariable("id") String id, @RequestBody BookRequest request){
        Book updateBook = new Book(id, request.title(),request.author(),request.year());
        books.put(id, updateBook);
        return updateBook;
    }
    @DeleteMapping(value = "/{id}")
    public Book DeleteBookById(@PathVariable("id") String id){
        return books.remove(id);
    }
}
