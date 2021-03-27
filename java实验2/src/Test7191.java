import java.util.Scanner;

class Product {
    String name ;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
class Market{
    String name;
    Product[] goods = new Product[15];
    static int cnt = 0;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setGoods(Product tmp){
        this.goods[cnt++] = tmp;
    }
    Product getGoods(int pos){
        return goods[pos];
    }
    String sell(String ProductName){
        for(int i = 0 ; i < cnt; i++){
            if(getGoods(i).getName().equals( ProductName)){
                return ProductName;
            }
        }
        return null;
    }
}
class Person{
    String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    boolean shopping(Market market,Product product){
        if(market.sell(product.getName()) == null){
            return false;
        }
        else {
            return true;
        }
    }
}

public class Test7191 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Product[] p = new Product[4];
        for(int i = 0 ; i <= 3 ; i++){
            p[i] = new Product();
        }
        p[0].setName("电视机");
        p[1].setName("洗衣机");
        p[2].setName("豆浆机");
        p[3].setName("打印机");
        Market market = new Market();
        for(int i =  0; i <= 3 ; i++){
            market.setGoods(p[i]);
        }
        Person person = new Person();
        person.setName("张乐");

        String shopname = cin.next();
        market.setName(shopname);

        Product goods = new Product();
        goods.setName(cin.next());
        if(person.shopping(market,goods) == true){
            System.out.println(person.getName()+"买到了"+goods.getName());
        }
        else{
            System.out.println(person.getName()+"所需商品无货");
        }
    }
}
