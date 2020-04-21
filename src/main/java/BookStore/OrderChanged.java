
package BookStore;

import java.util.Date;

public class OrderChanged extends AbstractEvent {

    private Long id;
    private String book_name;
    private Integer book_qty;
    private String status;
    private Long order_id;
    private Date change_date;
    private Long price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getBookName() {
        return book_name;
    }

    public void setBookName(String book_name) {
        this.book_name = book_name;
    }
    public Integer getBookQty() {
        return book_qty;
    }

    public void setBookQty(Integer book_qty) {
        this.book_qty = book_qty;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Long getOrderId() {
        return order_id;
    }

    public void setOrderId(Long order_id) {
        this.order_id = order_id;
    }
    public Date getChangeDate() {
        return change_date;
    }

    public void setChangeDate(Date change_date) {
        this.change_date = change_date;
    }
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
