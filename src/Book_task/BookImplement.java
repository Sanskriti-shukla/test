package Book_task;

public class BookImplement {
         public static void main(String[] args) {
         Book book= new Book();
         discountedData();
         displayData();


    }
         public static void displayData(){
         Book book= new Book(123,"core java","sanskriti",345);
         System.out.println("isbn"+ book.isbn+"\ntitle"+ book.title+"\nauthor"+book.author+"\n"+book.price);
    }
        public static void discountedData(){
        int discountedPercent=10;
        int discountedPrice=500*discountedPercent/100;
        int finalAmount=500-discountedPrice;
        System.out.println("Final Amount"+"="+finalAmount);
}
}
