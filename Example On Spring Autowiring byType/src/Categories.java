public class Categories {

       private String cname;
       private Book bk;

    public String getcName() {
        return cname;
    }

    public void setcName(String cname) {
        this.cname = cname;
    }

    public Book getBk() {
        return bk;
    }

    public void setBk(Book bk) {
        this.bk = bk;
    }

    public void show()
    {
        System.out.println("Categories name :"+cname);
        System.out.println("Book name :"+bk.getBookname()+" and Book Price :"+bk.getBookprice());
    }
        

}