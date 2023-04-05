package Other;

import java.util.*;

public class FindDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String names[] = new String[n];
        int prices[] = new int[n];
        int weights[] = new int[n];
        for (int i = 0; i<n; i++){
            names[i] = sc.nextLine();
        }
        for (int i = 0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            weights[i] = sc.nextInt();
        }
        sc.close();

        List<Product> prods = new ArrayList<Product>();


        for (int i = 0; i<n; i++){
            prods.add(new Product(names[i],prices[i], weights[i]));
        }

        int count = 0;
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j < n;j++) {
                if (prods.get(i).equals(prods.get(j))){
                    count++;
                    break;
                }
            }
        }

        System.out.println("Result : "+(count));

    }
}

class Product{
    String name; Integer price; Integer weight;
    public Product(String name, Integer price, Integer weight){
        this.name= name;
        this.price= price;
        this.weight= weight;
    }

    @Override
    public boolean equals(Object obj) {
        Product comp = (Product) obj;
        return this.name.equals(comp.name) && this.price.equals(comp.price) && this.weight.equals(comp.weight);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", weight=" + weight + "]";
    }
}