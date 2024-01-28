package ga_Enumerações.Aula01.entities;

import java.util.Date;
import ga_Enumerações.Aula01.entities.enums.OrderStatus;

public class Order {

    private Integer id;
    private Date moment;
    private OrderStatus status;
    private Integer productId;

    public Order() { // Construtor vazio
    }

    public Order(Integer id, Date moment, OrderStatus status) { // Construtor completo
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Order(int orderId, int productId, Date date, OrderStatus orderStatus) { // Construtor para entrada de teclado
        this.id = orderId;
        this.productId = productId;
        this.moment = date;
        this.status = orderStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() { // ToString completo
        return "Order [id=" 
        + id 
        + ", moment=" 
        + moment 
        + ", status=" 
        + status 
        + ", productId=" 
        + productId 
        + "]";
    }
}
