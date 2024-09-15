import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class NumberOperations {
 public static void main(String[] args) {
     System.out.println("Start...");

     System.out.println("_________________Task 1-6_____________________");

     ArrayList <Number> list = new ArrayList<>();
     list.add(10); list.add(20.5); list.add(30); list.add(40.7); list.add(50); list.add(60.3); list.add(70); list.add(80.1); list.add(90); list.add(100.9);
     list.add((byte) 1);      // Byte
     list.add((short) 2);    // Short
     list.add(3L);          // Long
     list.add(4.0f);         // Float
     //numbers output
     System.out.println("All numbers: " +list);
     //output in another formats
     String s_int = "";  String s_int_big = "";String s_int_small = ""; String s_double = "";
     for (Number n: list) {
        int n1 = n.intValue(); s_int += n1+"; ";
        double n2 = n.doubleValue(); s_double += String.format("%.2f", n2) + "; ";
        double n3 = n2;
        n2 = Math.ceil(n2); int nn = (int)(n2); s_int_big += nn+"; ";
        n3 = Math.floor(n3); nn = (int)(n3); s_int_small += nn+"; ";
     }
     System.out.println("Integers: [ " +s_int +']');
     System.out.println("Round up: [ " +s_int_big +']');
     System.out.println("Round down: [ " +s_int_small +']');
     System.out.println("Doubles: [ " +s_double +']');

     System.out.println("_________________Task 7_____________________");
     ArrayList <Byte> list_b = new ArrayList<Byte>();
     ArrayList <Short> list_s = new ArrayList<Short>();
     ArrayList <Integer> list_i = new ArrayList<Integer>();
     ArrayList <Long> list_l = new ArrayList<Long>();
     ArrayList <Float> list_f = new ArrayList<Float>();
     ArrayList <Double> list_d = new ArrayList<Double>();
     for (Number n: list) {
         if (n instanceof Byte) {list_b.add(n.byteValue());}
         if (n instanceof Short) {list_s.add(n.shortValue());}
         if (n instanceof Integer) {list_i.add(n.intValue());}
         if (n instanceof Long) {list_l.add(n.longValue());}
         if (n instanceof Float) {list_f.add(n.floatValue());}
         if (n instanceof Double) {list_d.add(n.doubleValue());}

     }
     System.out.println("Byte list: " + list_b + "\n" +
             "Short list: " + list_s + "\n" +
             "Integer list: " + list_i + "\n" +
             "Long list: " + list_l + "\n" +
             "Float list: " + list_f + "\n" +
             "Double list: " + list_d);

     System.out.println("_________________Task 9_____________________");

     BigInteger bi = new BigInteger("111111111111111111111");
     BigDecimal bd = new BigDecimal("12.123456789123456789");
     int i = 10;
     System.out.println("BigInteger: " +bi);
     System.out.println("BigDecimal: " +bd);
     //bd+bi
     BigDecimal bdFromBi = new BigDecimal(bi); //BigInteger to BigDecimal
     BigDecimal sum = bdFromBi.add(bd);
     System.out.println("Sum bd+bi: " + sum);
     //bd+int
     BigDecimal bdFromInt = BigDecimal.valueOf(i);//int to BigDecimal
     BigDecimal sum2 = bd.add(bdFromInt);
     System.out.println("Sum bd+int: " + sum2);

     System.out.println("_________________Variant task 3_____________________");

     BigDecimal result = BigDecimal.ONE;
     int size = list.size();
     int endIndex = Math.min(5, size);
        // First 5
     for (int numb = 0; numb < endIndex; numb++) {
         result = result.multiply(BigDecimal.valueOf(list.get(numb).doubleValue()));
     }
     System.out.println("Product of the first 5 numbers: " + result.stripTrailingZeros().toPlainString());

     result = BigDecimal.ONE;
     int startIndex = Math.max(0, size - 5);
        // Last 5
     for (int numb = startIndex; numb < size; numb++) {
         result = result.multiply(BigDecimal.valueOf(list.get(numb).doubleValue()));
     }
     System.out.println("Product of the last 5 numbers: " + result.stripTrailingZeros().toPlainString());

     System.out.println("___________________________________________\nFinished");

 }

}