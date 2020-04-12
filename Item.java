class Item {
    Character danok;
    int id;
    String name;
    double price;

    public Item(Character danok, int id, String name, double price) {
        this.danok = danok;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Character getDanok() {
        return danok;
    }

    public void setDanok(Character danok) {
        this.danok = danok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double GetTaxReturn() {
        double ddv=0;
        if(danok == 'A'){
            ddv = 0.18 * getPrice();
        }
        else if(danok == 'B'){
            ddv = 0.05 * getPrice();
        }
        else {
            ddv = 0;
        }
        return ddv * 0.15;
    }
}

