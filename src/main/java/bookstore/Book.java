package bookstore;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name="Book_table")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String bookName;
    private Integer bookQty;
    private Long price;

    @PostPersist
    public void onPostPersist(){
        BookRegisterd bookRegisterd = new BookRegisterd();
        BeanUtils.copyProperties(this, bookRegisterd);
        bookRegisterd.publish();


    }

    @PostUpdate
    public void onPostUpdate(){
        BookChanged bookChanged = new BookChanged();
        BeanUtils.copyProperties(this, bookChanged);
        bookChanged.publish();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public Integer getBookQty() {
        return bookQty;
    }

    public void setBookQty(Integer bookQty) {
        this.bookQty = bookQty;
    }
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }




}
