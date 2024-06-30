class Item {
    
    int itemId;
    double price;
    String description;
    String title;
    int quantity;

    public Item(int itemId, double price, String description, String title, int quantity) {
        this.itemId = itemId;
        this.price = price;
        this.description = description;
        this.title = title;
        this.quantity = quantity;
    }

    public void displayItem() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    public int  getItemId() {
        return itemId;
    }

    public void setItemId(int  itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


