package cc.openhome;

public class Gamble {

    /**
     * 古代赌局 【编程题】(满分23分) 俗话说：十赌九输。因为大多数赌局的背后都藏有阴谋。不过也不尽然，有些赌局背后藏有的是：“阳谋”。
     * 有一种赌局是这样的：桌子上放六个匣子，编号是1至6。多位参与者（以下称玩家）可以把任意数量的钱押在某个编号的匣子上。
     * 所有玩家都下注后，庄家同时掷出3个骰子（骰子上的数字都是1至6）。输赢规则如下： 
     * 1. 若某一个骰子上的数字与玩家所押注的匣子号相同，则玩家拿回自己的押注，庄家按他押注的数目赔付（即1比1的赔率）。 
     * 2. 若有两个骰子上的数字与玩家所押注的匣子号相同，则玩家拿回自己的押注，庄家按他押注的数目的2倍赔付（即1比2的赔率）。 
     * 3. 若三个骰子上的数字都与玩家所押注的匣子号相同，则玩家拿回自己的押注，庄家按他押注的数目的6倍赔付（即1比6的赔率）。 
     * 4. 若玩家所押注匣子号与某个骰子示数乘积等于另外两个骰子示数的乘积，则玩家拿回自己的押注，庄家也不赔付（流局）。 
     * 5. 若以上规则有同时满足者，玩家选择对自己最有利的规则。规则执行后，则庄家收获所有匣子上剩余的押注。
     * 乍一看起来，好像规则对玩家有利，庄家吃亏。但经过大量实战，会发现局面很难说，于是怀疑是否庄家做了手脚，
     * 庄家则十分爽快地说：可以由玩家提供骰子，甚至也可以由玩家来投掷骰子。 你的任务是：通过编程模拟该过程。模拟50万次，
     * 假定只有1个玩家，他每次的押注都是1元钱，其押注的匣子号是随机的。
     * 再假定庄家有足够的资金用于赔付。最后计算出庄家的盈率（庄家盈利金额/押注总金额）。 【输入、输出格式要求】
     * 程序无输入，程序运行输出庄家的盈率，四舍五入保留到小数后3位。
     */
    public static void main(String[] args) {

        int sum = 0;// 假设庄家本钱为零，因为庄家的盈率（庄家盈利金额/押注总金额（500,000））

        for (int i = 0; i < 100000; i++) {
            int x = (int) (Math.random() * 6 + 1);// 玩家下注
            int a = (int) (Math.random() * 6 + 1);// 骰子随机数1号
            int b = (int) (Math.random() * 6 + 1);// 骰子随机数2号
            int c = (int) (Math.random() * 6 + 1);// 骰子随机数3号

            if (x == a && x == b && x == c) {
                sum -= 6;
            } else if (x == a && x == b || x == a && x == c || x == b && x == c) {
                sum -= 2;
            } else if (x == a || x == b || x == c) {
                sum -= 1;

            } else if ((x * a == b * c) || (x * b == a * c) || (x * c == a * b)) {
                sum -= 0;
            } else {
                sum += 1;
            }
        }
        // System.out.println(sum/500000);
        System.out.printf("%.3f", sum / 100000f);// sum/500000f 为什么加f呢？？？？？？？
        /**
         * printf主要是继承了C语言的printf的一些特性，可以进行格式化输出 print就是一般的标准输出，但是不换行
         * println和print基本没什么差别，就是最后会换行 参照JAVA API的定义如下： 'd' 整数 结果被格式化为十进制整数 'o'
         * 整数 结果被格式化为八进制整数 'x', 'X' 整数 结果被格式化为十六进制整数 'e', 'E' 浮点
         * 结果被格式化为用计算机科学记数法表示的十进制数 'f' 浮点 结果被格式化为十进制数 'g', 'G' 浮点
         * 根据精度和舍入运算后的值，使用计算机科学记数形式或十进制格式对结果进行格式化。 'a', 'A' 浮点
         * 结果被格式化为带有效位数和指数的十六进制浮点数 println("test")相当于print("testn")就是一般的输出字符串
         * print, println, printf的区别: print将它的参数显示在命令窗口，并将输出光标定位在所显示的最后一个字符之后。
         * println 将它的参数显示在命令窗口，并在结尾加上换行符，将输出光标定位在下一行的开始。 
         * printf是格式化输出的形式。
         * */
    }

}

