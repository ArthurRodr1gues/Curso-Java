package d_pOO.entities;

public class I_ProductConstrutor {
            
        public String name;
        public double price;
        public int quantity;
        public Object sc;

        public I_ProductConstrutor(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }        

        

       public double totalValueInStock(){
            return price * quantity;
        }

        public void addProducts (int quantity){
            this.quantity += quantity; //o this especifica que o quantity que ele usará será o atributo da classe
        }

        public void removeProducts (int quantity){
            this.quantity -= quantity;
        }

        public String toString() {
            return name
            + ", $ "
            + String.format("%.2f",price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f",totalValueInStock()); //estabelecendo a qtd casas decimais
        }
    }

