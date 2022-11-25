//package File_Handling;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//
//public class Line_Print {
//
//    public static String readFileAsString(String fileName)throws Exception
//    {
//        String data ;
//        data = new String(Files.readAllBytes(Paths.get(fileName)));
//        return data; }
//    public static void main(String[] args) throws Exception {
//        List<String> list = new ArrayList<>();
//        String data = readFileAsString("C:\\Users\\TRPC05\\Desktop\\bubble-1.1\\Test project\\text-file.txt");
//        System.out.println(data);
//        String[] words = data.split("\\s");
//        Collections.addAll(list, words);
//        System.out.println(list);
//        Map<String, Integer> map= new HashMap<>();
//      Set<String > s= new HashSet<>(list);
//        System.out.println(s);
//        for (String words : s) {
//          int frequency= Collections.frequency(list,words);
//            System.out.println(frequency);
//            map.put(words,frequency);
//        }
//        System.out.println(map);
//   LinkedHashMap<String, Integer> sortedmap =new  LinkedHashMap<>();
//   sortedmap.entrySet().stream().sorted(Map.Entry.comparingByValue())
//           .forEachOrdered(x -> sortedmap.put(x.getKey(),x.getValue()));
//        System.out.println("sorted Map :"+sortedmap);
//   int i=0;
//        for (Map.Entry<String, Integer> stringIntegerEntry : sortedmap.entrySet()) {
//            if (i>10) {
//                break;
//            }else {
//                System.out.println(stringIntegerEntry.getValue() +" ="+ stringIntegerEntry.getKey());
//                i++;
//            }
////            System.out.println();
//
//        }
//
//    }}
