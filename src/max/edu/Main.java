package max.edu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ComplexLunch g1 = new ComplexLunch("n1" , 70);
        ComplexLunch g2 = new ComplexLunch("n2" , 80);
        ComplexLunch g3 = new ComplexLunch("n3" , 50);
        ComplexLunch g4 = new ComplexLunch("n4" , 60);
        ComplexLunch g5 = new ComplexLunch("n5" , 90);

        OrderLunch g6 = new OrderLunch("цезарь" , 60 , "Гороговий суп" , 25 ,
                "Картошка з мясом" , 35 ,
                "Песочсний пригог з творогом" , 70);

        OrderLunch g7 = new OrderLunch("нежность" , 30 , "Борщ" , 45 ,
                "сільодка під шубою" , 90 ,
                "Желе" , 45);

        List<IBill> bills = new ArrayList<>();

        bills.add(g1);
        bills.add(g2);
        bills.add(g3);
        bills.add(g4);
        bills.add(g5);
        bills.add(g6);
        bills.add(g7);

        int sum = bills.stream().mapToInt(gest -> gest.getBill()).sum();
        System.out.println(sum);

        int max = bills.stream().mapToInt(gest -> gest.getBill()).max().getAsInt();
        System.out.println(max);

        double average = bills.stream().mapToInt(gest -> gest.getBill()).average().getAsDouble();
        System.out.println(average);

    }
}
