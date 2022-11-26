import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> map= new HashMap<>();
        map.put("Вася",+7675);
        map.put("Петя",+7175);
        map.put("Вова",+7375);

        System.out.println(map.keySet()+":"+map.values());
    }
}