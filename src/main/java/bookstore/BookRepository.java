package bookstore;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends PagingAndSortingRepository<Book, Long>{

}