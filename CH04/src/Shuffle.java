import java.util.*;

public class Shuffle {
    public static void main(String[] args) {

        //存放54张牌的编号
        List<Integer> list = new ArrayList<>();

        //保存牌的信息
        Map<Integer, String> map = new HashMap<>();

        //定义四种花色和13张牌
        String [] suits = {"红桃", "黑桃", "方块", "梅花"};
        String [] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //记录54张牌，从0～53    
        int index = 0;

        //存储牌信息到上面两个集合
        for(String rank : ranks) {
            for(String suit : suits) {
                map.put(index, suit + rank);
                list.add(index);
                index++;
            }
        }
        
        //处理大小王
        map.put(52, "小王");
        map.put(53, "大王");
        list.add(52);
        list.add(53);

        // System.out.printf("\t" + map);
        
        //发牌之前先打乱牌的顺序（洗牌）
        Collections.shuffle(list); //打乱0～53张牌
        
        //看一下打乱的牌
        System.out.printf("\t" + list);
        System.out.printf("%n");

        //发牌准备四个人，六张底牌
        List<Integer> p1 = new ArrayList<>();    //第一个人
        List<Integer> p2 = new ArrayList<>();    //第二个人
        List<Integer> p3 = new ArrayList<>();    //第三个人
        List<Integer> p4 = new ArrayList<>();    //第四个人
        List<Integer> bottom = new ArrayList<>();    //底牌

        //重新发牌
        for(int i = 0; i < list.size(); i++) {
            if(i < 6) {
                bottom.add(list.get(i));
            }
            else if (i % 4 == 2) {
                p1.add(list.get(i));
            } else if (i % 4 == 3) {
                p2.add(list.get(i));
            }   else if (i % 4 == 0) {
                p3.add(list.get(i));
            } else {
                p4.add(list.get(i));
            }
        }
        

        //将自己的牌排个序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(p4);
        Collections.sort(bottom);

        //看每个人的牌
        show("根生", p1, map);
        show("海涛", p2, map);
        show("廖勇", p3, map);
        show("欧阳", p4, map);
        show("底牌", bottom, map);
    }

    private static void show(String name, List<Integer> list, Map<Integer, String> map) {
        //搜先看到名字
        System.out.print(name+":    ");

        for(Integer in:list) {
            String value = map.get(in);
            System.out.print(value+"  ");
        }
        System.out.println();
    }
}
