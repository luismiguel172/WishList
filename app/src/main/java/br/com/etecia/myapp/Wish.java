package br.com.etecia.myapp;

public class Wish {
    private int id;
    private String wish;
    private int rating;
    private String categoria;

    public Wish(int id, String wish, int rating, String categoria){
        this.id = id;
        this.wish = wish;
        this.rating = rating;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
