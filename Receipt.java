class Receipt{
    ArrayList<Item> lista = new ArrayList<>();

    public void add_element(Item i){
        lista.add(i);
    }
    public Item delete_element(int index) {
       return lista.remove(index);
    }
    public double suma_smetka(){
        double suma=0;
        for (Item i: lista) {
            suma += i.getPrice();
        }
        return suma;
    }
}