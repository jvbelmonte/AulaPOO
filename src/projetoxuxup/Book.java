package projetoxuxup;

public class Book {

private String author;
private String title;
private String refNumber;
private int pages;
private int borrowed = 0;


    public Book (String author, String title,String refNumber, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.refNumber = "";   
    }

    public String getAuthor(){
       return author;
    }

    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public int getBorrow(){
        return borrowed;
    }

    public void printTitle(){
        System.out.println("Título: " + title);
    }

    public void printAuthor(){
        System.out.println("Author: "+ author);
    }

    public void printDetails(){
        if(refNumber.isEmpty()){
            System.out.println("Author: "+author
                    +"\nTítulo: "+title
                    +"\nPages: "+pages
                    +"\nNúmero de Referência: ZZZ"
                    +"\nEmprestado: " +borrowed+ "vezes");
        }else{
            System.out.println("Author: "+author
                    +"\nTítulo: "+title
                    +"\nPages: "+pages
                    +"\nNúmero de Referência: " + refNumber
                    +"\nEmprestado: " +borrowed+ "vezes");
        }
    }

    public void setRefNumber(String ref){
        if(ref.length() >= 3 ){
            this.refNumber =  ref;
        }else{
            System.out.printf("ERRO: refNumber não atingiu o minimo de 3 caracteres");
        }
    } 

    public void borrow(){
        borrowed++;
    }


}