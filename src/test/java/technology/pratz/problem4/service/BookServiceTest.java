package technology.pratz.problem4.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import technology.pratz.problem4.entity.Author;
import technology.pratz.problem4.entity.Book;
import technology.pratz.problem4.repositoty.BookRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService  bookService;

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);

        when(bookService.getAllBooks()).thenReturn(new ArrayList<>());

        when(bookService.getBookById(any())).thenReturn(Optional.of(new Book(1l,"title","isbn",new Author(1l,new ArrayList<>(),"name"))));

        when(bookService.getAllBooks()).thenReturn(new ArrayList<>());

    }


    @Test
    public void testGetAllBooks() throws Exception {
        List<Book> books = bookService.getAllBooks();
        assertEquals(0, books.size());
    }

    @Test
    public void testGetBookById() throws Exception {
        Book book = bookService.getBookById(1l).get();
        assertEquals("title", book.getTitle());

    }
}

